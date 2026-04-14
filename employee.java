class member {
    int empno;
    String ename;
    double basic, hr, da, netpay, cal;
    double Calculate() {
        return basic+hr+da;
    }
    void havedata(int empno, String ename, double basic, double hr, double da) {
        this.empno=empno;
        this.ename=ename;
        this.basic=basic;
        this.hr=hr;
        this.da=da;
        cal=Calculate();
    }
    void dispdata() {
        System.out.println("Employee No.: "+empno);
        System.out.println("Employee Name: "+ename);
        System.out.println("Basic Salary: "+basic);
        System.out.println("Hr: "+hr);
        System.out.println("DA: "+da);
        System.out.println("Gross: "+cal);
    }
}

public class employee {
    public static void main(String[] args) {
        member m1= new member();
        m1.havedata(101, "Sandip", 240000.0, 14000.0, 30000.0);
        m1.dispdata();
    }
}
