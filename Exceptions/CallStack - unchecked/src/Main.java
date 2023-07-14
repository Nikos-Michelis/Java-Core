import java.io.FileInputStream;
import java.io.IOException;

class Main {
    public static void h() {
         int a = 1/0;
    }
    public static void g() {
        h();
    }
    public static void f() {
            g();
            System.out.println("Error: Catched it at f()");
    }
    public static void main(String[] args) {
        f();
    }
}