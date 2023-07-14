class Dog {
    String name;
    String species;
    int weight;
    int mood;

    Dog() {
        weight=10;
        species="Terrier";
        mood=5;
    }
    int eat(int quantity){
        mood += quantity;
        if(mood>10){
            mood=10;
        }
        if(quantity>10){
            quantity=10;
        }
        return quantity;
    }
    void walk() {
        mood++;
        if(mood>10){
            mood=10;
        }
    }
    void bark(){

        if(mood>5){
            System.out.println("Woof Woof Woof");

        }else{
            System.out.println("Woof");
        }
    }
}