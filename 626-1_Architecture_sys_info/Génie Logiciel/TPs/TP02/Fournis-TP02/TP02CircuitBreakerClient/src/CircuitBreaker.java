
import java.net.URI;
import java.util.HashMap;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

import myclasses.CircuitBreakerException;


public class CircuitBreaker {
	
	// Garde l'info sur l'�tat de chaque server, sa cl� est l'url
	private static HashMap<String,ServerState> serviceState = new HashMap<String,ServerState>();
	
	
	//M�thode � modifier
	public HttpResponse execute(HttpUriRequest request, HttpClient client) throws Exception {
		System.out.println("hereeeee");
		
		URI uri = request.getURI();
		String path = getFullPath(uri);
		HttpResponse response = null;
		int cpt = 0;
		
		// après 4 requêtes, le circuit est fermé
		// vérifier si l'uri existe déjà dans la HashMap
		if(!serviceState.containsKey(path)) {
			serviceState.put(path, new ServerState(path));
		}
		
		System.out.println("here");

		if(checkState(uri)==StateLabel.closed) {
			System.out.println("Le circuit est fermé............");
			
			try {
				System.out.println("Lance la requête vers le serveur........");
				response = client.execute(request);
				if(response.getStatusLine().getStatusCode() >= 500) {
					open(uri);
				}
				
			}catch(Exception e) {
				open(uri);
				e.printStackTrace();
			}
			
		}	else if(checkState(uri)==StateLabel.open) {
			
			System.out.println("Le circuit est ouvert............");
			while(cpt > 3) {
				try {
					response = client.execute(request);
					if(response.getStatusLine().getStatusCode() >= 500) {
						open(uri);
					}
				}catch(Exception e) {
					half_open(uri);
					throw new CircuitBreakerException();
				}
				cpt++;
			}
			
		}else if(checkState(uri)==StateLabel.half_open) {
			System.out.println("Le circuit est à moitié ouvert............");
			while(cpt > 3) {
				try {
					response = client.execute(request);
					if(response.getStatusLine().getStatusCode() >= 500) {
						open(uri);
					}else {
						
						System.out.println(response.getStatusLine().getStatusCode());
					}
				}catch(Exception e) {
					open(uri);

					throw new CircuitBreakerException();
				}
				cpt++;
			}
			
		}
		return response;
	}
	
	// Retourne l'�tat d'uri envoy�
	private StateLabel checkState(URI uri){
        String path = getFullPath(uri);
        if(serviceState.containsKey(path)) {
             if((serviceState.get(path)).getStatLabel().equals(StateLabel.open)) {return StateLabel.open;}
             else if((serviceState.get(path)).getStatLabel().equals(StateLabel.half_open)) {return StateLabel.half_open;}
        }
        return StateLabel.closed;
	}	
	//Set the circuit breaker to open for the service
	private void open(URI uri){
		String path = getFullPath(uri);
		(serviceState.get(path)).setStatLabel(StateLabel.open);
	}
	//Set the circuit breaker to close for the service
	private void close(URI uri){
		String path = getFullPath(uri);
		(serviceState.get(path)).setStatLabel(StateLabel.closed);
	}
	
	//Set the circuit breaker to close for the service
	private void half_open(URI uri){
		String path = getFullPath(uri);
		(serviceState.get(path)).setStatLabel(StateLabel.half_open);
	}
	//Return the full path of the uri (removing query parameters)
	private String getFullPath(URI uri){
		String path = uri.toString();
		int index = path.indexOf("?");
		if(index > 1)
			path = path.substring(0,index);
		return path;
	}
}
