/*
 Nhập 3 số nguyên từ bàn phím. In ra số nhỏ nhất.
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap03 {
    public static void main(String[] args) {
        int a, b, c;
        String min = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        b = sc.nextInt();
        System.out.print("Nhap so nguyen thu ba: ");
        c = sc.nextInt();

        //B3. Giai va bien luan
        if (a < b && a < c) {
            min = "So nho nhat là: " + a;
        } else if (b < a && b < c) {
            min = "So nho nhat la: " + b;
        } else {
            min = "So nho nhat la: " + c;
        }
        //Xuat ket qua
        System.out.println(min);
    }
}
