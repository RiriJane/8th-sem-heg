public class App {

    public static void main(String[] args) {
        ListeDonnees<Produit> lstProduits = new ListeDonnees<Produit>();

        Produit p1 = new Produit(1, "Clavier", 81.98);
        Produit p2 = new Produit(2, "Souris", 935.56);
        Produit p3 = new Produit(3, "Ecanr", 461.35);

        lstProduits.addObject(p1);
        lstProduits.addObject(p2);
        lstProduits.addObject(p3);

        System.out.println("Total produits: " + lstProduits.total());
        System.out.println("Moyenne produits: " + lstProduits.moyenne());

        ListeDonnees<Compte> lstComptes = new ListeDonnees<Compte>();

        Compte c1 = new Compte(1, 81.98);
        Compte c2 = new Compte(2, 935.45);
        Compte c3 = new Compte(3,  461.98);

        lstComptes.addObject(c1);
        lstComptes.addObject(c2);
        lstComptes.addObject(c3);

        System.out.println("Total compte: " + lstComptes.total());
        System.out.println("Moyenne compte: " + lstComptes.moyenne());

    }
}
