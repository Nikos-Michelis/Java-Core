public class TropicalFruit extends Food {
    private String type;

    TropicalFruit(String name, double calories, String type){
        super(name, calories);
        this.type = type;
    }
    @Override
    double eat() {
        System.out.println("I am eating Fruit Name:" + getName() + " and type" + type);
        return getCalories();
    }
}
