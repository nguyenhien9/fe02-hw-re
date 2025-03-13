package lesson07;

/**
 * Class HW02
 *
 * @author Admin
 * @version 1.0
 * @date 2/3/2025
 */
public class HW0702 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11}; // mảng đã sắp xếp theo thứ tự tăng dần
        int x = 7;  // ví dụ: tìm 7
        int result = binarySearchRecursive(sortedArray, x, 0, sortedArray.length - 1);
       if (result == 1){
           System.out.println("Tim thay " + x);
       } else {
           System.out.println("Khong tim thay " + x);
       }
    }

    // trả về 1 nếu tìm thấy, -1 nếu không tìm thấy.
    public static int binarySearchRecursive(int[] A, int X, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (A[mid] == X) {
            return 1;
        } else if (A[mid] > X) {
            return binarySearchRecursive(A, X, low, mid - 1);
        } else {
            return binarySearchRecursive(A, X, mid + 1, high);
        }
    }
}
