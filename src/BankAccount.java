public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;


    public BankAccount(double accountNumber, double balance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("bankaccount constructor with parameters called:");
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public double depositFund(double deposit){
        double deposited = deposit + this.balance;
        return deposit;
    }

    public double withdrawFund(double withdraw){
        if (balance < withdraw){
            return 0;
        }
        return this.balance - withdraw;
    }
}
