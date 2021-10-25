package com.tailvt2004110014.tuan06.quanlynhanvien;

import java.util.Scanner;

public class NhanVien {

    String tenNV;
    int thunhapNV;
    String diachi;
    String bophanlamviec;

    Scanner sc = new Scanner(System.in);
    
    NhanVien(){}

    public void inThongTinNhanVien(){
        System.out.println("=======================");
        System.out.println("Tên Nhân Viên: "+tenNV);
        System.out.println("Thu Nhập: "+thunhapNV);
        System.out.println("Địa Chỉ nơi ở: "+diachi);
        System.out.println("Bộ phận làm việc: "+bophanlamviec);
    }

    public void nhapThongTinNhanVien(){
        System.out.println("Tên Nhân Vien: ");
        tenNV = sc.nextLine();
        System.out.println("Thu Nhập: ");
        thunhapNV = sc.nextInt();
        System.out.println("Địa chỉ nơi ở: ");
        diachi = sc.nextLine();
        System.out.println("Bô Phận Làm việc: ");
        bophanlamviec = sc.nextLine();
    }
    
}
