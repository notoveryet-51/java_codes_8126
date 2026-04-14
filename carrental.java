class car {
    int carId;
    String CarType;
    double Rent;
    void GetCar(int carId, String CarType) {
        this.carId=carId;
        this.CarType=CarType;
        Rent=GetRent();
    }
    double GetRent() {
        if (CarType.equals("Small Car"))    return 1000.0;
        else if (CarType.equals("Van")) return 800.0;
        else return 2500.0;
    }
    void ShowCar() {
        System.out.println(carId+" "+CarType+" "+Rent);
    }
}
public class carrental {
    public static void main(String[] args) {
        car c1=new car();
        c1.GetCar(101,"Van");
        c1.ShowCar();
    }
}