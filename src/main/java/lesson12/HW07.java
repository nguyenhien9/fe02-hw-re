package lesson12;

import java.io.IOException;
import java.io.PrintWriter;

public class HW07 {
    public static void main(String[] args) {
        String text = "Lorem ipsum.";
        try (PrintWriter writer = new PrintWriter("src/main/java/lesson12/hw07.txt")) {
            writer.write(text);
            System.out.println("Write successfully.");
        } catch (IOException e) {
            System.out.println("Write file failed: " + e.getMessage());
        }
    }

}
