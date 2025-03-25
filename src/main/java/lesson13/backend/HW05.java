package lesson13.backend;

import lesson13.utils.ScannerUtils;

import java.util.LinkedList;
import java.util.Queue;

public class HW05 {
ScannerUtils scannerUtils = new ScannerUtils();
Queue<Integer> queue = new LinkedList<>();

    public void printQueue(){
        String input = scannerUtils.inputString("Enter a string of number, separating by commas or spaces : ");

        String[] numbers = input.split("[,\\s]+");

        for (String number : numbers) {
            try{
                queue.add(Integer.parseInt(number));
            }catch (NumberFormatException e){
                System.err.println("Error: " + number + " is not a number. Skip it!");
            }
        }
        // In
        System.out.println("-------------------------");
        System.out.println("Number queue: ");
        while (!queue.isEmpty()){
            System.out.println(queue.poll() + " ");
        }

    }
}
