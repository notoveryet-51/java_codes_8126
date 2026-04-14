class officeEmployee{
    String name;
    int year;
    double salary;
    String address;
    void getData(String Name, int year, double salary, String address) {
        this.name=Name;
        this.year=year;
        this.salary=salary;
        this.address=address;
    }
    void Display() {
        System.out.println(name+"\t"+year+"\t\t"+salary+"\t\t"+address);
    }
}

public class employee2 {
    public static void main(String[] args) {
        officeEmployee o1=new officeEmployee();
        officeEmployee o2=new officeEmployee();
        officeEmployee o3=new officeEmployee();
        System.out.println("Name\tYear Of Joining\tSalary\t\tAddress");
        o1.getData("Sanjay", 1994, 24000, "Tilak Nagar, Allahabad");
        o2.getData("Rakesh", 2000, 25000, "Hari Nagar, Allahabad");
        o3.getData("Rahul",1999,10000,"Subhash Nagar, Allahabad");
        o1.Display(); o2.Display(); o3.Display();
    }
    
}
