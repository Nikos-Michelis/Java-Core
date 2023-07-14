class Cycle {

    private double c;
    private String metric;
    static final double pi=3.14;
    Cycle(double c, String metric){
        this.c = c;
        this.metric = metric;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }
    static double inToCm(double in){
        return in * 2.54;
    }
    static double cmToIn(double cm){
        return cm/2.54;
    }
    public double perimeterCm(){
        if(metric.equals("cm"))
            return 2 * pi * c;
        else
            return 2 * pi * inToCm(c);
    }
    public double perimeterIn(){
        if(metric.equals("in"))
            return 2 * pi * c;
        else
            return 2 * pi * cmToIn(c);
    }
}
