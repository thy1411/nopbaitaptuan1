/*
 Viết chương trình nhập vào mảng số nguyên có n phần tử (1≤n≤50) từ bàn
phím.

a. Xuất mảng ra màn hình
b. Liệt kê các phần tử không phải số nguyên tố
c. Tính giá trị trung bình của phần tử là số nguyên tố.
 */
package CauTrucDuLieuMang1Chieu;

import java.util.Scanner;

public class BaiTap18 {

    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu: ");
        n = sc.nextInt();
        while (n < 1 || n > 50) {
            System.out.print("So phan tu khong hop le. Vui long nhap lai!: ");
            n = sc.nextInt();
        }

        // Cấp phát số phần tử cho mảng
        a = new int[n];

        // Nhập giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

        // a. Xuất mảng ra màn hình
        System.out.println("===Mang a===");
        xuatMang(a);

        // b. Liệt kê các phần tử không phải số nguyên tố
        System.out.print("\nCac phan tu khong phai so nguyen: ");
        lietKeKhongPhaiSoNguyenTo(a);

        // b Tính giá trị trung bình của các số nguyên tố
        double trungBinh = tinhTrungBinhSoNguyenTo(a);
        System.out.println("\nTrung binh gia tri cua cac so nguyen to: " + trungBinh);
    }

    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Định nghĩa phương thức liệt kê các phần tử không phải số nguyên tố
    public static void lietKeKhongPhaiSoNguyenTo(int[] a) {
        for (int x : a) {
            if (!laSoNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    // Định nghĩa phương thức kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Định nghĩa phương thức tính giá trị trung bình của các số nguyên tố
    public static double tinhTrungBinhSoNguyenTo(int[] a) {
        int tong = 0;
        int dem = 0;
        for (int x : a) {
            if (laSoNguyenTo(x)) {
                tong += x;
                dem++;
            }
        }
        return dem > 0 ? (double) tong / dem : 0;
    }
}
