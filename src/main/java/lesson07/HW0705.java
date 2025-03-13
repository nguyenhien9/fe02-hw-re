package lesson07;

/**
 * Class HW05
 *
 * @author Admin
 * @version 1.0
 * @date 2/3/2025
 */
public class HW0705 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println("Tam giac dac biet cua A:");
        printSpecialTriangle(A, A.length);
    }

    // Hàm in tam giác đặc biệt từ dãy A với độ dài len hiện tại
    public static void printSpecialTriangle(int[] A, int len) {
        printArray(A, len); // in hàng hiện tại
        if (len == 1) {     // nếu chỉ còn 1 phần tử, dừng đệ quy
            return;
        }
        // Tạo hàng tiếp theo (độ dài giảm đi 1)
        int[] nextRow = new int[len - 1];
        for (int i = 0; i < len - 1; i++) {
            nextRow[i] = A[i] + A[i + 1];
        }
        printSpecialTriangle(nextRow, len - 1);
    }

    // Hàm hỗ trợ in mảng (in len phần tử đầu tiên)
    public static void printArray(int[] A, int len) {
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(A[i]);
            if (i < len - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
