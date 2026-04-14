class memberData {
    int Rno;
    String Name, Remarks;
    double Score;
    String AssignRem(double Score) {
        if (Score>=50)    return "Selected";
        else return "Not Selected";
    }
    void enterData(int Rno, String Name, double Score) {
        this.Rno=Rno;
        this.Name=Name;
        this.Score=Score;
        Remarks=AssignRem(Score);
    }
    void DISPLAY() {
        System.out.println("Roll No.: "+Rno);
        System.out.println("Name: "+Name);
        System.out.println("Score: "+Score);
        System.out.println("Remarks: "+Remarks);
    }
}

public class Candidate {
    public static void main(String[] args) {
        memberData m1=new memberData();
        m1.enterData(101, "Sandip", 507.9);
        m1.DISPLAY();
    }
}
