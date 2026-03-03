import java.util.*;

public class arrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        sc.close();

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        int difference = max - min;
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Difference between max and min: " + difference);
    }
}
