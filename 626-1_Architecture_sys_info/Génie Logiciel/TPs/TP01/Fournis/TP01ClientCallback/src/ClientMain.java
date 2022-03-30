
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.impl.client.*;

import ch.hesge.services.Service;

import org.apache.http.client.methods.*;

public class ClientMain {

	public static void main(String[] args) throws Exception { 
		String url = "http://localhost:8080/TP01ServiceCallback/service/calcul";
		
		// Client
		HttpClient client = HttpClientBuilder.create().build();
		
		// Query GET
		HttpGet request = new HttpGet(url);
		
		// Setting header location to indicate the location of methode1 /serviceCallback/Resultat
		// This will invoke methode1(String requete,@Context HttpServletResponse response)
		request.setHeader(HttpHeaders.LOCATION, "http://localhost:8080/TP01ServiceCallback/serviceCallback/resultat");
		
		// Executing query
		client.execute(request);
		
		
		
   }
}
