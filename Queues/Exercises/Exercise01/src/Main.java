import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<PrioritizedPerson> q = new PriorityQueue<>(new PrioritizedPersonComparator());

        q.add(new PrioritizedPerson("A", "A",4));
        q.add(new PrioritizedPerson("B", "B",2));
        q.add(new PrioritizedPerson("C", "C",3));
        q.add(new PrioritizedPerson("D", "D",1));

        while (!q.isEmpty()){

            System.out.println(q.remove());

        }
    }
}
