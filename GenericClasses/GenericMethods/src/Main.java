import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1,2};
        ArrayList<Integer> al = ArrayListAux.toArrayList(array);
        System.out.println(al);
    }
}