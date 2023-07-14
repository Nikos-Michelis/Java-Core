class Main {

    public static void main(String[] args) {
        Payment p1 = new Payment(100);
        p1.print();
        Credit c1 = new Credit(50, "2018-2020-2021-2022", "10/09/2029");
        c1.print();
        Check ch1 = new Check(50,10,"GR20215488652");
        ch1.print();

    }
}