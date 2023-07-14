public class Main {

    public static void box(Object ob, int padding){

   //Method A
        System.out.print("+");
        for(int i = 0; i<2*padding + String.valueOf(ob).length(); i++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.print("\n|"+" ".repeat(padding)+ ob +" ".repeat(padding)+"|"+"\n");
        System.out.print("+");
        for(int i = 0; i<2*padding + String.valueOf(ob).length(); i++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println(" ");
    }
   //Method B
    public static void f(Object o, int padding) {

        System.out.println("+" + "-".repeat(2*padding + String.valueOf(o).length()) +"+");
        System.out.println("|" + " ".repeat(padding) + o + " ".repeat(padding) + "|");
        System.out.println("+" + "-".repeat(2*padding + String.valueOf(o).length()) +"+");
    }

    public static void main(String[] args) {

        box(5,3);//metatrpoume ta primitive se symboloseira
        box("a string",3);

        f(5,3);
        f("a string",3);
    }
}