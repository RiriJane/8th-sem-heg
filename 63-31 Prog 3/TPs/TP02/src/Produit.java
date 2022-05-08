public class Produit implements Valorisable{
    private int no;
    private String nom;
    private double prix;

    public Produit(int no, String nom, double prix) {
        this.no = no;
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public double getValue() {
        return this.prix;
    }
}
