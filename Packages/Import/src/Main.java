import pack.A;
import pack.subpack.B;

public class Main {

    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(a);
        //pack.subpack.B b = new pack.subpack.B(5);
        B b = new B(5);
        System.out.println(b);
    }
}
