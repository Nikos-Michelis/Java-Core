public class Exercise02 {
    public static void main(String[] args) {
        int N = 4, M = 3, sum;
        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                array[i][j] = i + j;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(array[i][j] + " ");
            System.out.println("");
        }
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < M; j++)
                sum += array[i][j];
            System.out.println(i + "i grammi: " + sum);
        }

        for (int j = 0; j < M; j++) {
            sum = 0;
            for (int i = 0; i < N; i++)
                sum += array[i][j];
            System.out.println(j + "i stili: " + sum);
        }
    }
}