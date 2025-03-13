package lesson05;

import java.util.Scanner;

/**
 * Class HW02
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLenngth, n;
        do {
            arrayLenngth= getValidNumber(sc,"Enter the number of elements in the array (must be > 0)" );
            if (arrayLenngth <=0){
                System.err.println("The number of elements must be > 0!");
            }
        } while(arrayLenngth <= 0);
        int[] myArray = new int[arrayLenngth];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getValidNumber(sc,"Enter element " + (i +1));
        }
        // integer n
        n = getValidNumber(sc, "Enter a integer");
        int indexOfN = getElementIndex(myArray, n);
        System.out.println("indexOfN = " + indexOfN);

        sc. close();
    }

    public static int getValidNumber(Scanner sc, String msg) {
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

    // return index of the first appearance
    public static int getElementIndex(int[] arr, int n){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
