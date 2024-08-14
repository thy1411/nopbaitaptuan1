/*
 Nhập vào điểm 3 môn toán, văn, anh của 1 học sinh, viết chương trình đưa
ra xếp loại của học sinh đó theo điểm trung bình như sau:
– [0, 4.0): Yếu
– [4.0, 6.5): Trung bình
– [6.5, 8.0): Khá
– [8.0, 10]: Giỏi
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap02 {
    public static void main(String[] args) {
        double toan, van, anh;
        double dtb;
        String ketqua = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("===XEP HANG HOC LUC===");
        System.out.print("Nhap diem toan: ");
        toan = sc.nextDouble();
        System.out.print("Nhap diem van: ");
        van = sc.nextDouble();
        System.out.print("Nhap diem anh: ");
        anh = sc.nextDouble();

        dtb = (toan + van + anh) / 3;

        if (dtb < 4) {
            ketqua = "Yeu";
        } else if (dtb < 6.5) {
            ketqua = "Trung binh";
        } else if (dtb < 8) {
            ketqua = "Kha";
        } else {
            ketqua = "Gioi";
        }

        System.out.println("DTB: " + dtb + " - Xep loai: " + ketqua);
    }
}
