package ch.hesge.services;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import ch.hesge.callback.CallBack;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@Path("/")
public class Service {

	/**
	 * 
	 * ........../service/calcule
	 */
	// A� implementer

	
	@GET
	@Path("/service/calcule")
	public String methode1(@HeaderParam(HttpHeaders.LOCATION)String url, @Context HttpServletResponse response)   {

		// Set status code 202
		response.setStatus(202);
		
		try {
			response.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Thread Callback
		new CallBack(url).run();
		
		return "";
	}


}
