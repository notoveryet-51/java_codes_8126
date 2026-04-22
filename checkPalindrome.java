import java.util.*;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        int n=s.length();
        for (int i=0; i<n; i++) {
            if (s.charAt(i)!=s.charAt(n-1-i)) {
                System.out.println("The string is not a palindrome:(");
                sc.close();
                return;
            }
        }
        System.out.println("The entered string is a palindrome!!!");
        sc.close();
    }
}