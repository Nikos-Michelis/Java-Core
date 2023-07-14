import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();

        al.add(new Person("John", "Snow"));
        al.add( new Person("Tywin", "Lannister"));
        al.add(new Person("Cersei", "Lannister"));
        System.out.println("========ArrayList=======");
        System.out.println("==Not Sorted==");
        System.out.println(al);
        Collections.sort(al);
        System.out.println("===Sorted===");
        System.out.println(al);

        System.out.println("=========Array===========");
        Person[] array = {new Person("John", "Snow"),
                new Person("Tywin", "Lannister"),
                new Person("Cersei", "Lannister")};
        Arrays.sort(array);
        for (Person p : array)
            System.out.println(p);

    }
}