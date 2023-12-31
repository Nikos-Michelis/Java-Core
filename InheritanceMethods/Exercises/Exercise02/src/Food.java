abstract class Food {
     private String name;
     private double calories;
     Food(String name, double calories){
          this.name=name;
          this.calories=calories;
     }
     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getCalories() {
          return calories;
     }

     public void setCalories(double calories) {
          this.calories = calories;
     }
     abstract double eat();
}
