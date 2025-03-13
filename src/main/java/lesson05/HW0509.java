package lesson05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class HW09
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0509 {
    public static void main(String[] args) {
        int[] myArr = inputArrayFromConsole();

    }


    public static int[] inputArrayFromConsole() {
        Scanner sc = new Scanner(System.in);
        int arrayLenngth, n;
        do {
            arrayLenngth = getValidNumber(sc, "Enter the number of elements in the array (must be > 0)");
            if (arrayLenngth <= 0) {
                System.err.println("The number of elements must be > 0!");
            }
        } while (arrayLenngth <= 0);
        int[] myArray = new int[arrayLenngth];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getValidNumber(sc, "Enter element " + (i + 1));
        }
        sc.close();
        return myArray;
    }

    public static int[] inputArrayFromFile(String inputFile) {
        int[] arr = new int[0];
        try (Scanner input = new Scanner(new File(inputFile))) {
            while (input.hasNext()) {
                int n = input.nextInt();
                arr = new int[n];

                for (int i = 0; i < n; i++) {
                    if (input.hasNext()){
                        arr[i] = input.nextInt();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        return arr;
    }
    public static void printArrayToConsole(int[] arr){
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayToFile(int[] arr, String outputFile){
        try (PrintWriter output = new PrintWriter(outputFile)) {
            for (int i = 0; i < arr.length; i++) {
                output.print(arr[i] + " ");
            }
            output.println();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMinIndex(int[] arr) {
        if (arr.length == 0) return -1;
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxIndex(int[] arr) {
        if (arr.length == 0) return -1;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int findFirstOccurrence(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static int findLastOccurrence(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static void swapElements(int[] arr, int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.println("Swap failed!.");
        }
    }
    public static int getValidNumber(Scanner sc, String msg) {
        int number;
        System.out.print(msg + "= ");

        while (!sc.hasNextInt()) {
            System.err.println("Please enter a valid integer!");
            sc.nextLine();
        }

        number = sc.nextInt();
        sc.nextLine();

        return number;

    }
}
