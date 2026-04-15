public class Student {
    int roll;
    String name;
    double SPI;
    Student(int Roll, String Name, Double SPI) {
        roll=Roll;
        name=Name;
        this.SPI=SPI;
    }
    static boolean isEqual(Student s1, Student s2) {
        if (s1.roll==s2.roll && s1.name==s2.name && s1.SPI==s2.SPI) return true;
        return false;
    }
    public static void main(String[] args) {
        Student s1= new Student(85, "Sandipan", 9.0);
        Student s2= new Student(85, "Sandipan", 9.0);
        if (Student.isEqual(s1,s2)) {
            System.out.println("The students are same.");
        }
        else System.out.println("The students are different.");
    }
}
