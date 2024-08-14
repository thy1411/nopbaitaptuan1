/*
 Viết chương trình nhập vào mảng số nguyên có n phần tử (1≤n≤20) từ bàn
phím

a. Nhập số nguyên x. Cho biết x có xuất hiện trong mảng a? Nếu có thì ở
vị trí đầu tiên nào?
b. Kiểm tra mảng có tính chất tăng dần không?
 */
package CauTrucDuLieuMang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap20 {

    /**
     * @param args the command line arguments
     */
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
        nhapMang(a, sc);

        // Xuất mảng ra màn hình
        System.out.println("===Mang a===");
        xuatMang(a);

        // Nhập số nguyên x và tìm kiếm trong mảng
        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();
        int viTri = timViTriDauTien(a, x);
        if (viTri != -1) {
            System.out.println("So " + x + " xuat hien dau tien tai vi tri: " + viTri);
        } else {
            System.out.println("So " + x + " khong xuat hien trong mang.");
        }

        // Kiểm tra tính chất tăng dần của mảng
        if (kiemTraTangDan(a)) {
            System.out.println("Mang co tinh chat tang dan.");
        } else {
            System.out.println("Mang khong co tinh chat tang dan.");
        }
    }

    // Phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    // Phương thức xuất mảng
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Phương thức tìm vị trí đầu tiên của số x trong mảng
    public static int timViTriDauTien(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i + 1; // Trả về vị trí (bắt đầu từ 1)
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    // Phương thức kiểm tra mảng có tính chất tăng dần không
    public static boolean kiemTraTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // Nếu có một cặp phần tử không tăng dần thì trả về false
            }
        }
        return true; // Trả về true nếu tất cả các cặp phần tử đều tăng dần
    }
}
