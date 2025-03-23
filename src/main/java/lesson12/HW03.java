package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first integer: ");
            int a = sc.nextInt();
            System.out.println("Enter second integer: ");
            int b = sc.nextInt();
            System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
        } catch (InputMismatchException e) {
            System.err.println("Error: Must enter an integer.");
        } finally {
            System.out.println("End of programs.");
        }
    }
}
