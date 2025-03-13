package lesson07;

/**
 * Class HW01
 *
 * @author Admin
 * @version 1.0
 * @date 2/3/2025
 */
public class HW0701 {
    public static void main(String[] args) {
        // Ví dụ mảng: nếu mảng chỉ có phần tử giống nhau, sẽ không có số nhỏ thứ hai
        int[] A = {9, 5, 7, 3, 8, 3};

        // Tìm số nhỏ nhất trong mảng bằng đệ quy
        int globalMin = findMin(A, 0);

        // Tìm số nhỏ thứ hai bằng đệ quy, dùng Integer.MAX_VALUE làm giá trị ban đầu cho ứng viên
        int secondMin = findSecondMin(A, 0, globalMin, Integer.MAX_VALUE);

        // Kiểm tra nếu không có số nhỏ thứ hai (tức tất cả phần tử bằng nhau)
        if(secondMin == Integer.MAX_VALUE) {
            System.out.println("Khong ton tai so nho thu hai.");
        } else {
            System.out.println("So nho nhat: " + globalMin);
            System.out.println("So nho thu hai: " + secondMin);
        }
    }
    // tìm số nhỏ nhất trong mảng từ vị trí index đến hết mảng
    public static int findMin(int[] arr, int index) {
        // Điều kiện dừng: nếu chỉ còn một phần tử
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Gọi đệ quy để tìm số nhỏ nhất của phần còn lại
        int minRest = findMin(arr, index + 1);
        // So sánh phần tử hiện tại với kết quả của phần còn lại
        return arr[index] < minRest ? arr[index] : minRest;
    }

    // Hàm đệ quy tìm số nhỏ thứ hai
    // candidate là ứng viên hiện tại cho số nhỏ thứ hai, globalMin là số nhỏ nhất của mảng
    public static int findSecondMin(int[] arr, int index, int globalMin, int candidate) {
        // Nếu đã duyệt hết mảng, trả về ứng viên
        if (index == arr.length) {
            return candidate;
        }
        // Nếu phần tử hiện tại khác globalMin và nhỏ hơn ứng viên hiện tại thì cập nhật candidate
        if (arr[index] != globalMin && arr[index] < candidate) {
            candidate = arr[index];
        }
        // Gọi đệ quy cho phần tử tiếp theo
        return findSecondMin(arr, index + 1, globalMin, candidate);
    }
}
