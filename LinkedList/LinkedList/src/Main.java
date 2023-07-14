import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addFirst(5);
        l.addLast(2);
        l.addFirst(3);
        System.out.println(l);
        int elem = l.removeFirst();
        System.out.println("elem removed: " + elem);
        for (var v: l)
            System.out.println(v);
        System.out.println("size=" + l.size());
        System.out.println(l);
    }
}
