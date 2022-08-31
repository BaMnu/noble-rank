import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Person> compareNoble = (o1, o2) -> {
            int maxWords = 3;
            if ((o1.words >= maxWords) && (o2.words >= maxWords)) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else if (o2.words != o1.words) {
                return Integer.compare(o2.words, o1.words);
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };

        Set<Person> noblePeople = new TreeSet<>(compareNoble);
        noblePeople.add(new Person("Jason", "Brown", 33));
        noblePeople.add(new Person("Trevor", "Rose Parker Stone", 23));
        noblePeople.add(new Person("Tilda", "Rose Parker Stone", 60));
        noblePeople.add(new Person("Marisha", "Walsh Love", 40));
        noblePeople.add(new Person("Jacob", "Gray Richardson", 26));
        noblePeople.add(new Person("Peter", "Harris Wilson Walker Owen", 21));
        noblePeople.add(new Person("Polly", "Harris Wilson Walker Owen", 25));


        int howNoble = 0;
        System.out.println("Rankings of nobility. From the noblest [1] to the least noble [7].");

        for (Person person : noblePeople) {
            howNoble++;
            System.out.println(howNoble + ". " + person);
        }
    }
}