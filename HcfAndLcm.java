import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = a, temp = b;
        int c;

        do {
            c = hcf % temp;
            if (c == 0) break;
            hcf = temp;
            temp = c;
        } while (c != 0);

        System.out.println("HCF is: " + temp);

        int lcm = (a * b) / temp;
        System.out.println("LCM is: " + lcm);
        sc.close();
    }
}
