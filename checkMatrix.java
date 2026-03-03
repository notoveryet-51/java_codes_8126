import java.util.Scanner;

public class checkMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int isNull = 1;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num = sc.nextInt();
                if (num != 0) {
                    isNull = 0;
                    break;
                }
            }
            if (isNull == 0) break;
        }
        if (isNull == 1) {
            System.out.println("The matrix is a null matrix.");
        } else {
            System.out.println("The matrix is not a null matrix.");
        }
        sc.close();
    }
}
