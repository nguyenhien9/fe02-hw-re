package lesson13.backend;

import lesson13.utils.ScannerUtils;
import java.util.HashSet;
import java.util.Set;

public class HW03 {
    ScannerUtils scannerUtil = new ScannerUtils();
    Set<Integer> uniqueNumbers = new HashSet<>();

    public void countUniqueNumbers() {
        // Bước 1: Nhập dãy số từ người dùng
        String input = scannerUtil.inputString("Enter numbers separated by spaces or commas: ");

        // Bước 2: Tách các số từ chuỗi nhập vào (loại bỏ dấu phẩy, khoảng trắng)
        String[] numbers = input.split("[,\\s]+");

        // Bước 3: Sử dụng HashSet để lưu các số duy nhất

        for (String num : numbers) {
            if (!num.isEmpty() ) {
               try{
                   uniqueNumbers.add(Integer.parseInt(num));
               } catch(NumberFormatException e){
                   System.out.println("Error: " + num + " is not a number!");
               }
            }
        }

        // Bước 4: In
        System.out.println("unique numbers: " + uniqueNumbers);
        scannerUtil.close();
    }
}
