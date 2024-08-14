/*
 Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến 99
sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó.
 */
package CauTrucLap;

/**
 *
 * @author ThyThy
 */
public class BaiTap13 {

    public static void main(String[] args) {
        int songuyen;
        // Duyệt qua tất cả các số nguyên trong phạm vi từ 10 đến 99
        for (songuyen = 10; songuyen <= 99; songuyen++) {
            // Tách hai chữ số của số nguyên
            int sochuc = songuyen / 10; // Chữ số ở hàng chục
            int sodonvi = songuyen % 10; // Chữ số ở hàng đơn vị

            // Tính tích và tổng củahai chữ số
            int tich = sochuc * sodonvi;
            int tong = sochuc + sodonvi;

            // Kiểm tra va xuất ra màn hinh
            if (tich == 2 * tong) {
                System.out.println("So " + songuyen + " thoa de bai");
            }
        }
    }
}
