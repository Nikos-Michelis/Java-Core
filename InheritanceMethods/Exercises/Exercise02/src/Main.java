public class Main {

    public static void main(String[] args) {
        //Method A//
        /*TropicalFruit[] array ={
                new TropicalFruit("Bannana",150,"Fruit"),
                new TropicalFruit("Orange",100,"Fruit"),
                new TropicalFruit("Αctinium",200,"Fruit"),
                new TropicalFruit("Apple",80,"Fruit"),
                new TropicalFruit("Pear",70,"Fruit")
        };*/
        //Method B//
        TropicalFruit[] array = new TropicalFruit[5];
        double sum=0;
        array[0] = new TropicalFruit("Bannana",150,"Fruit");
        array[1] = new TropicalFruit("Orange",100,"Fruit");
        array[2] = new TropicalFruit("Αctinium",200,"Fruit");
        array[3] = new TropicalFruit("Apple",80,"Fruit");
        array[4] = new TropicalFruit("Pear",70,"Fruit");

        for(var elem: array){
            sum += elem.eat();

        }
        System.out.println("Total Calories: "+sum);
    }
}