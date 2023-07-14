import java.lang.Math;
public class Triangle extends Shape{
    private Point p1, p2, p3;

    Triangle(Point p1,Point p2,Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public Point getP1() {
        return p1;
    }
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public Point getP2() {
        return p2;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    public Point getP3() {
        return p3;
    }
    public void setP3(Point p3) {
        this.p3 = p3;
    }
    public void draw(){
        p1.print();
        p2.print();
        p3.print();
    }
    public void moveTo(Point p){
        double diffx = p.getX() - p1.getX();
        double diffy = p.getY() - p1.getY();

        p1.setX(p.getX());
        p1.setY(p.getY());

        p2.setX(p2.getX() + diffx);
        p2.setY(p2.getY() + diffy);

        p3.setX(p3.getX() + diffx);
        p3.setY(p3.getY() + diffy);
    }
    public double lineLength(Point a, Point b){

         return Math.sqrt(Math.pow(b.getX() - a.getX(),2) + Math.pow(b.getY() - a.getY(),2));

    }
    final double perimeter(){

        double l1 = lineLength(p1, p2);
        double l2 = lineLength(p1, p3);
        double l3 = lineLength(p2, p3);

        return l1+l2+l3;
    }
}
