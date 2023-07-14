import java.util.Scanner;

public class TropicalFruit extends Food {
    private String type;

    public TropicalFruit() {
    }

    TropicalFruit(String name, double calories, String type){
        super(name, calories);
        this.type = type;
    }
    @Override
    double eat() {
        System.out.println("I am eating Fruit Name:" + getName() + " and type" + type);
        return getCalories();
    }
    @Override
    public Object copy(){
        return new TropicalFruit(this.getName(), this.getCalories(), this.type);
    }
    @Override
    public String toString() {
        return "TropicalFruit{" +
                "type='" + type + '\'' +
                super.toString()+
                '}';
    }
    @Override
    public void print(){
        System.out.println(toString());
    }
    @Override
    public void read(Scanner sc){
        super.read(sc);
        System.out.println("Give Fruit Type:");
        this.type = sc.nextLine();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TropicalFruit that = (TropicalFruit) o;
        return getName().equals(that.getName()) && getCalories() == that.getCalories() && type.equals(that.type);
    }
}
