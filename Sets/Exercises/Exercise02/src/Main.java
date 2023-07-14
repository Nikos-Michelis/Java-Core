import java.util.*;

public class Main {

    public static void main(String[] args) {

    TreeSet<Integer> ts = new TreeSet<>(new TreeSetComparator());
    ts.add(1);
    ts.add(2);
    ts.add(3);
    ts.add(4);
    ts.add(5);

    for(var elem: ts)
        System.out.println(elem);
    }
}