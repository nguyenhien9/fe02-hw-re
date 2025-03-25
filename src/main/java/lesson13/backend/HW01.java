package lesson13.backend;

import lesson13.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class HW01 {
    ScannerUtils scannerUtil = new ScannerUtils();
    List<Integer> numList = new ArrayList<>();

    public void numberManagement() {
        while (true) {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|                  Number Management                    |");
            System.out.println("+-------------------------------------------------------+");
            System.out.printf("|    %-51s|%n", "1. Add new number.");
            System.out.printf("|    %-51s|%n", "2. Modify number.");
            System.out.printf("|    %-51s|%n", "3. Remove number.");
            System.out.printf("|    %-51s|%n", "4. Show number.");
            System.out.printf("|    %-51s|%n", "5. Exit.");
            System.out.println("+-------------------------------------------------------+");

            int userSelection = scannerUtil.inputInt("Your choice: ");
            switch (userSelection) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    modifyNumList();
                    break;
                case 3:
                    removeNumber();
                    break;
                case 4:
                    showNumberList();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scannerUtil.close();
                    return;
                default:
                    break;

            }
        }
    }

    private void addNumber() {
        int newNumber = scannerUtil.inputInt("Enter new integer: ");
        numList.add(newNumber);
        System.out.println("Number added");
    }

    private void modifyNumList() {
        if (numList.isEmpty()) {
            System.out.println("Number list is empty!");
            return;
        }
        System.out.println("Number list: " + numList);

        while (true) {
            int index = scannerUtil.inputInt("Enter index of number to modify (from 0): ");
            if (index < 0 || index >= numList.size()) {
                System.err.println("Error: Invalid index. Please try again.");
            } else {
                System.out.println("Modifying number: " + numList.get(index) + " at position " + index);
                int newValue = scannerUtil.inputInt("Enter new value: ");
                numList.set(index, newValue);
                System.out.println("New number list: " + numList);
                return;
            }
        }


    }

    private void removeNumber() {
        if (numList.isEmpty()) {
            System.out.println("Number list is empty!");
            return;
        }
        System.out.println("Number list: " + numList);
        while (true) {
            int index = scannerUtil.inputInt("Enter index of number to remove (from 0): ");
            if (index < 0 || index >= numList.size()) {
                System.out.println("Error: Invalid index. Please try again.");
            } else {
                System.err.println("Removing number: " + numList.get(index) + " at position " + index);
                numList.remove(index);
                System.out.println("New number list: " + numList);
                return;
            }
        }


    }

    private void showNumberList() {
        if (numList.isEmpty()) {
            System.out.println("Number list is empty!");
            return;
        }
        System.out.println("Current list: " + numList);
    }
}
