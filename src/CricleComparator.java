
import java.util.Comparator;

public class CricleComparator implements Comparator<Cricle> {

    @Override
    public int compare(Cricle o1, Cricle o2) {
        if (o1.getRadius() > o2.getRadius())
            return 1;
        else if (o1.getRadius() < o2.getRadius())
            return -1;
        else
            return 0;
    }
}
