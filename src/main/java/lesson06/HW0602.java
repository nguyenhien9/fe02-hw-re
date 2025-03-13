package lesson06;

/**
 * Class HW02
 *
 * @author Admin
 * @version 1.0
 * @date 1/3/2025
 */
public class HW0602 {
    public static void main(String[] args) {
        int[] A = {9, 7, 12, 8, 6, 5};

        // Sắp xếp mảng theo thứ tự tăng dần
        bubbleSort(A);

        // In các phần tử theo định dạng: lớn nhất, nhỏ nhất, lớn thứ 2, nhỏ thứ 2,...
        printMaxMinArray(A);
    }

    public static void printMaxMinArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            System.out.print(arr[j] + " ");  // in phần tử lớn
            System.out.print(arr[i] + " ");  // in phần tử nhỏ
            i++;
            j--;
        }
        // Nếu số phần tử lẻ thì in phần tử ở giữa một lần
        if (i == j) {
            System.out.print(arr[i]);
        }
    }
    // Hàm bubbleSort: sắp xếp mảng theo thứ tự tăng dần
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
