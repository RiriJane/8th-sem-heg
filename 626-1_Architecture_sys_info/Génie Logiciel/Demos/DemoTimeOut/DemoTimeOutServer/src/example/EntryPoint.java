package example;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/")
public class EntryPoint {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String longWaitLoop(@QueryParam("limit") int limit) {

		double total = 0;
		for(int i=1;i< limit;i++){total = total + Math.log(i);}
		return Double.toString(total);
	}
}

