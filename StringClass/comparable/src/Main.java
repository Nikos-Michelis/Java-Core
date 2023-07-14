import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] array = {new Person("John", "Snow"),
                new Person("Tywin", "Lannister"),
                new Person("Cersei", "Lannister")};
        Arrays.sort(array);
        for (Person p : array)
            System.out.println(p);

    }
}