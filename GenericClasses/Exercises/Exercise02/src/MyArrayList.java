import java.util.ArrayList;
public class MyArrayList<T extends Number>{
    private ArrayList<T> array;

    public MyArrayList() {
        array = new ArrayList<>();
    }
    public void Add(T elem) {
        array.add(elem);
    }
   public double Avg() {
        if (array.isEmpty())
            return 0;

        double average = 0.0;
        for (var elem: array)
            average += elem.doubleValue();

        return average/array.size();

    }
   public <H extends Number> int compareAvg(MyArrayList<H> myArrayList){
        return Double.compare(Avg(),myArrayList.Avg());
   }
}
