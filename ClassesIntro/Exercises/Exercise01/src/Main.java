public class Main {
    public static void main(String[] args) {
       // Dog d1, d2;
       // d1 = new Dog("Poki",10,"Terrier");
       // d2 = new Dog("Lassie",30,"Colley");
        //System.out.println(" Dog1 "+d1.name+ " "+d1.species+" "+d1.weight+" Dog2 "+d2.name+ " "+d2.species+" "+d2.weight);
        Dog piko, lassie;

        piko = new Dog();
        piko.name="Piko";

        lassie = new Dog();
        lassie.name="Lassie";
        lassie.weight=30;
        lassie.species="Colley";
        System.out.println(piko.name+ " "+piko.species+" "+piko.weight+" "+lassie.name+ " "+lassie.species+" "+lassie.weight);


    }

}
