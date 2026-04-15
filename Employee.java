public class Employee {
    double salary,PF,DA;
    Employee(double salary, double PF, double Da) {
        this.salary=salary;
        this.PF=PF;
        DA=Da;
    }
    double Calculate (){
        return salary+PF+DA;
    } 
    void Display() {
        System.out.println("The in-hand Salary is: "+Calculate());
    }
    public static void main(String[] args) {
        Employee e1=new Employee(34290.89,6520.8,6721.70);
        e1.Display();
    }
}
