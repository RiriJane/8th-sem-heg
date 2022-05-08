import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static final String FILENAME = "results.csv";
    private static ArrayList<Result> results;

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
        results = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String ligne;
        while ((ligne = reader.readLine()) != null) {
            try {
                String[] champs = ligne.split(";");
                results.add(new Result(champs[0], Integer.parseInt(champs[1]), Integer.parseInt(champs[2]), Integer.parseInt(champs[3]), Integer.parseInt(champs[4])));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) { System.out.println("Erreur! ligne non traitée: " + ligne); }
        }
        reader.close();
    }

    /** Affiche le résultat de la plus grande commune (plus grand nombre d'électeurs) */
    private static void afficherPlusGrandeCommune() {
        Result pg = results.get(0);
        for (int i = 1; i< results.size(); i++) { if (results.get(i).plusGrand(pg)) { pg = results.get(i); } }
        System.out.println("Plus grande commune : " + pg);
    }

    /** Affiche tous les résultats, triés par nom de commune */
    private static void afficherParOrdreAlphabetique() {
        results.sort(null);
        afficherResultats();
    }

    /** Affiche tous les résultats, triés du plus grand taux de participation au plus petit */
    private static void afficherParParticipation() {
        results.sort(new CompareParParticipation());
        afficherResultats();
    }

    /** Affiche tous les résultats */
    private static void afficherResultats() {
        for (Result res : results) { System.out.println(res); }
    }
}