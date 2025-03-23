package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW09 {
    public static void main(String[] args) throws StudentListEmptyException {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent management:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Must be a number!");
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    sm.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter index of student needs removing: ");
                    try {
                        int index = sc.nextInt();
                        sm.removeStudent(index);
                    } catch (InputMismatchException e) {
                        System.out.println("Must be an integer!");
                        sc.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (StudentListEmptyException e) {
                        System.out.println("ErrorA: " + e.getMessage());
                    }
                    break;
                case 3:
                    sm.displayStudents();
                    break;
                case 4:
                    System.out.println("Exit Program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
