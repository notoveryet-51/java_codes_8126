class RBI {
    String Customer;
    int AccountNo;
    double balance;
    double getRate() {
        return 4.0;
    }
    double getinterest () {
        return balance*getRate()*5/100;
    }
    void setName(String name, int AccountNo, double balance) {
        this.AccountNo=AccountNo;
        this.Customer=name;
        this.balance=balance;
        this.balance+=getinterest();
    }
    void getName(){
        System.out.println("Customer: "+Customer);
        System.out.println("Account No.: "+AccountNo);
        System.out.println("Rate of interest: "+getRate());
        System.out.println("Current Balance: "+balance);
    }
}
class PNB extends RBI {
    double getRate() {
        return 3.6;
    }
}
class ICICI extends RBI {
    double getRate() {
        return 4.1;
    }
}
class SBI extends RBI {
    double getRate() {
        return 3.9;
    }
}

public class bankOperations {
    public static void main(String[] args) {
        PNB p1=new PNB();
        p1.setName("Sandip", 519, 562181.89);
        p1.getName();
        SBI p2=new SBI();
        p2.setName("Sandip", 519, 562181.89);
        p2.getName();
        ICICI p3=new ICICI();
        p3.setName("Sandip", 519, 562181.89);
        p3.getName();
    }
}
