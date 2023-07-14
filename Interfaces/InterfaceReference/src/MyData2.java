class MyData2 implements StandardMethods {
    double value1;
    long value2;

    MyData2() {
        value1 = 0.0;
        value2 = 1;
    }
    @Override
    public Object copy() {
        MyData2 d = new MyData2();
        d.value1 = value1;
        d.value2 = value2;
        return d;
    }
    @Override
    public void print() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "MyData2{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}