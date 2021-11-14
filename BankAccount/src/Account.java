public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
public Account(){

    this("5678",400,"default","default","default");
    System.out.println("Default called");
}
public Account(String number, double balance, String customerName, String customerEmailAddress,
               String customerPhoneNumber){
    this.number=number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmailAddress = customerEmailAddress;
    this.customerPhoneNumber = customerPhoneNumber;

}
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalamce(double balamce) {
        this.balance = balamce;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made.New balance is " + balance);
    }
    public void withdrawal (double withdrawalAmount){
        if((this.balance - withdrawalAmount) <=0){
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        }else{
            balance-=withdrawalAmount;
            System.out.println("withdrawal amount " + withdrawalAmount + " processed.Remaining balance = " + balance);
        }
    }
}
