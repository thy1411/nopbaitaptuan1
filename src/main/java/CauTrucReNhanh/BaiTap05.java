/*
Tính tiền đi taxi từ số km nhập vào. Biết:

a. 1 km đầu giá 15000đ
b. Từ km thứ 2 đến km thứ 5 giá 13500đ
c. Từ km thứ 6 trở đi giá 11000đ
d. Nếu trên 120km được giảm 10% tổng tiền.
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap05 {
    public static void main(String[] args) {
        double sokm;
        String giatien = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so km: ");
        sokm = sc.nextDouble();

        if (sokm <= 0) {
            giatien = "So km khong hop le, vui long nhap lai!";
        }
        if (sokm <= 1) {
            giatien = "Gia tien da di cua ban la: " + (sokm * 15000);
        }
        if (sokm <= 5) {
            giatien = "Gia tien da di cua ban la: " + (15000 + (sokm - 1) * 13500);
        } else {
            giatien = "Gia tien da di cua ban la: " + (15000 + 4 * 13500 + (sokm - 5) * 11000);
        }

        if (sokm > 120) {
            giatien = "Gia tien da di cua ban la: " + ((15000 + 4 * 13500 + (sokm - 5) * 11000) * 0.9);
        }

        System.out.println(giatien);
    }
}
