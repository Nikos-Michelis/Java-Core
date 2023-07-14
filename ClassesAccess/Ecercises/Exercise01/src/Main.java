public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        for(int i=1; i<=5;i++)
            s.push(i);
        System.out.println("Pop1=> "+ s.pop()+" Pop2=> "+s.pop());
        for(int i=5; i<=8;i++)
            s.push(i);

        while(!s.empty()){
            System.out.println("Pop=> "+ s.pop());
        }
    }
}