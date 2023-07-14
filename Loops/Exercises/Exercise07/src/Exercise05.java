public class Exercise05 {
    public static void main(String[] args) {
        int i, k;
        for (i = 10; i <=20; i += 2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (i = 10; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        for (i = 19; i >=11; i -= 2) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (i = 1; i <= 29; i++) {
            if(i%2==1 && i%3==0) {
                System.out.print(i+" ");
            }
        }
    }
}