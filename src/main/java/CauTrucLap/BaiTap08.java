/*
 Viết chương trình tính tổng các số nguyên từ 1 N. N được nhập từ bàn phím.
 */
package CauTrucLap;
import java.util.Scanner;
/**
 *
 * @author ThyThy
 */
public class BaiTap08 {
    public static void main(String[] args) {
        int n;
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("===TINH TONG DAY SO : 1+2+3+...+= ===");
       
        System.out.print("Nhap gia tri n: ");
        n=sc.nextInt();
       
        s=0;
        for (int i = 1;i <=n ; i++)
        {
            s=s+i; //s+=i;
        }
//        int i = 1;
//        while (i<=n)
//        {
//            s=s+i;
//            i++;
//        }
//        do
//        {
//            s=s+i;
//            i++;
//        }while (i<n);
       
        System.out.println("Tong day so: " + s);
    }
}
