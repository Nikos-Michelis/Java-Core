package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int x,y;

            while(true) {
                System.out.print("x=");
                if (sc.hasNextInt()) {
                    x = sc.nextInt();
                    break;
                }
                else {
                    System.out.println("Wrong Input!");
                    sc.next();
                }
            }

            while(true) {
                System.out.print("y=");
                if (sc.hasNextInt()) {
                    y = sc.nextInt();
                    break;
                }
                else {
                    System.out.println("Wrong Input!");
                    sc.next();
                }
            }

            System.out.println("x/y=" + x/y);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}