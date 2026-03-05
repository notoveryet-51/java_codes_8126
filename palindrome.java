import java.util.Scanner;

public class palindrome {
    public static boolean checkPalindrome(String s) {
        boolean flag=true;
        for (int i=0; i<s.length()/2; i++)  {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) flag=false;
        }
        if (flag)   return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string in lowercase latin: ");
        String str=sc.nextLine();
        if (checkPalindrome(str))   System.out.println("The string is a palindrome");
        else System.out.println("The string is not a palindrome");
        sc.close();
    }
}
