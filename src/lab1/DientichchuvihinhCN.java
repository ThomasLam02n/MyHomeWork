package lab1;

import java.util.Scanner;

public class DientichchuvihinhCN {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        double chieudai = bienNhap.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double chieurong = bienNhap.nextDouble();
        
        System.out.printf("Chu vi HCN: %f", ((chieudai + chieurong)*2));
        System.out.printf("\nDien tich HCN: %f", chieudai * chieurong);
        System.out.printf("\nCạnh nho HCN: %f", Math.min(chieudai,chieurong));
    }
}