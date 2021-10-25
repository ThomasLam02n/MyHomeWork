package com.tailvt2004110014.kiemtragiuaky;

import java.util.Scanner;

public class khoAppleTestDrive {
    public static void main(String[] args) {
        KhoApple qlApple = new KhoApple();
        Scanner bienNhap = new Scanner(System.in);

        do {
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Nhập Danh Sách Apple           |");
            System.out.println("2)  Xuất Danh Sách Apple           |");
            System.out.println("3)  Tìm Theo Màu                   |");
            System.out.println("4)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = bienNhap.nextInt();

            switch (key) {
            case 1:
                qlApple.nhapVaoDanhSach();
                break;
            case 2:
                qlApple.xuatDanhSach();
                break;
            case 3:
                qlApple.timTheoMau();
                break;
            case 4:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
            }

            System.out.println("Quay về MENU (y/n)?: "); // tạo nút quay về mỗi lần sài 1 chức năng !
            bienNhap.nextLine();

        } while (bienNhap.nextLine().equals("y"));
    }
}
