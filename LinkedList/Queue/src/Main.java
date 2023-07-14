import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);

        System.out.println(q);
        System.out.println("elem removed: " + q.remove());

        q.add(5);
        q.add(3);
        System.out.println(q);

       
        //Method A
       /* while(q.peek()!=null)
            System.out.println("elem removed: " + q.remove());*/

        //Method B
        while(q.isEmpty())
            System.out.println("elem removed: " + q.remove());

    }
}