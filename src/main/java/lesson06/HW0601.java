package lesson06;

/**
 * Class HW01
 *
 * @author Admin
 * @version 1.0
 * @date 1s/3/2025
 */
public class HW0601 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        int N = arr.length;

        // Khai báo mảng đếm tần suất (với chỉ số từ 0 đến 20) và mảng lưu vị trí xuất hiện đầu tiên
        int[] freq = new int[21];  // Mặc định các phần tử là 0
        int[] pos  = new int[21];  // Sẽ lưu vị trí xuất hiện đầu tiên, khởi tạo bằng -1
        for (int i = 0; i < 21; i++) {
            pos[i] = -1;
        }

        // Tính tần suất và ghi nhận vị trí xuất hiện đầu tiên cho từng số
        computeFrequencyAndPos(arr, N, freq, pos);

        // Tạo một bản sao của mảng A để sắp xếp giữ nguyên dữ liệu gốc
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = arr[i];
        }


        bubbleSortCustom(B, N, freq, pos);


        printArray(B, N);
    }

    // Hàm tính tần suất và lưu vị trí xuất hiện đầu tiên của từng số trong mảng A
    public static void computeFrequencyAndPos(int[] A, int N, int[] freq, int[] pos) {
        for (int i = 0; i < N; i++) {
            int value = A[i];
            freq[value]++;  // Tăng tần suất của số đó lên 1
            if (pos[value] == -1) {  // Nếu chưa có vị trí xuất hiện nào được ghi nhận
                pos[value] = i;     // Lưu vị trí xuất hiện đầu tiên
            }
        }
    }

    // Hàm Bubble Sort với so sánh theo tiêu chí:
    // 1. Tần suất xuất hiện (giá trị cao hơn được ưu tiên, tức sắp xếp giảm dần)
    // 2. Nếu tần suất bằng nhau, số xuất hiện sớm trong mảng A (vị trí nhỏ hơn) được ưu tiên.
    public static void bubbleSortCustom(int[] arr, int N, int[] freq, int[] pos) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (compare(arr[j], arr[j + 1], freq, pos) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Hàm so sánh 2 số a và b theo tiêu chí:
    // - Nếu tần suất của a nhỏ hơn b, a nên đứng sau b (trả về số dương).
    // - Nếu tần suất bằng nhau, số có vị trí xuất hiện đầu tiên nhỏ hơn được ưu tiên.
    public static int compare(int a, int b, int[] freq, int[] pos) {
        if (freq[a] != freq[b]) {
            return freq[b] - freq[a];  // Sắp xếp giảm dần theo tần suất
        }
        return pos[a] - pos[b];  // Nếu tần suất bằng nhau, sắp xếp tăng dần theo vị trí xuất hiện
    }

    // Hàm in mảng kết quả
    public static void printArray(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
