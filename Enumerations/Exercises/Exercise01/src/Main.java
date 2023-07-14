import java.util.Locale;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            Day d = null;

            try{
                while(d==null) {
                    System.out.print("Give Day: ");
                    String day = sc.next().toUpperCase();
                    d = Day.valueOf(day);
                }
            }catch (IllegalArgumentException e){
                System.out.println("Type a valid day moron!");
            }
            System.out.println(d);
        }
    }
}