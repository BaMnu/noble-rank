import java.util.*;

public class PersonSurnameNobilityComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int maxWords = 3;
        if ((o1.words >= maxWords) && (o2.words >= maxWords)) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else if (o2.words != o1.words) {
            return Integer.compare(o2.words, o1.words);
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}
