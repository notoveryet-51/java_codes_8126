import java.util.*;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("--------Basic Calculator--------");
        System.out.println("Enter the nos: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operation you want to perform(1->Add, 2->Substract, 3->Multiply, 4->Division): ");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Addition is: "+(a+b));
                break;
            case 2:
                System.out.println("Substraction is: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                try{
                    int c=a/b;
                    System.out.println("Division is: "+c);
                }   catch (ArithmeticException e){
                    System.out.println("Can't divide 0!!!");
                }
                break;
            default:
                break;
        }
        sc.close();
    }    
}
