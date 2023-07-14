public class Dog extends Animal {

    private double dbBarking;

    Dog(double weight, double height, double dbBarking){
        super(weight,height);
        this.dbBarking = dbBarking;
    }

    public void bark(){
        System.out.println("Woof Woof Woof");
    }

}
