class Horse extends Animal {
    private String color;
    private double sizeTail;
    Horse(double weight, double height, String color, double sizeTail) {
        super(weight, height);
        this.color = color;
        this.sizeTail = sizeTail;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTail(double sizeTail) {
        this.sizeTail = sizeTail;
    }

    public double getTail() {
        return sizeTail;
    }
}