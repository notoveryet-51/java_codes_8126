import java.util.Scanner;

public class javaCaseSense {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder("");
        System.out.println("Enter the line: ");
        String str=sc.nextLine();
        for (int i=0; i<str.length(); i++)    {
            sb.append(str.charAt(i));
        }
        sb.setCharAt(0,(char)(sb.charAt(0)-32));
        for (int i=1; i<str.length(); i++)  {
            if (sb.charAt(i)==' ')  sb.setCharAt(i+1,(char)(sb.charAt(i+1)-32));
        }
        System.out.println(sb);
        sc.close();
    }
}
