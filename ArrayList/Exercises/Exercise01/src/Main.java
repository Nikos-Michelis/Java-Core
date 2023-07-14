import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      ArrayList<Integer> listOdd= new ArrayList<>(1000);
      for(int i = 1; i<1000; i++){
          listOdd.add(i);
      }
      ArrayList<Integer> listEven = new ArrayList<>(500);

        for(int i = 2; i<1000; i+=2){
            listEven.add(i);
        }
        listOdd.removeAll(listEven);
        System.out.println(listOdd);
    }
}