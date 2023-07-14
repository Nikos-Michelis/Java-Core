import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snack s = new Snack();
        s.read(sc);
        s.print();

        TropicalFruit t = new TropicalFruit();
        t.read(sc);

        t.print();
        sc.close();
    }
}