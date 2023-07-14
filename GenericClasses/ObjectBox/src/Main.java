public class Main {

    public static void main(String[] args) {
        Box<Integer> i = new Box<>(5);
        Box<String> s = new Box<>("some string");
        System.out.println(i.getData() + " " + s.getData());

        Integer iv = i.getData();
        String sv = s.getData();

        ObjectBox io = new ObjectBox(5);
        ObjectBox is = new ObjectBox("some string");

        iv = (Integer) io.getData();//Type Casting
        //sv = (String) io.getData();
        System.out.println(iv + " " + sv);
    }
}