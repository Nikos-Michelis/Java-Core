public class Bulldog extends Dog {
    private double sizeEars;
    Bulldog(double weight, double height, double dbBarking, double sizeEars){
        super(weight, height, dbBarking);
        this.sizeEars = sizeEars;
    }
    public void sleep(){
        System.out.println("Bulldog is sleeping!");
    }
}
