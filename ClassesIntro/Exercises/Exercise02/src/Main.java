public class Main {
    public static void main(String[] args) {

        Dog piko, lassie;

        piko = new Dog();
        piko.name="Piko";

        lassie = new Dog();
        lassie.name="Lassie";
        lassie.weight=30;
        lassie.species="Colley";
        System.out.println(piko.name+ " "+piko.species+" "+piko.weight+" "+lassie.name+ " "+lassie.species+" "+lassie.weight);

        piko.bark();
        piko.walk();
        piko.bark();
        piko.walk();
        piko.bark();
        piko.eat();
        piko.bark();

    }
}
