interface Vehicle {
    void changeGear(int gear);
    void speedUp(int acc);
    void applyBrakes(int dece);
}

class Bike implements Vehicle {
    int gear,speed=58;
    public void changeGear(int gear) {
        this.gear=gear;
        System.out.println("Current Gear: "+gear);
    }
    public void speedUp(int acc)  {
        speed+=acc;
        System.out.println("Accelerated Speed: "+speed);
    }
    public void applyBrakes(int dece) {
        speed-=dece;
        System.out.println("Decelerated Speed: "+speed);
    }
}

class Bicycle implements Vehicle {
    int gear,speed=15;
    public void changeGear(int gear) {
        this.gear=gear;
        System.out.println("Current Gear: "+gear);
    }
    public void speedUp(int acc)  {
        speed+=acc;
        System.out.println("Accelerated Speed: "+speed);
    }
    public void applyBrakes(int dece) {
        speed-=dece;
        System.out.println("Decelerated Speed: "+speed);
    }
}

public class VehicleFundas {
    public static void main(String[] args) {
        Bike b1=new Bike();
        Bicycle b2= new Bicycle();
        b1.changeGear(2);
        b1.speedUp(15);
        b1.applyBrakes(30);
        b2.changeGear(4);
        b2.speedUp(5);
        b2.applyBrakes(10);
    }
}
