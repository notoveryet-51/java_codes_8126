class rectangle {
    int length,breadth;
    // int area() {
    //     return length*breadth;
    // }
    void area() {
        System.out.println(length*breadth);
    }
    rectangle () {
        // System.out.println(area());
        area();
    }
    rectangle (int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
        // System.out.println(area());
        area();
    }
    rectangle (int abs) {
        this.length=abs;
        this.breadth=abs;
        // System.out.println(area());
        area();
    }
}

public class shapes {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        rectangle r2=new rectangle(5, 7);
        rectangle r3=new rectangle(9);
    }
}
