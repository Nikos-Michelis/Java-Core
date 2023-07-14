import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Number> al = new ArrayList<>();
        al.add(5); al.add(3); al.add(2.2);
        Demo.print(al);

        ArrayList<Integer> il = new ArrayList<>();
        il.add(5); il.add(3); il.add(2);
        Demo.print(il);
    }
}