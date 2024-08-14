/*
 Nhập vào một tháng trong năm. In ra số ngày của tháng đó.
– Tháng có 31 ngày: 1, 3, 5, 7, 8, 10, 12
– Tháng có 30 ngày: 4, 6, 9, 11
– Tháng có 28 hoặc 29 ngày : 2
– Các trường hợp khác thì in ra câu thông báo “Tháng không hợp lệ!“.
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap07 {
    public static void main(String[] args) {
        int thang;
        int nam;
        int ngay = 0;
        boolean thanghople = true;

        Scanner sc = new Scanner(System.in);

        // Nhập tháng
        System.out.print("Nhap thang (1-12): ");
        thang = sc.nextInt();

        // Dung switch case de thực hien kiem tra so ngay trong thang
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngay = 30;
                break;
            case 2:
                // Thang 2 can nhap them nam de kiem tra nam nhuan
                System.out.print("Nhap nam: ");
                nam = sc.nextInt();

                // Kiểm tra năm nhuận
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    ngay = 29; // Nam nhuan
                } else {
                    ngay = 28; // Khong phai nam nhuan
                }
                break;
            default:
                System.out.println("Thang khong hop le!");
                thanghople = false;
        }

        // Xuat ket qua
        if (thanghople)
        System.out.println("Thang " + thang + " có " + ngay + " ngày.");
    }
}