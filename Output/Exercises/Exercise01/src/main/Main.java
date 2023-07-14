package main;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Person[] array = new Person[5];

        array[0] = new Person("Nikos Michelis",1500.0);
        array[1] = new Person("Dimitris Psounis",5000.0);
        array[2] = new Person("Apostolos Papadopoulos",500.0);
        array[3] = new Person("Dimitris dimitriou",1000.0);
        array[4] = new Person("Nikos nikolaou",100.0);


        System.out.print("+");
        for(int i=0;i<3;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<20;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<9;i++) {System.out.print("-");}
        System.out.println("+");

        for(int i=0; i<array.length; i++) {
            System.out.print("| "+(i+1)+ " |");
            System.out.printf("%-20s|",array[i].getFullname());
            System.out.printf(Locale.US,"%9.2f|", array[i].getSalary());
            System.out.println();
        }
        System.out.print("+");
        for(int i=0;i<3;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<20;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<9;i++) {System.out.print("-");}
        System.out.print("+");

        System.out.println();
        System.out.println("=========formatting in one line=========");

        System.out.print("+");
        for(int i=0;i<3;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<20;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<9;i++) {System.out.print("-");}
        System.out.println("+");
        for(int i=0; i<array.length; i++) {
            System.out.printf(Locale.US,"| %d |%-20s | %9.2f |",(i+1),array[i].getFullname(),array[i].getSalary());
            System.out.println();
        }
        System.out.print("+");
        for(int i=0;i<3;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<20;i++) {System.out.print("-");}
        System.out.print("+");
        for(int i=0;i<9;i++) {System.out.print("-");}
        System.out.print("+");


    }
}