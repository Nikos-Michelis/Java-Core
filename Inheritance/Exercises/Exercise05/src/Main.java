import java.lang.Math;
class Main {

    public static void main(String[] args) {
        Triangle tr = new Triangle(new Point(0,0), new Point(1,1), new Point(2,0));
        tr.draw();
        System.out.println("Perimrter: "+tr.perimeter());

        EquilateralTriangle t = new EquilateralTriangle(new Point(0,0), new Point(1,Math.sqrt(3)), new Point(2,0));
        System.out.println(t.checkEquilatera());
    }
}