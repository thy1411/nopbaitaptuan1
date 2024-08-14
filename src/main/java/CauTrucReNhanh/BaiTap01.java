/*
 Giải phương trình bậc nhất.
 */
package CauTrucReNhanh;

import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        double a, b;
        String ketqua = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("===GIAI PHUONG TRINH BAC 1: ax + b = 0===");
        System.out.print("Nhap he so a: ");
        a=sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b=sc.nextDouble();
        //b2. Giai va bien luan
        if(a==0)
        {
            if(b==0)
            {
                ketqua="Phuong trinh VSN";
            }
            else
            {
                ketqua="Phuong trinh vo nghiem";
            }
        }
        else //a!=0
        {
            ketqua="Phuong trinh co nghiem x = " + (-b/a);
        }
        //b3. Xuat ket qua
        System.out.println(ketqua);
    }
}
