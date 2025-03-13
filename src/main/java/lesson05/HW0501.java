package lesson05;


import java.util.Scanner;

/**
 * Class HW01
 *
 * @author Admin
 * @version 1.0
 * @date 22/2/2025
 */
public class HW0501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n= getValidNumber(sc,"Enter the number of elements in the array (must be > 0)" );
            if (n <=0){
                System.err.println("The number of elements must be > 0!");
            }
        } while(n <= 0);
        int[] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getValidNumber(sc,"Enter element " + (i +1));
        }
        int sum = sumArray(myArray);
        System.out.println("sum = " + sum);
        sc. close();

    }
    public static int getValidNumber(Scanner sc, String msg){
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

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
