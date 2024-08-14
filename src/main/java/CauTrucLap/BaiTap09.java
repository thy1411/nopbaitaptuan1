/*
 Viết chương trình đếm số ước số của số nguyên dương N (n>0).
Ví dụ: N=12
 số ước số của 12 là 6
 */
package CauTrucLap;
import java.util.Scanner;
/**
 *
 * @author ThyThy
 */
public class BaiTap09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int uocso = 0;
        
        Scanner sc = new Scanner(System.in);
        
        // Nhap so nguyen duong N
        do {
            System.out.print("Nhap so nguyen duong N: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("N phai la so nguyen duong lon hon 0. Vui long nhap lai!");
            }
        } while (n <= 0);
        
        // Đếm số ước số của N
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                uocso++;
            }
        }
        
        // Xuat ket qua
        System.out.println("So uoc so cua " + n + " la " + uocso);
    }
}
