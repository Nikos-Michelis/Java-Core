import java.util.Random;

public class Main {

    public static void main(String[] args) {

        FuncInter f = (n1, n2)-> n1 > n2;
        System.out.println(f.func(3,5));


        f = (n1, n2)-> n1 % 2 == 0 && n2 % 2 == 0;
        System.out.println(f.func(4,2));
    }
}