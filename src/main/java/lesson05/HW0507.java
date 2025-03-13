package lesson05;

/**
 * Class HW07
 *
 * @author Admin
 * @version 1.0
 * @date 23/2/2025
 */
public class HW0507 {
    public static void main(String[] args) {
        int[] myArr = {10,3,5,5,4,3,2};
        int result = findRepeatingNumber(myArr);
        if (result == -1){
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }

    public static int findRepeatingNumber(int[] arr) {
        int length = arr.length;
        int minIndex = length;  // index of repeated number
        int repeatingNum = -1;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                // if repeated
                if (arr[i] == arr[j]) {
                    if (i < minIndex) {
                        minIndex = i;
                        repeatingNum = arr[i];
                    }
                    break;
                }
            }
        }
        return repeatingNum;
    }

}
