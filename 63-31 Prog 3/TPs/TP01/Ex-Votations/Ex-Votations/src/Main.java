import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Result> lst = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        chargerResultats();
        afficherPlusGrandeCommune();
        System.out.println("=========================================================================================");
        afficherParOrdreAlphabetique();
        System.out.println("=========================================================================================");
        afficherParParticipation();
    }

    /** Lit le fichier results.csv et le conserve en mémoire dans une Collection */
    private static void chargerResultats() throws IOException {
        List<Result> results = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("results.csv"));
        String ligne;
        while((ligne = reader.readLine()) != null){
            String[] champ = ligne.split(";");

            try {
                Result res = new Result(champ[0],
                        Integer.parseInt(champ[1]),
                        Integer.parseInt(champ[2]),
                        Integer.parseInt(champ[3]),
                        Integer.parseInt(champ[4]));

                results.add(res);

            }catch (NumberFormatException | IndexOutOfBoundsException e){
                System.out.println("Ligne non traitee : " + ligne);
            }

        }

        lst = results;
    }

    /** Affiche le résultat de la plus grande commune (plus grand nombre d'électeurs) */
    private static void afficherPlusGrandeCommune() {
        System.out.println("Plus grande commune : ");
        Result res = lst.get(0);
        for(Result r : lst){
            if(r.getNbElecteurs() > res.getNbElecteurs()){
                res = r;
            }
        }
        System.out.println(res);
    }

    /** Affiche tous les résultats, triés par nom de commune */
    private static void afficherParOrdreAlphabetique() {
        lst.sort(null);
        afficherResultats();
    }

    /** Affiche tous les résultats, triés du plus grand taux de participation au plus petit */
    private static void afficherParParticipation() {
        lst.sort(new CompareParParticipation());
        afficherResultats();
    }

    private static void afficherResultats(){
        for(Result result : lst){
            System.out.println(result);
        }
    }
}