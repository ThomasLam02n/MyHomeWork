package com.tailvt2004110014.tuan05;

import java.util.Scanner;

public class QuanLySinhVienTestDrive {
    public static void main(String[] args) {

        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner bienNhap = new Scanner(System.in);
        
        do {
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Nhập Danh Sách Sinh Viên       |");
            System.out.println("2)  Xuất Danh Sách Sinh Viên       |");
            System.out.println("3)  Sắp Xếp                        |");
            System.out.println("4)  Xuất Danh Sách SV Ngẫu Nhiên   |");
            System.out.println("5)  Xoá                            |");
            System.out.println("6)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = bienNhap.nextInt();

            switch (key) {
            case 1:
                ql.nhapthongtin();
                break;
            case 2:
                ql.xuatthongtin();
                break;
            case 3:
                ql.sapxepthongtin();
                break;
            case 4:
                ql.xuatngaunhien();
                break;
            case 5:
                ql.timTenSV();
                break;
            case 6:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
            }

            System.out.println("Quay về MENU (y/n)?: "); // tạo nút quay về mỗi lần sài 1 chức năng !
            bienNhap.nextLine();

        } while (bienNhap.nextLine().equals("y"));
    }
}
