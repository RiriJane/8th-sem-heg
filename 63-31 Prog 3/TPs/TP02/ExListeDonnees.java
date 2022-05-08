/** TAD & Type générique
	 @author Ch. Stettler - HEG-Genève 
*/
import java.util.*;

public class ExListeDonnees {

	public static void main (String[] args) {
		LstDonneesV3<Produit> lstP = new LstDonneesV3A<>();
		lstP.add(new Produit(1,"AA",11)); lstP.add(new Produit(2,"BB",22)); lstP.add(new Produit(3,"CC",33)); lstP.add(new Produit(4,"DD",44));
		System.out.println("Total=" + lstP.total() + "; Moyenne=" + lstP.moyenne());
		System.out.println(lstP.remove(1)); System.out.println(lstP.remove(0));
		System.out.println("Total=" + lstP.total() + "; Moyenne=" + lstP.moyenne()); System.out.println();

		LstDonneesV3<Compte> lstC = new LstDonneesV3A<>();
		lstC.add(new Compte(111,1111.1)); lstC.add(new Compte(222,2222.2)); lstC.add(new Compte(333,3333.3)); lstC.add(new Compte(444,4444.4));
		System.out.println("Total=" + lstC.total() + "; Moyenne=" + lstC.moyenne());
		System.out.println(lstC.remove(1)); System.out.println(lstC.remove(0));
		System.out.println("Total=" + lstC.total() + "; Moyenne=" + lstC.moyenne()); System.out.println();
		if (lstC.contains(new Compte(333,0.0))) { System.out.println("Oui"); } else {System.out.println("Non"); }
	}
}

// ============================================================================

interface Valorisable {
	public double valeur();
}

class Produit implements Valorisable {
	private int no;
	private String nom;
	private int prix;
	public Produit(int no, String nom, int prix) { this.no=no; this.nom=nom; this.prix=prix; }
	public boolean equals(Object o) { return no==((Produit)o).no; }
	public double valeur() { return prix; }
	public String toString() { return "Produit "+no+": "+nom+" "+prix+".-"; }
}

class Compte implements Valorisable {
	private int no;
	private double solde;
	public Compte(int no, double solde) { this.no=no; this.solde=solde; }
	public boolean equals(Object o) { return no==((Compte)o).no; }
	public double valeur() { return solde; }
	public String toString() { return "Compte "+no+": "+solde; }
}

// ============================================================================
// ===  V1: la classe LstDonnees wrappe (contient/enveloppe) une List  ========
// ============================================================================
// Il faut redéfinir (et déléguer) toutes les méthodes d'accès à la liste (add, get, remove, ...)

class LstDonneesV1<T extends Valorisable> {
	private List<T> lst;  // la classe LstDonneesV1 contient une liste

	public LstDonneesV1() { lst = new ArrayList<>(); }

	public boolean add(T val) { lst.add(val); return true; }
	public T get(int pos) { return lst.get(pos); }
	public T remove(int pos) { T val = lst.get(pos); lst.remove(pos); return val; }

//	public double total() { double tot=0; for (int i=0; i<lst.size(); i++) { tot += lst.get(i).valeur(); } return tot; }
	public double total() { double tot=0; for (T data : lst) { tot += data.valeur(); } return tot; }
	public double moyenne() { return total() / lst.size(); }
}

// ============================================================================
// ===  V2: la classe LstDonnees EST (dérive/extends) une List (ArrayList) ====
// ============================================================================
// Toutes les méthodes d'accès à la liste sont automatiquement dérivées

class LstDonneesV2<T extends Valorisable> extends ArrayList<T> {
	public double total() { double tot=0; for (int i=0; i<size(); i++) { tot += get(i).valeur(); } return tot; }
//	public double total() { double tot=0; for (T data : this) { tot += data.valeur(); } return tot; }
	public double moyenne() { return total() / size(); }
}

// ===============================================================================================
// ===  V3: TAD: on crée un interface spécifiant uniquement les fonctionnalités de LstDonnees  ===
// ===============================================================================================
// Il faut définir un interface pour la déclaration des variables/paramètres dans les applications

interface LstDonneesV3<T extends Valorisable> extends List<T> {
	double total();
	double moyenne();
}

class LstDonneesV3A<T extends Valorisable> extends ArrayList<T> implements LstDonneesV3<T> {
	public double total() { double tot=0; for (T data : this) { tot += data.valeur(); } return tot; }
	public double moyenne() { return total() / size(); }
}