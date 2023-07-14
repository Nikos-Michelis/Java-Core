import java.lang.Math;
class Point{

    int x;
    int y;

    Point(){
        this.x=0;
        this.y=0;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double Lenght(){

        double lenght = Math.sqrt(x*x + y*y);
        return lenght;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}