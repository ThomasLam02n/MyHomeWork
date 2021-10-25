package com.tailvt2004110014.kiemtragiuaky;

import java.util.Scanner;

public class Apple {

     String ma;
     String khoiluong;
     String mauSac;

    static Scanner sc = new Scanner(System.in);

    Apple() {
    }

    public void inThongTinApple() {
        System.out.println("===================");
        System.out.println("Mã id: " + ma);
        System.err.println("Khối Lượng: " + khoiluong);
        System.out.println("Màu sắc: " + mauSac);
    }

    public void nhapThongTinApple() {
        System.out.println("Mã id: ");
        ma = sc.nextLine();
        System.err.println("Khối Lượng: ");
        khoiluong = sc.nextLine();
        System.out.println("Màu sắc: ");
        mauSac = sc.nextLine();
    }

}
