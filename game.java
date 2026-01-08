/*  Project name: Fun number guessing game
Name: Sandipan Ray 
Regn no.: 2025CA085
Date: 08-01-2026
*/

import java.util.*;
public class game {
    public static void main (String[] args) {
        double a=Math.random();
        int guess=(int)(a*100);
        System.out.println("The number is between 1-100");
        System.out.println("Can you guess it????");
        System.out.println("Let's play the game");
        System.out.println("It's gonna be fun!!!!");
        System.out.println("You can stop anytime by entering -1");
        Scanner sc= new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            if (n==guess)   {
                System.out.println("Congratulations!!!");
                System.out.println("You guessed it right");
                break;
            }
            else if (n==-1) {
                System.out.println("You have exited the game...");
                System.out.println("Thank you!!");
                break;
            }
            else if (n>guess)   System.out.println("Try lesser...");
            else System.out.println("Try greater...");   
        }
        sc.close();
    }
}
