import java.util.Arrays;
import java.util.Comparator;


class CricleComparatorTest {
    public static void main(String[] args) {
        Cricle[] cricles = new Cricle[3];
        cricles[0] = new Cricle(3.6);
        cricles[1] = new Cricle();
        cricles[2] = new Cricle("indigo", false, 3.5 );

        System.out.println("Pre-sorted: ");
        for (Cricle cricle: cricles){
            System.out.println(cricle);
        }
        System.out.println("--------------------");

        Comparator circleComparator = new CricleComparator();
        Arrays.sort(cricles, circleComparator);

        System.out.println("After-sorted: ");
        for (Cricle cricle: cricles){
            System.out.println(cricle);
        }

    }

}