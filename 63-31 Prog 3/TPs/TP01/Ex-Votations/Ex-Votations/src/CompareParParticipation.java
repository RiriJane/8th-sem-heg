import java.util.Comparator;

public class CompareParParticipation implements Comparator<Result> {
    @Override
    public int compare(Result o1, Result o2) {
        return o1.compareParticipation(o2);
    }
}
