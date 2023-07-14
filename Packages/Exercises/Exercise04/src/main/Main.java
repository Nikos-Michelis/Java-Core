package main;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        for (int i=0; i<array.length; i++)
            array[i] = r.nextInt(6);

        for (int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");

        Arrays.sort(array);

        for (int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");

        System.out.println("Position: " + Arrays.binarySearch(array, 3));
    }
}

