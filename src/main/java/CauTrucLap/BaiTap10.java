/*
 Nhập số nguyên dương n. Kiểm tra n có phải là số nguyên tố không? Ví dụ: 2, 3, 5, 7
 */
package CauTrucLap;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhapso nguyen duong n: ");
        n = sc.nextInt();

        // Kiểm tra số nguyên tố
        if (n <= 1) {
            System.out.println(n + " khong phai so nguyem to.");
        } else if (kiemTraSoNguyenTo(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean kiemTraSoNguyenTo(int n) {
        if (n <= 1) {
            return false; // 0 và 1 không phải số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu n chia hết cho i, thì n không phải là số nguyên tố
            }
        }
        return true; // Nếu không tìm thấy ước số nào, n là số nguyên tố
    }

}
