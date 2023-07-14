class Payment {
    private double amount;

    Payment(double payment){
        this.amount = payment;
    }
    public void setPayment(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void print(){
        System.out.println("===PAYMENT===");
        System.out.println(" Amount: "+ amount);
    }
}
