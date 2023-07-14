package main;
import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        String[] arr = new String[3];

        q.add("Bob");
        q.add("Tom");

        // Print queue
        System.out.println(q);

        // Remove first
        System.out.println("Removing: " + q.remove());

        // Add
        q.add("Pam");
        System.out.println("Added 'Pam' ");

        System.out.println(q.size() + " elements in queue");

        String element;
        try {
            while (true) {
                System.out.println("Remove: " + q.remove());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty! ");
        }
    }
}

