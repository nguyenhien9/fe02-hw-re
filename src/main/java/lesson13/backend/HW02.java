package lesson13.backend;

import lesson13.utils.ScannerUtils;

import java.util.HashMap;
import java.util.Map;

public class HW02 {
    ScannerUtils scannerUtil = new ScannerUtils();

    /*
    * Bước 1: Nhập đoạn văn
    * Bước 2: Loại bỏ dấu câu
    * Bước 3: Tách đoạn văn thành mảng dựa vào space
    * Bước 4: Đếm, dùng HashMap
    *
    * */
    public void wordCounting() {

        // Bước 1
        String input = scannerUtil.inputString("Input a paragraph: ");

        // Bước 2: Loại bỏ tất cả ký tự ko phải chữ cái \p{L}, ko phải số \p{N}, khoảng trắng \s
        input = input.replaceAll("[^\\p{L}\\p{N}\\s]+","");

        // Bước 3:
        String[] words = input.split("\\s+");

        // Bước 4:
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words){
            if (word.isEmpty()){
                continue;
            }
            wordMap.put(word,wordMap.getOrDefault(word,0) +1);
        }
        // In
        System.out.println("Result: ");
        for(Map.Entry<String, Integer> map : wordMap.entrySet()){
            System.out.println(map.getKey() + "= "+ map.getValue());

        }
        scannerUtil.close();

    }
}
