/*
 Viết chương trình nhập vào mảng số thực có n phần tử (1≤n≤20) từ bàn
phím

a. Xuất mảng ra màn hình
b. Tính trung bình giá trị của mảng
c. Tìm phần tử có giá trị nhỏ nhất mảng
 */
package CauTrucDuLieuMang1Chieu;

import java.util.Scanner;

public class BaiTap17 {

    public static void main(String[] args) {
        //khai bao mang luu so nguyen
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        //Đọc số phần tử từ bàn phím
        System.out.print("Cho biet phan tu: ");
        n = sc.nextInt();

        //cap phat so phan tu cho mang
        a = new double[n];

        //Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

        // a. Xuất mảng ra màn hình
        System.out.println("===Mang a===");
        xuatMang(a);

        // b. Tính trung bình giá trị của mảng
        double trungBinh = tinhTrungBinh(a);
        System.out.println("\nTrung binh gia tri mang: " + trungBinh);

        // c. Tìm phần tử nhỏ nhất của mảng
        double min = timMin(a);
        System.out.println("Phan tu nho nhat: " + min);
    }

    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
    }

    // Định nghĩa phương thức tính trung bình giá trị của mảng
    public static double tinhTrungBinh(double[] a) {
        double tong = 0;
        for (double x : a) {
            tong += x;
        }
        return tong / a.length;
    }

    // Định nghĩa phương thức tìm phần tử nhỏ nhất của mảng
    public static double timMin(double[] a) {
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
