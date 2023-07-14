import java.util.Scanner;
public class Main {
    public static String getName(Scanner sc) {

        System.out.print("Give Your Name: ");
        String name = sc.next().strip().toLowerCase();

        return String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(getName(sc));
        }
    }
}
