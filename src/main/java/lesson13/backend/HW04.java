package lesson13.backend;

import lesson13.utils.ScannerUtils;

import java.util.Stack;

public class HW04 {
    ScannerUtils scannerUtil = new ScannerUtils();
    Stack<Character> stackStr = new Stack<>();


    public void reverseString() {
        String input = scannerUtil.inputString("Enter a random string: ");

        // store into stack
        for (Character ch : input.toCharArray()) {
            stackStr.push(ch);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stackStr.isEmpty()) {
            reversedString.append(stackStr.pop());
        }

        System.out.println("Reversed String: " + reversedString);
        scannerUtil.close();


    }
}
