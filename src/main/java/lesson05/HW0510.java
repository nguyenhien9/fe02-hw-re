package lesson05;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class HW10
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0510 {
    public static void main(String[] args) {
//    inputFromConsole();
        int[][] a ={{1,2},{1,4}};
        System.out.println("findFirstPosition(a,1) = " + Arrays.toString(findFirstPosition(a, 1)));
        System.out.println("findFirstPosition(a,1) = " + Arrays.toString(findLastPosition(a, 1)));


    }
    public static void inputFromConsole(){
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
        System.out.println("myArray = " + Arrays.deepToString(myArray));
        sc.close();
    }
    public static void inputFromFile(String file){
        try(Scanner input = new Scanner(new File(file))){
            while (input.hasNext()){
                int r = input.nextInt();
                int c = input.nextInt();
                int[][] myArr = new int[r][c];

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        myArr[i][j]=input.nextInt();

                    }
                }
                System.out.println("myArr = " + Arrays.deepToString(myArr));
            }

        }catch(IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
    public static void printArrayToConsole(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static int findMax(int[][] arr) {
        int max = arr[0][0];


        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static int[] findMinPosition(int[][] arr) {
        int min = arr[0][0];
        int[] pos = {0, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
    public static int[] findMaxPosition(int[][] arr) {
        int max = arr[0][0];
        int[] pos = {0, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
    public static int[] findFirstPosition(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    return new int[]{i, j}; // return the first place
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    }
    public static int[] findLastPosition(int[][] arr, int n) {
        int[] pos = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
    public static void swapElements(int[][] arr, int row1, int col1, int row2, int col2) {
        int temp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = temp;
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
