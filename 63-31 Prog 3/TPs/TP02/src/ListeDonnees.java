import java.util.ArrayList;
import java.util.List;

public class ListeDonnees<T extends Valorisable> extends Calcule<Double>{
    private List<T> lstDonnees = new ArrayList<T>();

    @Override
    public Double total() {
        double somme = 0;
        for(T obj : lstDonnees){
            somme += obj.getValue();
        }
        return somme;
    }

    @Override
    public Double moyenne() {
        double somme = total();
        double result = somme / lstDonnees.size();
        return result;
    }

    public void addObject(T objet){
        if(objet!=null)   lstDonnees.add(objet);
    }
}
