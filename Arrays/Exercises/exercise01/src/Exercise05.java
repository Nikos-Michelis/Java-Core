public class Exercise05 {
    public static void main(String[] args) {
        int k, sq;
        for (k=10; k>=0; k--) {
            sq=k*k;
            System.out.println(sq);
        }
        k=10;
        while(k>=0) {
            sq=k*k;
            System.out.println(sq);
            k--;
        }
        k=10;
        do {
            sq=k*k;
            System.out.println(sq);
            k--;
        } while(k>=0);
        for (int i= 0, j= 0; i<=5 && j<= 5; i++, j+= 2)
            System.out.println("i:" + i + ",j:" + j);

    }
}