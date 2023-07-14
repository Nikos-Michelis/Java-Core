import java.util.Random;
public class Exercise04 {
    public static void main(String[] args) {

        final int N=10;
        Random r =new Random();
        int[] array = new int[N];
        int sum;
        double average=1;

        for(var i=0; i<N; i++){
            array[i]=r.nextInt(1000);
            System.out.print(" " + array[i]);
        }
        sum=0;
        for (var elem : array){
            sum += elem;
        }
        average = (double)sum/N;
        System.out.println("\nAverage is:" + average);

    }
}