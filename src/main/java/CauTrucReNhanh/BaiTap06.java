/*
 Nhập vào 2 số nguyên và 1 phép toán.
– Nếu phép toán là “+”, “-”, “*” thì in ra kết quả là tổng,hiệu, tích của 2 số.
– Nếu phép toán là “/” thì kiểm tra xem số thứ 2 có khác không hay không? Nếu
khác không thì in ra thương của chúng, ngược lại thì in ra thông báo “Không thể
chia cho 0!!”.
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap06 {
    public static void main(String[] args) {
        int so1, so2;
        char pheptoan;
        double ketqua = 0;
        boolean ketquahople = true;

        Scanner sc = new Scanner(System.in);

        // Nhap vao man hinh 2 so nguyen
        System.out.print("Nhap so nguyen thu nhat: ");
        so1 = sc.nextInt();

        System.out.print("Nhap so nguyen thu 2: ");
        so2 = sc.nextInt();

        // Nhap phep toan + - * /
        System.out.print("Nhap phep toan (+, -, *, /): ");
        pheptoan = sc.next().charAt(0);

        // Su dung switch case de thuc hien phep toan dua tren phep toan da nhap
        switch (pheptoan) {
            case '+':
                ketqua = so1 + so2;
                break;
            case '-':
                ketqua = so1 - so2;
                break;
            case '*':
                ketqua = so1 * so2;
                break;
            case '/':
                if (so2 != 0) {
                    ketqua = (double) so1 / so2;
                } else {
                    System.out.println("Khong the chia cho 0!!");
                    ketquahople = false;
                }
                break;
            default:
                System.out.println("Phep toan khong hop le!");
                ketquahople = false;
        }

        // Xuat ket qua
        if (ketquahople) {
            System.out.println("Ketqua: " + ketqua);
        }
    }
}
