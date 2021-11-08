package com.tailvt2004110014.tuan07.quanlycholinkedlist;

import java.util.Scanner;

public class QuanLyDogTestDrive {
    static QuanLyDog qld = new QuanLyDog();
    static Scanner bienNhap = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

       static void menu(){
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Nhập Thông Tin                 |");
            System.out.println("2)  Xuất Danh Sách MT              |");
            System.out.println("3)  Thêm Một Đối Tượng             |");
            System.out.println("4)  Xoá                            |");
            System.out.println("5)  Tìm theo tên                   |");
            System.out.println("6)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = bienNhap.nextInt();

            switch (key) {
            case 1:
                themDog();
                break;
            case 2:
                inThongTin();
                break;
            case 3:
                timThongTin();
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default: {
                System.out.println("Số nhập vào không hợp lệ");
                backtoMenu();
                break;
            }
        }
        } 

    static void backtoMenu(){
        while(true){
        System.out.println("Về Menu(y/n):");
        bienNhap.nextLine();
        if(bienNhap.nextLine().equals("y")){
            menu();
        }
    }
    }

    static void themDog() {
        while (true) {
            qld.add();
            bienNhap.nextLine();
            System.out.println("Nhập thêm(y/n)?:");
            if (bienNhap.nextLine().equals("n")) {
                break;
            }
        }
        backtoMenu();
    }
    static void inThongTin(){
        qld.xuatthongtin();
        backtoMenu();
    }

    static void timThongTin(){
        System.out.println("Nhập tên Dog cần tìm: ");
        String ten = bienNhap.nextLine();
        qld.timXongInthongTin(ten);
        backtoMenu();
    }

}
