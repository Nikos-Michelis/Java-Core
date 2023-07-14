public class Main {
    public static void main(String[] args) {
        String s  = "a string";
        System.out.println(s + "(" + s.hashCode() +")");
        s = "another string"; 
        System.out.println(s + "(" + s.hashCode() +")");
        s = s + " some more";
        System.out.println(s + "(" + s.hashCode() +")");
    }
}