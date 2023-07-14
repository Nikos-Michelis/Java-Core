import java.util.*;

public class Main {

    public static String binary(int number){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        while (number > 0) {
            deque.push(number % 2);
            number = number/2;
        }
        ArrayList<String> BinaryResult  = new ArrayList<>();
        while(!deque.isEmpty()) {
             BinaryResult.add(deque.pop().toString());
        }
        return String.join(" ", BinaryResult);
    }
    public static void main(String[] args) {

        for(int i = 0; i < 200; i++){
            System.out.printf("%3d: %s\n", i, binary(i));
        }
    }
}
