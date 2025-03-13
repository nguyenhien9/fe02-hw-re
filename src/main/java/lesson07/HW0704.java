package lesson07;

/**
 * Class HW04
 *
 * @author Admin
 * @version 1.0
 * @date 2/3/2025
 */
public class HW0704 {
    public static void main(String[] args) {
        int n = 10;
        int result = recursiveSum(n);
        System.out.println("Tong 1 + 2 + ... + " + n + " = " + result);
    }
    // Hàm tính tổng từ 1 đến n theo đệ quy
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

}
