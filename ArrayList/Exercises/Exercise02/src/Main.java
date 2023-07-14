import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();//dimiourgia arraylist apo xarakthres
        char c = 'a';

        for (int i = 0; i < 26; i++) {
            al.add(c);
            c++;
        }
        System.out.println(al + "\nSize: " + al.size());
        al.set(25, 'a');
        // System.out.println("First 'a': " + al.indexOf('a') + ", Last 'a':" + al.lastIndexOf('a'));
        // System.out.println(al.isEmpty());

        ArrayList<Character> al2 = new ArrayList<>();
       /* char c2 = 'k';
        for (int i = 0; i < 16; i++) {
            al2.add(c2);
            c2++;
        }*/
        for (char e ='k'; e<='z'; e++) {
            al2.add(e);
        }
        System.out.println(al2 + "\nSize: " + al2.size());
        System.out.println(al.containsAll(al2));
        System.out.println(al);
    }
}