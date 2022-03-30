package myclasses;

import java.io.*;
import java.net.SocketTimeoutException;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.config.*;
import org.apache.http.impl.client.*;
import org.apache.http.client.methods.*;

public class WaitingClient {

	public static void main(String[] args) throws Exception { 

		String url1 = "http://localhost:8080/DemoAtomRoomServer?limit=10000000";
		String url2 = "http://localhost:8080/DemoAtomRoomServer?limit=100";
		
		System.out.println("Starting");
		
		RequestConfig requestConfig = RequestConfig.custom()
				.setConnectionRequestTimeout(1)
				.setConnectTimeout(1)
				.setSocketTimeout(100).build();
		HttpClient client = HttpClientBuilder.create()
				.setDefaultRequestConfig(requestConfig).build();
		
		HttpGet request1 = new HttpGet(url1);
		
		try{
			HttpResponse response = client.execute(request1);
			System.out.println("First request");
			print( response);
		}
		catch(Exception e){
			System.out.println("Timeout");

			HttpGet request2 = new HttpGet(url2);
			HttpResponse response = client.execute(request2);
			print( response);
			}
		
	}

	public static void print(HttpResponse response) throws Exception {
		System.out.println(response.getStatusLine().getStatusCode());
		if(response.getStatusLine().getStatusCode() < 300) {
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity()
					.getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) result.append(line);
			System.out.println(result);
			System.out.println("Finish");
			}
	}
}






