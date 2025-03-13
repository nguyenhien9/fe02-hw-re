package lesson05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class HW04
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter size of 3D array
        int x = getValidNumber(sc,"Enter the size of X dimension (x>0) ");
        int y = getValidNumber(sc,"Enter the size of Y dimension (y>0) ");
        int z = getValidNumber(sc,"Enter the size of Z dimension (z>0) ");

        int[][][] myArr = new int[x][y][z];

        // Enter element
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    myArr[i][j][k]= getValidNumber(sc,"Enter element at [" + i + "][" + j + "][" + k + "]");
                }
            }
        }
        // print to file
        printArrayToFile(myArr,"src/main/java/Lesson5/outputHW04.txt");
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

    public static void printArrayToFile(int[][][] arr,String file) {
        // try-with-resource
        try(PrintWriter output = new PrintWriter(file)){
            output.println("[");
            for (int i = 0; i <arr.length ; i++) {
                output.println("  [");
                for (int j = 0; j <arr[i].length ; j++) {
                    output.print("    [");
                    for (int k = 0; k < arr[i][j].length ; k++) {
                        output.print(arr[i][j][k]);
                        if (k < arr[i][j].length -1) output.print(",  ");
                    }
                    output.println("]" + (j < arr[i].length - 1 ? "," : ""));
                }
                output.println("  ]" + (i < arr.length - 1 ? "," : ""));
            }
            output.println("]");


        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
