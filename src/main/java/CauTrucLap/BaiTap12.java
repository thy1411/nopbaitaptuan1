/*
 Nhập một số nguyên dương n (n > 0). Hãy cho biết chữ số lớn nhất và nhỏ
nhất?
 */
package CauTrucLap;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Nhập số nguyên dương n
        do {
            System.out.print("Nhap mot so nguyen duong n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("N phai la so nguyen duong lon hon 0. Vui long nhap lai!");
            }
        } while (n <= 0);

        // Chữ số lớn nhất và nhỏ nhất
        int soLonNhat = -1; // Tạo soLonNhat với giá trị nhỏ hơn 0
        int soNhoNhat = 10; // Tạo soNhoNhat với giá trị lớn hơn 9

        int goc = n; // Giá trị gốc của n

        while (goc > 0) {
            int so = goc % 10; // Lấy chữ số cuối cùng
            if (so > soLonNhat) {
                soLonNhat = so; // Cập nhật chữ số lớn nhất
            }
            if (so < soNhoNhat) {
                soNhoNhat = so; // Cập nhật chữ số nhỏ nhất
            }
            goc /= 10; // Bỏ chữ số cuối cùng
        }

        // In kết quả
        System.out.println("Chu so nho nhat la: " + soNhoNhat);
        System.out.println("Chu so lon nhat la: " + soLonNhat);
    }
}
