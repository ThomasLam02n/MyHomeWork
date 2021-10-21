package com.tailvt2004110014.tuan05;

import java.util.Scanner;

public class Sinhvien {

    String hovatenSV;
    int masoSV;
    String ngaysinh;
    String quequan;

    Sinhvien() {

    }

    public void Sinhvien(String hvt, int mssv, String date, String que) {
        hovatenSV = hvt;
        masoSV = mssv;
        ngaysinh = date;
        quequan = que;
    }

    public Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.println("Nhập tên SV: ");
        hovatenSV = sc.nextLine();
        System.out.println("Nhập MSSV: ");
        masoSV = sc.nextInt();
        System.out.println("Nhập ngày sinh: ");
        sc.nextLine();
        ngaysinh = sc.nextLine();
        System.out.println("Nhập quê quán: ");
        quequan = sc.nextLine();
    }

    public void inThongTin() {
        System.out.println("===============================");
        System.out.println("Họ Và Tên SV: " + hovatenSV);
        System.out.println("Mã Số SV: " + masoSV);
        System.out.println("Ngày Sinh: " + ngaysinh);
        System.out.println("Quê Quán: " + quequan);
    }

}
