import java.util.*;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        int n=s.length();
        String test="";
        for (int i=n-1; i>=0; i--)  test+=s.charAt(i);
        if (test.equals(s))    System.out.println("The entered string is a palindrome!!!");
        else System.out.println("The string is not a palindrome:(");
        sc.close();
    }
}
