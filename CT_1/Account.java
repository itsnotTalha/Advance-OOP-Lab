public class Account {
   private String accountNumber;
   private double balance;

    public Account(String accountNumber ,double balance ) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Account() {
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
    }

    void display(){
        System.out.println("Account: " + getAccountNumber() + " , Balace: " + getBalance());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CreditAccountt extends Account{
    private double creditLimit;

    public CreditAccountt(String accountNumber, double balance,  double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    void withdraw(double amount){
        if(amount<=super.getBalance()+creditLimit){
            super.setBalance(super.getBalance()-amount);
        }else{
            System.out.println("Credit limit exceeded");
        }
    }
//TalhaJubayer
    public static void main(String[] args) {
        Account acc = new Account("A101", 500);
        CreditAccountt credAcc = new CreditAccountt("C202", 200, 1000);

        acc.withdraw(600);

        credAcc.withdraw(800);
        credAcc.display();

        credAcc.withdraw(1000);
    }

}

