class first {
    int i;
    void printNum() {
        System.out.println("First Class: "+i);
    }
}

class second extends first {
    int j;
    @Override
    void printNum() {
        super.printNum();
        System.out.println("Second Class: "+j);
    }
}

public class Num {
    public static void main(String[] args) {
        second f= new second();
        f.i=10; f.j=20;
        f.printNum();
    }
}
