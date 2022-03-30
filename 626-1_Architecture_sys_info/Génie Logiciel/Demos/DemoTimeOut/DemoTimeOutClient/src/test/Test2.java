package test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Test2 {

	public static void main(String[] args) {
		try{
			String url = "http://localhost:8080/DemoAtomRoomServer?limit=1000000";
		
			System.out.println("Starting");
		
			HttpClient client = HttpClientBuilder.create().build();
		
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);
			System.out.println(response.getStatusLine().getStatusCode());
		} catch (Exception e) {e.printStackTrace();}
	}
}
