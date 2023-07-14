import java.util.Random;

public class Main {

    public static void main(String[] args) {
        FuncInter f = ()->5;
        System.out.println(f.func());

        Random r = new Random();
        FuncInter f2 = ()-> r.nextInt(10);
        System.out.println(f2.func());
    }
}