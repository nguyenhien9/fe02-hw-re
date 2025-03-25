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
        return sc.nextLine().trim().replaceAll("\\s{2,}"," ");

    }
    public int inputAge(String msg){
        while(true){
            try{
                System.out.println(msg);
                String input = sc.nextLine().trim();
                int age = Integer.parseInt(input);
                if(age <= 0){
                    System.out.println("Error: not a valid age!");
                } else{
                    return age;
                }

            } catch(NumberFormatException e){
                System.err.println("Error: not a valid age!");

            }
        }
    }
    public double inputDouble(String msg){
        while(true){
            try {
                System.out.println(msg);
                String input = sc.nextLine().trim();
                double d = Double.parseDouble(input);
               if(d < 0){
                   System.out.println("Error: not a valid number!");

               } else {
                   return d;
               }
            }catch(NumberFormatException e){
                System.err.println("Error: not a valid number!");
            }
        }
    }
    public void close(){
        sc.close();
    }
}
