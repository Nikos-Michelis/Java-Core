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
        Food[] array = new Food[5];
        double sum=0;
        array[0] = new Snack("Sna1",150);
        array[1] = new Snack("Sna1",150);
        array[2] = new TropicalFruit("Αctinium",200,"Fruit");
        array[3] = new TropicalFruit("Apple",80,"Fruit");
        array[4] = new Snack("sna3",70);


        for(var elem: array){
            sum += elem.eat();

        }
        System.out.println("Total Calories: "+sum);
        System.out.println("========================");
        StandardMethods i;
        i = array[0];
        i.print();
        i = array[3];
        i.print();
        DoubleAdjustments j;
        j = array[1];
        j.doubleEverything();
        array[1].print();
        j.halfEverything();
        array[1].print();
        System.out.println("========================");
        System.out.println(array[0].equals(array[1]));
        System.out.println(array[0] == array[1]);
        Object o;
        o = array[1];
        System.out.println(array[0].equals(o));
        System.out.println(array[0].equals(array[0]));
    }
}