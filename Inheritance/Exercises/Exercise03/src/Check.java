public class Check extends Payment {

    private int number;
    private String bankCode;


    Check(double amount, int number, String bankCode){
        super(amount);
        this.number = number;
        this.bankCode = bankCode;
    }
    @Override
    public void print(){
        System.out.println("====CHECK==== ");
        System.out.println(" Amount: "+getAmount()+" Number: "+number+" BankCode: "+bankCode);
    }
}
