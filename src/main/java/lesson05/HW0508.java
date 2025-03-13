package lesson05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class HW08
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0508 {
    public static void main(String[] args) {
        String input = "src/main/java/Lesson5/inputHW08.txt";
        String output = "src/main/java/Lesson5/outputHW08.txt";
        Exercise08(input, output);
    }


    /*
     * 1. check isDigit is prime or not
     * 2. find index of this number
     *
     * */
    public static void Exercise08(String inputFile, String outputFile) {
        int[] numArr = new int[10000]; // valid numbers array
        int[] countFreq = new int[10000]; // count freq valid number array
        int size = 0;

        // input
        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (isPrimeDigit(num)) {
                    int index = findIndex(numArr, size, num);
                    if (index == -1) { // if not exist -->
                        numArr[size] = num; // add valid number into array
                        countFreq[size] = 1; // count = 1
                        size++; // size increase
                    } else { // Nếu đã tồn tại, tăng số lần xuất hiện
                        countFreq[index]++;
                    }
                }
                scanner.close();
            }
        } catch (IOException e) {
            System.err.println("File not fount!");
            return;
        }

        // Ghi kết quả ra file
        try (PrintWriter output = new PrintWriter(outputFile)) {
            for (int i = 0; i < size; i++) {
                output.println(numArr[i] + " " + countFreq[i]);
            }
        } catch (IOException e) {
            System.err.println("Lỗi ghi file!");
        }

    }

    public static boolean isPrimeDigit(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    // find index
    public static int findIndex(int[] arr, int size, int num) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }


}
