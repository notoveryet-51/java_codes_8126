import java.util.Scanner;

public class path {
    public static double shortestPath(String s)    {
        double shortPath;
        int x=0,y=0;
        for (int i=0; i<s.length(); i++)    {
            if (s.charAt(i)=='E')   x++;
            else if (s.charAt(i)=='W')  x--;
            else if (s.charAt(i)=='N')  y++;
            else y--;
        }
        shortPath=Math.sqrt(x*x+y*y);
        return shortPath;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the instruction: ");
        String str=sc.next();
        System.out.println("The shortest path is: "+shortestPath(str));
        sc.close();
    }
}
