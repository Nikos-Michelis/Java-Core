public class EquilateralTriangle extends Triangle{

    EquilateralTriangle(Point p1,Point p2,Point p3){
        super(p1, p2, p3);

    }

    boolean checkEquilatera(){
        double l1 = lineLength(getP1(), getP2());
        double l2 = lineLength(getP1(), getP3());
        double l3 = lineLength(getP2(), getP3());

        return Math.abs(l1-l2)<0.0001 && Math.abs(l1-l3)<0.0001 && Math.abs(l2-l3)<0.0001;

    }
}
