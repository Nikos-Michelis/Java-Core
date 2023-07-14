public class Main {

    public static void main(String[] args) {
       
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.Add(1);
        myArrayList.Add(2);
        myArrayList.Add(3);
        System.out.println(myArrayList.Avg());

        MyArrayList<Double> myArrayListDouble = new MyArrayList<>();
        myArrayListDouble.Add(1.1);
        myArrayListDouble.Add(2.2);
        myArrayListDouble.Add(3.3);
        myArrayListDouble.Add(5.5);
        System.out.println(myArrayListDouble.Avg());
    }
}