package lesson05;

import java.util.Scanner;

/**
 * Class HW03
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter row and column
        int r = getValidNumber(sc, "Enter number of rows (r >0)");
        int c = getValidNumber(sc, "Enter number of columns (c >0)");

        int[][] myArray = new int[r][c];

        // enter elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                myArray[i][j] = getValidNumber(sc, "Enter element at [" + i + "][" + j + "]");
            }
        }
        // find max
        int maxElement = findMaxElement(myArray);
        System.out.println("maxElement = " + maxElement);
        sc.close();

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

    public static int findMaxElement(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
