class BankAccount {

    private String fullName;
    private String accountNumber;

    private double balance;
    private int yearsActive;


    BankAccount(String fullName, String accountNumber, double deposit, int active){
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = deposit;
        this.yearsActive = active;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getYearsActive() {
        return yearsActive;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "fullName='" + fullName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", deposit=" + balance +
                ", active=" + yearsActive +
                '}';
    }
}
