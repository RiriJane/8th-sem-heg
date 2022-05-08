import java.util.Objects;

public class Result implements Comparable{
    private String commune;
    private int nbElecteurs;
    private int nbOui;
    private int nbNon;
    private int nbBlanc;

    public Result(String commune, int nbElecteurs, int nbOui, int nbNon, int nbBlanc) {
        this.commune = commune;
        this.nbElecteurs = nbElecteurs;
        this.nbOui = nbOui;
        this.nbNon = nbNon;
        this.nbBlanc = nbBlanc;
    }

    public int getNbElecteurs() {
        return nbElecteurs;
    }

    private int calculeTaux(){
        return 100 * (nbOui+nbNon+nbBlanc) / nbElecteurs;
    }

    @Override
    public String toString() {
        return commune + " (" + nbElecteurs + " electeurs, participation: " + calculeTaux() + "%) : " + nbOui + " oui, " + nbNon + " non";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return commune.equals(result.commune);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commune);
    }

    @Override
    public int compareTo(Object o) {
        return commune.compareToIgnoreCase(((Result)o).commune);
    }

    public int compareParticipation(Object o){
        return ((Result)o).calculeTaux() - calculeTaux();
    }
}