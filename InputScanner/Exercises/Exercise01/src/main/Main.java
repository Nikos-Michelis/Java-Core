package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n\t.]");
        String s="";
        while(!s.equals("q")) {
            System.out.print("Type a tokenf: ");
            s = sc.next();
            System.out.println("Token: " + s);
        }
        sc.close();
    }
}