
public class Credit extends Payment {

    private String cardNumber;
    private String expDate ;
    Credit(double amount, String cardNumber, String expDate){
        super(amount);
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }
    @Override
    public void print(){
        System.out.println("===CREDIT===");
        System.out.println(" Amount: "+getAmount()+" CardBumber: "+cardNumber+" ExpireDate: "+expDate);
    }
}
