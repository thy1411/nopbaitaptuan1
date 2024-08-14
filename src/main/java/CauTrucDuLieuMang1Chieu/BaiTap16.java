/*
 Viết chương trình nhập vào mảng số nguyên có n phần tử (1≤n≤20) từ bàn
phím.

a. Xuất mảng ra màn hình
b. Tính tổng giá trị các phần tử của mảng

c. Đếm có bao nhiêu số dương lẻ
d. Tìm phần tử lớn nhất của mảng
 */
package CauTrucDuLieuMang1Chieu;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class BaiTap16 {

    public static void main(String[] args) {
        //khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        //Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("So phan tu khong hop le. Vui long nhap lai!: ");
            n = sc.nextInt();
        }
        //cap phat so phan tu cho mang
        a = new int[n];
        //Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);
        //a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);
        //b.Tinh tong mang
        int tong = tinhTong(a);
        System.out.print("\nTong gia tri mang:" + tong);
        //c.Dem duong le trong mang
        int dem_duong_le = demDuongLe(a);
        System.out.print("\nSo duong le co trong mang:" + dem_duong_le);
        int max = TimMax(a);
        System.out.print("\nPhan tu lon nhat:" + max);
    }
    //dinh nghia phuong thuc nhap mang

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    //dinh nghia phuong thuc xuat mang

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    //dinh nghia phuong thuc dem phan duong le
    public static int tinhTong(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x; //s=s+x;
        }
        return sum;
    }
    //dinh nghia phuong thuc dem phan duong le

    public static int demDuongLe(int[] a) {
        int dem_duong_le = 0;
        for (int x : a) {
            if (x > 0 && x % 2 != 0) {
                dem_duong_le++;
            }
        }
        return dem_duong_le;
    }
    //phuong thuc tim phan tu lon nhat mang

    public static int TimMax(int[] a) {
        //d.Tim phan tu lon nhat cua mang
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
