package main;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double sum = 0;
        double avg=1;
        int counter=0;
        while (true) {
            System.out.print("Type some Double and (q) to quit: ");
            if (sc.hasNextDouble()){
                sum += sc.nextDouble();
                counter++;
                avg = (double) sum / counter;
             }else {
                if (sc.next().equals("q"))
                    break;
                System.out.println("Only Doubles please!");
            }
        }
        if(counter==0)
            System.out.println("error! 0 numbers entered");
        System.out.println("Their sum is " + avg);

        sc.close();
    }
}