public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("NikosMichelis","GR123456",1000,4);
        System.out.println(ba.toString());
        ba.setFullName("Psounis Dimitrios");
        System.out.println(ba.toString());
        ba.setYearsActive(5);
        System.out.println(ba.toString());
    }
}