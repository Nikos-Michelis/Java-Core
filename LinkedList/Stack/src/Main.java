import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> s = new LinkedList<>()
        s.push(2);
        s.push(4);
        System.out.println(s);
        System.out.println("elem popped: " + s.pop());
        s.push(5);
        s.push(3);
        System.out.println(s);

        while(true) {
            try {
                System.out.println("elem popped: " + s.pop());
            }
            catch (NoSuchElementException e) {
                break;
            }
        }
    }
}