import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("CB/")
public class EntryPoint {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String longWaitLoop(@QueryParam("limit") int limit) {
		
		// Simulation du fait qu'apres quelques requetes, les performances du serveur s'ameliorent.
		Database db = new Database();
		int rCpt = db.incRead();
		double total = 0;
		if (rCpt < 10) {
			for (int i = 1; i < limit; i++) {
				total = total + Math.log(i);
			}
		} else {
			db.initialiser();
		}
		return Double.toString(total);
	}
}
