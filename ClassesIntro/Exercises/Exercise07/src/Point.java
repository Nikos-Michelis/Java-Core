import java.lang.Math;
class Point{

    int x;
    int y;

    Point(int x, int y){//to x arxikopoieite me x=3 kai to y me y=4
        this.x=x;
        this.y=y;
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