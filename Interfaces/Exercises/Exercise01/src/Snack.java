public class Snack extends Food {

    Snack(String name, double calories){
        super(name, calories);
    }
    @Override
     double eat() {
        System.out.println("I am eating snack: "+getName());
        return getCalories();
    }
    @Override
    public Object copy(){
        return new Snack(this.getName(), this.getCalories());
    }
    @Override
    public String toString() {
        return "Snack: "+super.toString();
    }
    @Override
    public void print(){
        System.out.println(toString());
    }
}
