package lesson06;

/**
 * Class HW03
 *
 * @author Admin
 * @version 1.0
 * @date 1/3/2025
 */
public class HW0603 {
    public static void main(String[] args) {
        int[] A = {5, 7, 9, 3, 6, 2};
        int n = A.length;

        // Tìm giá trị nhỏ nhất và lớn nhất trong mảng A
        int min = findMin(A, n);
        int max = findMax(A, n);

        // Tính số phần tử bị thiếu trong khoảng [min, max]
        int missingCount = countMissing(A, n, min, max);
        System.out.println("So phan tu can them: " + missingCount);

        // In ra các số bị thiếu
        System.out.print("Cac so thieu: ");
        printMissingNumbers(A, n, min, max);
    }
    public static int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // Hàm tìm số lớn nhất trong mảng
    public static int findMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // Hàm kiểm tra xem giá trị 'value' có tồn tại trong mảng không
    public static boolean isInArray(int[] arr, int n, int value) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
    public static int countMissing(int[] arr, int n, int min, int max) {
        int count = 0;
        for (int num = min; num <= max; num++) {
            if (!isInArray(arr, n, num)) {
                count++;
            }
        }
        return count;
    }
    // Hàm in ra các số bị thiếu trong khoảng [min, max]
    public static void printMissingNumbers(int[] arr, int n, int min, int max) {
        for (int num = min; num <= max; num++) {
            if (!isInArray(arr, n, num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
