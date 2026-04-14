class transaction {
    private int accountNumber;
    private double balance;
    private String name;
    public void getAccount(int accountNumber, double balance, String name) {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }
    public void display() {
        System.out.println("Account Number: "+accountNumber);
        System.err.println("Balance is: "+balance);
        System.out.println("Name: "+name);
    }
    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }
}

public class bank {
    public static void main(String[] args) {
        transaction t1=new transaction();
        t1.getAccount(101, 3400.63, "Sandip");
        t1.deposit(562.9);
        t1.withdraw(42.90);
        t1.display();
    }
}
