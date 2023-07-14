import java.util.Scanner;

abstract class Food implements StandardMethods, DoubleAdjustments {
     private String name;
     private double calories;

     public Food() {
     }
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
     @Override
     public String toString() {
          return "Food{" +
                  "name='" + name + '\'' +
                  ", calories=" + calories +
                  '}';
     }
     @Override
     public void doubleEverything(){
          calories = calories * 2;

     }
     @Override
     public void halfEverything() {
          calories = calories/2;

     }
     public void read(Scanner sc){
          System.out.println("Give Name: ");
          this.name = sc.nextLine();
          while(true) {
               System.out.println("Give Calories: ");
               if(sc.hasNextDouble()) {
                    this.calories = sc.nextDouble();
                    break;
               }else{
                    System.out.println("Give only Double");
                    sc.next();
               }
          }
          sc.nextLine();
     }
     abstract double eat();
}
