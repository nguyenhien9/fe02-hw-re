package lesson13.utils;

import java.util.Scanner;

public class ScannerUtils {
    private final Scanner sc = new Scanner(System.in);


    public int inputInt(String msg){
        while(true){
            try{
                System.out.println(msg);
                return Integer.parseInt(sc.nextLine().trim());

            } catch(NumberFormatException exception){
                System.out.println("Error: not an integer!");
            }
        }
    }
    public String inputString(String msg){
        System.out.println(msg);
        return sc.nextLine().trim();

    }
}
