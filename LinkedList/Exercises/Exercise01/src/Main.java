import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Main {

    public static void init(LinkedList<Integer> List, int numbers, int bound){
        Random r = new Random();
        int i = 0;
        while (i < numbers) {
            int num = r.nextInt(bound);
            if (!List.contains(num)) {
                List.add(num);
                i++;
            }
        }
        System.out.println(List);
    }
    public static void main(String[] args) {

        LinkedList<Integer> List1 = new LinkedList<>();
        LinkedList<Integer> List2 = new LinkedList<>();

        System.out.println("====List1====");
        init(List1,10,20);
        System.out.println("====List2====");
        init(List2,20,40);
        LinkedList<Integer> ListDomain = new LinkedList<>();
        for (var elem: List1) {
          if(List2.contains(elem)){
              ListDomain.add(elem);
          }
        }
        System.out.println("====ListDomain====");
        System.out.println(ListDomain);
    }
}
