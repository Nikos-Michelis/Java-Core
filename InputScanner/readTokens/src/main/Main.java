package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        while(!s.equals("q")) {
            System.out.print("Type a toke: ");
            s = sc.next();
            System.out.println("Token: " + s);
        }
        sc.close();
    }
}