package lesson07;

/**
 * Class HW03
 *
 * @author Admin
 * @version 1.0
 * @date 2/3/2025
 */
public class HW0703 {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
    // Hàm tính x^n theo đệ quy
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
