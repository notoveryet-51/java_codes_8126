import java.util.*;

public class linearAndbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        sc.close();

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }
        if (pos != -1) System.out.println("Linear Search: Element found at index " + pos);
        else System.out.println("Linear Search: Element not found");

        Arrays.sort(arr);
        int left = 0, right = n - 1, mid, found = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == key) {
                found = mid;
                break;
            } else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        if (found != -1) System.out.println("Binary Search: Element found at index " + found);
        else System.out.println("Binary Search: Element not found");
    }
}
