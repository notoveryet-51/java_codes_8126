class check {
    int mins,hours,secs;
    void setTime(int hours, int mins, int seconds) {
        this.mins=mins;
        this.hours=hours;
        secs=seconds;
        if (hours>23) {
            this.hours=hours%24;
        }
        if (mins>59) {
            this.mins=mins%60;
        }
        if (seconds>59) {
            secs=seconds%60;
        }
    }
    void Display() {
        if (hours>11) System.out.println(hours+":"+mins+":"+secs+" PM");
        else System.out.println(hours+":"+mins+":"+secs+" AM");
    }
}

public class clock {
    public static void main(String[] args) {
        check c1=new check();
        c1.setTime(00,00,00);
        c1.Display();
    }
}
