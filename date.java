//dont pass edge cases

class checkDate {
    int date,month,year;
    void setDate(int date, int month, int year) {
        this.month=month;
        this.date=date;
        this.year=year;
    }
    boolean validation() {
        if (month<1 || month>12) return false;
        if (date<1 || date>31) return false;
        if (date<1 || date>28 && month==2 && (year%4!=0 && year%400!=0)) return false;
        if (date<1 || date>30 && (month==4 || month==6 ||month==9 ||month==11)) return false;
        if (date<1 || date>31 && (month==1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10|| month==12)) return false;
        return true;
    }
    void displayDate () {
        if(validation()) {
            System.out.print("The next day is ");
            System.out.println((date+1)+"/"+month+"/"+year) ;
        }
        else System.out.println("Invalid date");
    }

}

public class date {
    public static void main(String[] args) {
        checkDate c1=new checkDate();
        c1.setDate(29,2,2011);
        c1.displayDate();
    }
}
