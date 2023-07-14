class Point {
    int x;
    int y;

    Point() {
        x=0;
        y=0;
    }
    Point(int diag) {
        this.x=diag;
        this.y=diag;
    }
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    Point middle(Point ob){

        return new Point((this.x + ob.x)/2,(this.y + ob.y)/2);
    }
    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double length() {
        double len = Math.sqrt(x*x+y*y);
        return len;
    }
    void print() {
        System.out.println("(" + x + "," + y +")");
    }
}
