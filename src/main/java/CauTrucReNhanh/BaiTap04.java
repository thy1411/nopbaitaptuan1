/*
 Nhập vào một số nguyên. Kiểm tra số vừa nhập là số chẵn hay lẻ.
 */
package CauTrucReNhanh;
import java.util.Scanner;
/**
 *
 * @author ThyThy
 */
public class BaiTap04 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        
        //Nhập vào một số nguyên.
        System.out.print("Nhap vao mot so nguyen: ");
        number = sc.nextInt();
        
        //Kiểm tra số vừa nhập là số chẵn hay lẻ.
        if (number % 2 == 0) {
            System.out.println("So " + number + " la so chan.");
        } else {
            System.out.println("So " + number + " la so le.");
        }
    }
}