package main;

import java.util.Random;
public class Main {

    public static void main(String[] args){
        Random r = new Random();

        for(int i=0; i<10; i++){
            System.out.println(r.nextDouble(10));
        }
        System.out.println("============Method A============");
        for(int i=0; i<10; i++){
            System.out.println(20.0+r.nextDouble(10.0));
        }
        System.out.println("===========Method B=============");
        for(int i=0; i<10; i++){
            System.out.println(20+r.nextDouble()*10);

        }
    }
}
