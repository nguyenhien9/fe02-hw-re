package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Enter an integer: ");
                number = sc.nextInt();
                System.out.println("Your number: " + number);
               return;
            } catch (InputMismatchException e) {
                System.err.println("Error: Must enter an integer.");
                sc.nextLine();
            }
        }
    }
}
