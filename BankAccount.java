class banking {
    int balance;
    void deposit(int add) {
        balance+=add;
    }
}
class SavingsAccount extends banking {
    int interest=500;
    @Override 
    void deposit (int add) {
        balance+=add+interest;
    }
}

class CheckingAccount extends banking {
    @Override
    void deposit(int add) {
        balance+=add;
        System.out.println("Checking Account Balance: ");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        s1.deposit(1000);
        System.out.println("Balance: "+s1.balance);
        CheckingAccount b1=new CheckingAccount();
        b1.deposit(1000);
        System.out.println("Balance: "+b1.balance);
    }
}