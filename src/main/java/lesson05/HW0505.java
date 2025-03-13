package lesson05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class HW05
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0505 {
    public static void main(String[] args) {
        String input = "src/main/java/Lesson5/inputHW05.txt";
        String output = "src/main/java/Lesson5/outputHW05.txt";
        getSumOfInteger(input, output);



    }

    public static void getSumOfInteger(String inputFile, String outputFile) {
        int sum = 0;
        // input
        try (Scanner input = new Scanner(new File(inputFile))) {
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    sum += input.nextInt();
                } else {
                    input.next();
                }
            }
        } catch (IOException e) {
            System.err.println("File not found!");

        }
        // output
        try (PrintWriter output = new PrintWriter(outputFile)) {
            output.println("Sum of integer= " + sum);
        } catch (IOException e) {
            System.err.println("Cannot print to file!");
        }

    }


}
