import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest1 = Integer.MIN_VALUE, largest2 = Integer.MIN_VALUE, largest3 = Integer.MIN_VALUE;
        int posL1 = -1, posL2 = -1, posL3 = -1;

        int smallest1 = Integer.MAX_VALUE, smallest2 = Integer.MAX_VALUE, smallest3 = Integer.MAX_VALUE;
        int posS1 = -1, posS2 = -1, posS3 = -1;

        int position = 1;

        while (true) {
            int num = sc.nextInt();
            if (num < 0) break;

            if (num > largest1) {
                largest3 = largest2; posL3 = posL2;
                largest2 = largest1; posL2 = posL1;
                largest1 = num; posL1 = position;
            } else if (num > largest2) {
                largest3 = largest2; posL3 = posL2;
                largest2 = num; posL2 = position;
            } else if (num > largest3) {
                largest3 = num; posL3 = position;
            }

            if (num < smallest1) {
                smallest3 = smallest2; posS3 = posS2;
                smallest2 = smallest1; posS2 = posS1;
                smallest1 = num; posS1 = position;
            } else if (num < smallest2) {
                smallest3 = smallest2; posS3 = posS2;
                smallest2 = num; posS2 = position;
            } else if (num < smallest3) {
                smallest3 = num; posS3 = position;
            }

            position++;
        }

        if (position == 1) {
            System.out.println("No numbers were entered.");
            sc.close();
            return;
        }

        System.out.println("\nThree largest numbers:");
        System.out.println("1st largest: " + largest1 + " at position " + posL1);
        System.out.println("2nd largest: " + largest2 + " at position " + posL2);
        System.out.println("3rd largest: " + largest3 + " at position " + posL3);

        System.out.println("\nThree smallest numbers:");
        System.out.println("1st smallest: " + smallest1 + " at position " + posS1);
        System.out.println("2nd smallest: " + smallest2 + " at position " + posS2);
        System.out.println("3rd smallest: " + smallest3 + " at position " + posS3);

        sc.close();
    }
}
