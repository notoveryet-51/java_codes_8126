import java.util.ArrayList;
import java.util.Scanner;

public class reverseList {
    public static void main (String [] args)    {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> nums= new ArrayList<>();
        System.out.print("Enter the number of elements you wish to enter: ");
        int n= sc.nextInt();
        System.out.println("Please enter the elements");
        for (int i=0; i<n; i++) {
            int store= sc.nextInt();
            nums.add(store);
        }
        System.out.println("The entered list is:");
        System.out.println(nums);
        System.out.println("The reversed list is:");
        for (int i=0; i<n/2; i++)   {
            int temp=nums.get(i);
            nums.set(i,nums.get(n-1-i));
            nums.set(n-1-i,temp);
        }
        System.out.println(nums);
        sc.close();
    }
}
