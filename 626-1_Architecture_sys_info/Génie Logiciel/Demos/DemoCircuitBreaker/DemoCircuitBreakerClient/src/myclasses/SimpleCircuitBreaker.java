package myclasses;

import java.net.URI;
import java.util.HashMap;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

public class SimpleCircuitBreaker {
	
	private static HashMap<String,StateLabel> serviceState = new HashMap<String,StateLabel>();
	
	//clears the URL state database
	public static void clear(){serviceState = new HashMap<String,StateLabel>();}
	
	public HttpResponse execute(HttpUriRequest request, HttpClient client) throws Exception{
		URI uri = request.getURI();
		HttpResponse response = null;
		if(checkState(uri)){
			try{
				response = client.execute(request);
				if(response.getStatusLine().getStatusCode()>= 500) open(uri);
			}
			catch(Exception e){
				open(uri);
				throw e;
				}
		}
		else throw new CircuitBreakerException();
		
		return response;
	}
	
	//returns true if service can be reached
	private boolean checkState(URI uri){
		String path = getFullPath(uri);
		if(serviceState.containsKey(path))
			return serviceState.get(path).equals(StateLabel.closed);
		else return true;
	}
	//set the circuit breaker to open for the service
	private void open(URI uri){
		String path = getFullPath(uri);
		serviceState.put(path,StateLabel.open);
	}
	//set the circuit breaker to close for the service
	private void close(URI uri){
		String path = getFullPath(uri);
		serviceState.put(path,StateLabel.closed);
		}
	//returns the full path of the uri (removing query parameters)
	private String getFullPath(URI uri){
		String path = uri.toString();
		int index = path.indexOf("?");
		if(index > 1)
			path = path.substring(0,index);
		return path;
	}
	

}


