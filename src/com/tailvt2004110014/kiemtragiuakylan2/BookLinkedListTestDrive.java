package com.tailvt2004110014.kiemtragiuakylan2;

import java.util.Scanner;

public class BookLinkedListTestDrive {
    static BookLinkedList qlBook = new BookLinkedList();
    static Scanner bienNhap = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    static void menu() {
        System.out.println("> > > > MENU > > > >");
        System.out.println("1.  Thêm Book vào danh sách");
        System.out.println("2.  In danh sách");
        System.err.println("3.  Tìm Book trong danh sách");
        System.out.println("4.  Thêm book vào trước 1 book");
        System.out.println("5.  Xoá book");
        System.out.print("Nhập số để thực hiện chức năng: ");
        String number = bienNhap.nextLine();
        switch (number) {
        case "1":
            themBook();
            break;
        case "2":
            inThongTin();
            break;
        case "3":
            timBook();
            break;
        case "4":
            themBookDangTruoc();
            break;
        case "5":
            xoaBook();
            break;
        default: {
            System.out.println("Số nhập vào không hợp lệ");
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

    static void themBook(){
        while(true){
            qlBook.add();
            System.out.println("Thêm Book(y/n): ");
            if (bienNhap.nextLine().equals("n")) {
                break;
            }
        }
    }

    static void inThongTin(){
        qlBook.inThongTin();
        backtoMenu();
    }
    
    static void timBook(){
        System.out.println("Nhập Mã cần tìm: ");
        String ma = bienNhap.nextLine();
        qlBook.timXongInthongTin(id);
        backtoMenu();
    }

    static void themBookDangTruoc(){
        System.out.println("Nhập Mã thêm Book đằng trước nó:");
        String ma = bienNhap.nextLine();
        qlBook.timMeoRoiThemVaoDangTruoc(id);
    }

    static void xoaBook() {
        System.out.println("Nhập tên con mèo để xoá:");
        String ma = bienNhap.nextLine();
        qlBook.xoaBook(id);
}
