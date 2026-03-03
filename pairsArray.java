import java.util.Scanner;

public class pairsArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for (int i=0; i<7; i++) {
            arr[i]=sc.nextInt();
        }
        int []pair=new int[2];
        for (int i=0; i<7; i++) {
            for (int j=i+1; j<7; j++)   {
                pair[0]=arr[i];
                pair[1]=arr[j];
                System.out.print("("+pair[0]+","+pair[1]+") ");
            }
            System.out.println();
        }
        sc.close();
    }
}
