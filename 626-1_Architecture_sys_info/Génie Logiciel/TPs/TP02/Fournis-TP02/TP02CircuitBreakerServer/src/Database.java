
import java.io.*;
import java.net.URLDecoder;


/**
Lit dans un fichier texte un compteur qui est incrémenté
*/
public class Database {

	private static final String PATH="cpt.txt";
	
	public String read () {
		try {
			String s = Database.class.getClassLoader().getResource(PATH).getPath();
			String fullPath = URLDecoder.decode(s, "UTF-8");
			BufferedReader reader = new BufferedReader(new FileReader(fullPath));
			String line = reader.readLine();
			reader.close();
			return line.toString();
		}
		catch (FileNotFoundException e0) {e0.printStackTrace(); return "";}
		catch (IOException e1) {e1.printStackTrace(); return "";}
		catch(NullPointerException e2) {return "0";}
	} // read
	
	
	public  void initialiser () {
		try {
	    	String resourceT = Database.class.getClassLoader().getResource(PATH).getPath().toString();
	    	String fullPath2 = URLDecoder.decode(resourceT, "UTF-8");
		    File x = new File(fullPath2);
		    PrintWriter pw=new PrintWriter(x);
		    pw.println("0");
		    pw.flush();
		    pw.close();
	    }
	    catch (FileNotFoundException e0) {e0.printStackTrace(); }
	    catch (IOException e1) {e1.printStackTrace(); }
	  } // initialiser

	
	public int incRead () {
		try {
	    	String is = Database.class.getClassLoader().getResource(PATH).getPath();
	    	String fullPath = URLDecoder.decode(is, "UTF-8");
		    BufferedReader reader = new BufferedReader(new FileReader(fullPath));
		    String line = reader.readLine();
		    reader.close();
		    String resourceT = Database.class.getClassLoader().getResource(PATH).getPath().toString();
		    String fullPath2 = URLDecoder.decode(resourceT, "UTF-8");
		    File x = new File(fullPath2);
		    Integer cpt=Integer.parseInt(line.toString().trim());
		    PrintWriter pw=new PrintWriter(x);
		   	pw.println((++cpt).toString().trim());
		    pw.flush();
		    pw.close();
		    return cpt;
	    }
		catch (FileNotFoundException e0) {e0.printStackTrace(); }
	    catch (IOException e1) {e1.printStackTrace(); }
		return 10;
	} // incRead

} // ReadFile