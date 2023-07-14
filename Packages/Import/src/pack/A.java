package pack;

public class A {
    int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
           // B b;
           pack.subpack.B b;
        return "A{" +
                "x=" + x +
                '}';
    }
}
