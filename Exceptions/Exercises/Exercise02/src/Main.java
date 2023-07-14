import java.util.Random;
public class Main {

    public static void main(String[] args) {
      int[] array = new int[10];

        try {
            Random r = new Random();
            for(int i=0; i<10;i++){
                array[i] = r.nextInt(10);
            }
            System.out.println("Position: " +array[11] );
        } catch (ArrayIndexOutOfBoundsException ob) {
            System.out.println("Array position does not exists!");
        }
    }
}