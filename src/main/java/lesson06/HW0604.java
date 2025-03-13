package lesson06;

/**
 * Class HW04
 *
 * @author Admin
 * @version 1.0
 * @date 1/3/2025
 */
public class HW0604 {
    public static void main(String[] args) {
        int[] A = {8, 4, 5, 2, 10};
        int N = A.length;
        int K = 2;

        // Sắp xếp mảng theo thứ tự tăng dần bằng Bubble Sort
        bubbleSort(A, N);

        // Xác định kích thước của nhóm có số phần tử nhỏ hơn
        int smallGroupSize = myMin(K, N - K);

        // Tính tổng toàn bộ mảng
        int totalSum = sumSubArray(A, 0, N - 1);

        // Tính tổng của nhóm nhỏ (các phần tử bé nhất)
        int sumSmallGroup = sumSubArray(A, 0, smallGroupSize - 1);

        // Hiệu tối đa: tổng nhóm lớn - tổng nhóm nhỏ = totalSum - 2 * (tổng nhóm nhỏ)
        int maxDifference = totalSum - 2 * sumSmallGroup;

        System.out.println("Hieu lon nhat giua tong hai mang la: " + maxDifference);
    }

    // Hàm tính giá trị nhỏ hơn của 2 số
    public static int myMin(int a, int b) {
        return (a <= b) ? a : b;
    }

    // Hàm sắp xếp mảng theo thứ tự tăng dần dùng Bubble Sort
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Hàm hoán đổi 2 phần tử trong mảng
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Hàm tính tổng các phần tử của mảng từ chỉ số start đến end (cả hai đầu)
    public static int sumSubArray(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
