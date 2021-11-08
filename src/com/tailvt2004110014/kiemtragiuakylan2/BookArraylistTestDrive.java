package com.tailvt2004110014.kiemtragiuakylan2;

import java.util.Scanner;

public class BookArraylistTestDrive {
    public static void main(String[] args) {

        BookArrayList qlBook = new BookArrayList();
        Scanner bienNhap = new Scanner(System.in);

        do {
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Nhập Danh Sách Book           |");
            System.out.println("2)  Xuất Danh Sách Book           |");
            System.out.println("3)  Tìm Theo Mã                   |");
            System.out.println("4)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = bienNhap.nextInt();

            switch (key) {
            case 1:
                qlBook.nhapVaoDanhSach();
                break;
            case 2:
                qlBook.xuatDanhSach();
                break;
            case 3:
                qlBook.timTheoMa();
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
