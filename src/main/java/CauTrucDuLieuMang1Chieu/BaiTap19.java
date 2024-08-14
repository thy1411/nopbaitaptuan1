/*
 Viết chương trình phát sinh mảng số nguyên với giá trị ngẫu nhiên có n
phần tử (1≤n≤20), n nhập từ bàn phím

a. Sắp xếp mảng tăng dần và xuất ra màn hình
b. Nhập số nguyên x. Liệt kê các phần tử là ước số của x.
 */
package CauTrucDuLieuMang1Chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiTap19 {

    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu: ");
        n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("So phan tu khong hop le. Vui long nhap lai!: ");
            n = sc.nextInt();
        }

        // Cấp phát số phần tử cho mảng
        a = new int[n];

        // Nhập giá trị cho mảng từ bàn phím
        phatSinhMang(a);
        // Xuat mang ra man hinh
        System.out.println("===Mang a===");
        xuatMang(a);

        // Sắp xếp mảng tăng dần và xuất ra màn hình
        Arrays.sort(a);
        System.out.println("\n=== Mang sau khi sap xep tang dan ===");
        xuatMang(a);

        // Nhập số nguyên x
        System.out.print("\nNhap so nguyen x: ");
        int x = sc.nextInt();

        // Liệt kê các phần tử là ước số của x
        System.out.println("Cac phan tu la uoc so cua " + x + ":");
        lietKeUocSo(a, x);
    }

    // Phương thức phát sinh mảng với giá trị ngẫu nhiên từ 1 đến 100
    public static void phatSinhMang(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) + 1; // Giá trị ngẫu nhiên từ 1 đến 100
        }
    }

    // Phương thức xuất mảng
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Phương thức liệt kê các phần tử là ước số của x
    public static void lietKeUocSo(int[] a, int x) {
        boolean found = false;
        for (int num : a) {
            if (num != 0 && x % num == 0) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co phan tu nao la uoc so cua " + x);
        }
    }
}
