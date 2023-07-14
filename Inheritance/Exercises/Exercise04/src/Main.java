class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        HimalayanCat himalayanCat = new HimalayanCat();
        himalayanCat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Doberman doberman = new Doberman();
        doberman.makeSound();
        KingDoberman kingDoberman = new KingDoberman();
        kingDoberman.makeSound();
    }
}