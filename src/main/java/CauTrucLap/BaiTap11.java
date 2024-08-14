/*
 Nhập một số nguyên dương n (n > 0). Hãy cho biết n có phải là số đối
xứng? Ví dụ: 121, 12321, ...
 */
package CauTrucLap;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương n
        do {
            System.out.print("Nhap mot so nguyen duong n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("N phai la so nguyen duong lon hon 0. Vui long nhap lai!");
            }
        } while (n <= 0);

        // Kiểm tra số đối xứng
        if (kiemTraSoDoiXung(n)) {
            System.out.println(n + " la so doi xung.");
        } else {
            System.out.println(n + " khong phai so doi xung.");
        }
    }

    // Phương thức kiểm tra số đối xứng
    public static boolean kiemTraSoDoiXung(int n) {
        int goc = n; // Giá trị gốc của n
        int daoNguoc = 0; // Số đảo ngược của n

        // Đảo ngược số
        while (n != 0) {
            int so = n % 10; // Lấy chữ số cuối cùng của n
            daoNguoc = daoNguoc * 10 + so; // Thêm chữ số vào số đảo ngược
            n /= 10; // Bỏ chữ số cuối cùng của n
        }

        // So sánh số gốc và số đảo ngược
        return goc == daoNguoc;
    }
}
