package com.tailvt2004110014.tuan07.quanlymeolinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyMeoTestDrive {
    static QuanLyMeo qlmeo = new QuanLyMeo();
    static Scanner bienNhap = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("> > > > MENU > > > >");
        System.out.println("1.  Thêm mèo vào danh sách");
        System.out.println("2.  In danh sách");
        System.err.println("3.  Tìm mèo trong danh sách");
        System.out.println("4.  Thêm con mèo vào trước con mèo");
        System.out.println("5.  Xoá con mèo");
        System.out.println("6.  Sửa thông tin");
        System.out.print("Nhập số để thực hiện chức năng: ");
        String number = bienNhap.nextLine();
        switch (number) {
        case "1":
            themMeo();
            break;
        case "2":
            inThongTin();
            break;
        case "3":
            timMeo();
            break;
        case "4":
            themMeoTruocMeo();
            break;
        case "5":
            xoaMeo();
            break;
        case "6":
            sua();
            break;
        default: {
            System.out.println("Số nhập vào không hợp lệ");
            nhanEnterDeTiepTuc();
            menu();
            break;
        }
        }
    }

    static void nhanEnterDeTiepTuc() {
        System.out.println("Nhấn Enter để tiếp tục");
        bienNhap.nextLine();
    }

    static void themMeo() {
        while (true) {
            qlmeo.add();
            System.out.println("Thêm mèo(y/n): ");
            if (bienNhap.nextLine().equals("n")) {
                break;
            }
        }
        nhanEnterDeTiepTuc();
        menu();

    }

    static void inThongTin() {
        qlmeo.inThongTin();
        nhanEnterDeTiepTuc();
        menu();
    }

    static void timMeo() {
        System.out.println("Nhập tên con mèo cần tìm:");
        String ten = bienNhap.nextLine();
        qlmeo.timXongInthongTin(ten);
        nhanEnterDeTiepTuc();
        menu();
    }

    static void themMeoTruocMeo() {
        System.out.println("Nhập tên con mèo để thêm con mèo đằng trước nó:");
        String ten = bienNhap.nextLine();
        qlmeo.timMeoRoiThemVaoDangTruoc(ten);
        nhanEnterDeTiepTuc();
        menu();
    }

    static void xoaMeo() {
        System.out.println("Nhập tên con mèo để xoá:");
        String ten = bienNhap.nextLine();
        qlmeo.xoaMeo(ten);
        nhanEnterDeTiepTuc();
        menu();
    }

    static void sua() {
        System.out.println("Nhập tên con mèo để sửa thông tin:");
        String ten = bienNhap.nextLine();
        qlmeo.sua(ten);
        nhanEnterDeTiepTuc();
        menu();
    }
}
