package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // Mảng gồm 5 phần tử
        while (true) {
            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();
                System.out.print("Enter value for this index: ");
                int value = sc.nextInt();
                arr[index] = value;
                System.out.println("Assigned " + value + " to arr[" + index + "]");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: out of bounds! Please enter a valid integer.");
            } catch (InputMismatchException e) {
                System.err.println("Error: Must enter an integer.");
                sc.nextLine();
            }
        }
    }
}
