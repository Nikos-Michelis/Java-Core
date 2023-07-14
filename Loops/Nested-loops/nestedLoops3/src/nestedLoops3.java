public class nestedLoops2 {
    public static void main(String[] args) {
        final int N=
                5;
        for (int i=
             0; i<N; i++) {
            for (int j =
                 0; j < N-i-1; j++)
                System.out.print(" ");
            for (int j =
                 0; j < i+
                    1; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
                           //     i=0 j=4 4kena    *
                          //      i=1 j=3 3kena   **
                         //       i=2 j=2 2kena  ***
                        //        i=3 j=1 1keno ****
                       //         i=4 j=0 0kena*****