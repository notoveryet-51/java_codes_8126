class mainAccount {
    int accountNumber;
    double balance;
    double interestRate;
    void deposit(double amt) {
        balance+=amt;
    }
}

class Savings extends mainAccount {
    double minimumBalance;
    void withdraw(double amt) {
        balance-=amt;
    }
}

class fixedDeposit extends Savings {
    int term;
    double getInterest(double amt) {
        double intr=amt*term*4.0/100;
        return intr;
    }
    @Override
    void deposit(double amt) {
        balance+=amt+getInterest(amt);
    }
}

public class bankingSystems {
    public static void main(String[] args) {
        mainAccount m1=new mainAccount();
        m1.deposit(45982.9);
        System.out.println("Balance is: "+m1.balance);
        Savings s1= new Savings();
        s1.deposit(56129.76);
        s1.withdraw(14528.67);
        System.out.println("Balance is: "+s1.balance);
        fixedDeposit f1=new fixedDeposit();
        f1.term=4;
        f1.deposit(68282.76);
        System.out.println("Balance is: "+f1.balance);
    }
}
