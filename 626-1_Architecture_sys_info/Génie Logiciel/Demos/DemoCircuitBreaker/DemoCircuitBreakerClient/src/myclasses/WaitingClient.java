package myclasses;

import java.io.*;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.config.*;
import org.apache.http.impl.client.*;
import org.apache.http.client.methods.*;

public class WaitingClient {

	public static void main(String[] args) throws Exception { 

		String url1 = "http://localhost:8080/DemoAtomRoomServer?limit=1000";
		String url2 = "http://localhost:8080/DemoAtomRoomServer?limit=1000000000";
		SimpleCircuitBreaker.clear();
		
		RequestConfig requestConfig = RequestConfig.custom()
				.setConnectionRequestTimeout(1)
				.setConnectTimeout(1)
				.setSocketTimeout(50).build();
		HttpClient client = HttpClientBuilder.create()
				.setDefaultRequestConfig(requestConfig).build();
		
		int loop = 0;
		while(loop <3){
				try{
					HttpGet request1;
					if (loop == 0) request1 = new HttpGet(url1);
					else request1 = new HttpGet(url2);
					System.out.println("trying");
					HttpResponse response = new SimpleCircuitBreaker().execute(request1, client);
					print(response);
					System.out.println("done");
				}
				catch(Exception e){
					System.out.println(e.getClass().getName());
					System.out.println("do something else");
				}
			loop++;
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
			}
	}
}






