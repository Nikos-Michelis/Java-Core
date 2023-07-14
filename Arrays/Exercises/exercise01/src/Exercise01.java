public class Exercise01 {
    public static void main(String[] args) {
        int[] array = {3, 8, 9, 10, 3, 4, 12, 9, 8, 10};
        int i, x = 12;

        for (i=0; i<10; i++)
            if (array[i]==x) {
                System.out.println("vrethike stin thesi " + i);
                break;
            }

        if (i==10)
            System.out.println("Den vrethike!");
    }

}
