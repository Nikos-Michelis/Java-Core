class Main {

    public static void main(String[] args) {
        Horse h = new Horse(200,2,"Black",1);
        Doberman d = new Doberman(50,1,10);
        Bulldog b = new Bulldog(80,1.5,5, 1);
        System.out.println("Horse Color is "+h.getColor());
        d.bark();
        d.run();
        d.bark();
        b.bark();
        b.sleep();
        b.bark();
    }
}