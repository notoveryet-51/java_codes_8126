abstract class StudentDetails {
    protected String name;
    protected int regn;
    protected String father;
    protected String permAddress;
    protected String currAddress;
    protected long contactNo;
    protected String email;

    // Getters and Setters
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setRegn(int regn) { this.regn = regn; }
    public int getRegn() { return regn; }

    public void setFather(String father) { this.father = father; }
    public String getFather() { return father; }

    public void setPermAddress(String permAddress) { this.permAddress = permAddress; }
    public String getPermAddress() { return permAddress; }

    public void setCurrAddress(String currAddress) { this.currAddress = currAddress; }
    public String getCurrAddress() { return currAddress; }

    public void setContactNo(long contactNo) { this.contactNo = contactNo; }
    public long getContactNo() { return contactNo; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    // Abstract method
    abstract void getDetails();
}

// UG Student
class UGStudent extends StudentDetails {
    protected String pastDegree;
    protected double marks;

    public void setAcademicDetails(String degree, double marks) {
        this.pastDegree = degree;
        this.marks = marks;
    }

    void getDetails() {
        System.out.println("UG Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Regn: " + getRegn());
        System.out.println("Father: " + getFather());
        System.out.println("Permanent Address: " + getPermAddress());
        System.out.println("Current Address: " + getCurrAddress());
        System.out.println("Contact: " + getContactNo());
        System.out.println("Email: " + getEmail());
        System.out.println("Past Degree: " + pastDegree);
        System.out.println("Marks: " + marks);
    }
}

// PG Student
class PGStudent extends StudentDetails {
    protected String pastDegree;
    protected double marks;

    public void setAcademicDetails(String degree, double marks) {
        this.pastDegree = degree;
        this.marks = marks;
    }

    void getDetails() {
        System.out.println("\nPG Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Regn: " + getRegn());
        System.out.println("Father: " + getFather());
        System.out.println("Permanent Address: " + getPermAddress());
        System.out.println("Current Address: " + getCurrAddress());
        System.out.println("Contact: " + getContactNo());
        System.out.println("Email: " + getEmail());
        System.out.println("Past Degree: " + pastDegree);
        System.out.println("Marks: " + marks);
    }
}

// PhD Student
class PhDStudent extends StudentDetails {
    protected String pastDegree;
    protected double marks;

    public void setAcademicDetails(String degree, double marks) {
        this.pastDegree = degree;
        this.marks = marks;
    }

    void getDetails() {
        System.out.println("\nPhD Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Regn: " + getRegn());
        System.out.println("Father: " + getFather());
        System.out.println("Permanent Address: " + getPermAddress());
        System.out.println("Current Address: " + getCurrAddress());
        System.out.println("Contact: " + getContactNo());
        System.out.println("Email: " + getEmail());
        System.out.println("Past Degree: " + pastDegree);
        System.out.println("Marks: " + marks);
    }
}

public class studentInfo {
    public static void main(String[] args) {
        UGStudent u = new UGStudent();
        PGStudent p = new PGStudent();
        PhDStudent phd = new PhDStudent();

        // UG
        u.setName("Soumya");
        u.setRegn(2025085);
        u.setFather("Bishu");
        u.setPermAddress("Kolkata");
        u.setCurrAddress("Allahabad");
        u.setContactNo(25771175);
        u.setEmail("soumya@gmail.com");
        u.setAcademicDetails("12th", 93.5);

        // PG
        p.setName("Sandip");
        p.setRegn(2025085);
        p.setFather("Sujit");
        p.setPermAddress("Kolkata");
        p.setCurrAddress("Allahabad");
        p.setContactNo(83568763);
        p.setEmail("sandip@mnnit.ac.in");
        p.setAcademicDetails("BSc", 95.2);

        // PhD
        phd.setName("Riya");
        phd.setRegn(2025085);
        phd.setFather("Sudarshan");
        phd.setPermAddress("Kolkata");
        phd.setCurrAddress("Howrah");
        phd.setContactNo(35235654);
        phd.setEmail("riya@gmail.com");
        phd.setAcademicDetails("MSc", 92.4);

        u.getDetails();
        p.getDetails();
        phd.getDetails();
    }
}