class Main {

    public static void main(String[] args) {

        Cycle c1 = new Cycle(1,"in");
        System.out.println("Perimeter to in: " + c1.perimeterIn());
        System.out.println("Perimeter to cm: " + c1.perimeterCm());
        System.out.println("");
        System.out.println("Cm to In: "+Cycle.cmToIn(1));
        System.out.println("In to Cm: "+Cycle.inToCm(1));

    }
}