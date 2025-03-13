package lesson05;

import java.util.Scanner;

/**
 * Class HW06
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0506 {
    public static void main(String[] args) {
        System.out.println("+------- Symmetric Array -------+");
        int[] myArr = {1,2,3,3,2,1,4};
        boolean isSymmetric = isSymmetricArray(myArr);
        if (isSymmetric){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

    /*
    * LOOP from 0 --> middle of array
    * */
    public static boolean isSymmetricArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
