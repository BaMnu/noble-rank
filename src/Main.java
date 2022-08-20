import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>();
        noblePeople.add(new Person("Jason", "Brown", 33));
        noblePeople.add(new Person("Trevor", "Rose Parker Stone", 23));
        noblePeople.add(new Person("Tilda", "Rose Parker Stone", 60));
        noblePeople.add(new Person("Marisha", "Walsh Love", 40));
        noblePeople.add(new Person("Jacob", "Gray Richardson", 26));
        noblePeople.add(new Person("Peter", "Harris Wilson Walker Owen", 21));
        noblePeople.add(new Person("Polly", "Harris Wilson Walker Owen", 25));

        int howNoble = 0;
        System.out.println("Rankings of nobility. From the noblest [1] to the least noble [7].");

        Collections.sort(noblePeople, new PersonSurnameNobilityComparator());
        for (Person person : noblePeople) {
            howNoble++;
            System.out.println(howNoble + ". " + person);
        }

//        System.out.println(noblePeople);
    }
}