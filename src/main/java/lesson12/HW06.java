package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int number = sc.nextInt();
                if (number < 0) {
                    throw new NumberFormatException("Negative number!.");
                }
                System.out.println("Your number: " + number);
                break;
            } catch (NumberFormatException e) {
                try {

                    throw new NegativeNumberException("Error: Must enter a positive number!.");
                } catch (NegativeNumberException ne) {
                    System.out.println(ne.getMessage());
                }
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Not a number!.");
                sc.nextLine();
            }
        }
    }

}
