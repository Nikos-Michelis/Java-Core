import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static int readInt(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            System.out.print("Your choice: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice < lower || choice > upper) {
                    System.out.println("Error: Between 1 and 4");
                }
                else
                    return choice;
            }
            else {
                sc.next();
                System.out.println("Error: Invalid input");
            }
        }
    }
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        int choice;

        try(Scanner sc = new Scanner(System.in)) {
            boolean exit = false;
            while (!exit) {
                System.out.println("====Menu====");
                System.out.println("Insert String -press 1 ");
                System.out.println("Export String -press 2 ");
                System.out.println("Print String  -press 3 ");
                System.out.println("Exit!         -press 4: ");

                choice = readInt(sc, 1, 4);

                switch (choice) {

                    case 1:
                        System.out.print("Insert String: ");
                        //String stIn = sc.next();
                        if(!hs.add(sc.next())){
                        //if(!hs.contains(stIn)){
                            //hs.add(stIn);
                            System.out.println("This String already exists!");
                        }else{
                            System.out.println("String has been added to HasSet! ");
                        }
                        break;
                    case 2:
                        System.out.print("Remove String: ");
                        //String stRem = sc.next();
                        if(!hs.remove(sc.next())){

                        //if(hs.contains(stRem)){
                            //hs.remove(stRem);
                            System.out.println("This String is not exists!");
                        }else{
                            System.out.println("String has been removed from HasSet! ");
                        }
                        break;
                    case 3:
                        String[] ar = new String[hs.size()];
                        hs.toArray(ar);
                        Arrays.sort(ar);
                        System.out.println(String.join(", ", ar));
                        break;
                    case 4:
                        exit = true;
                }
            }
        }
    }
}