public class Main {
    public static void main(String[] args) {

        Object[] array = new Object[4];
        Integer i = 2;
        Double d = 2.1;
        Boolean b = true;
        String s = "Test";

        System.out.println(array[0] = i);
        System.out.println(array[1] = d);
        System.out.println(array[2] = b);
        System.out.println(array[3] = s);

        System.out.println("=======Auto Boxing=======");
        array[0] = 2;
        array[1] = 2.1;
        array[2] = true;
        array[3] = "Test";

        for(var elem: array){
            System.out.println(elem);
        }
    }
}