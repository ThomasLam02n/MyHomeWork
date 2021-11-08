package com.tailvt2004110014.kiemtragiuakylan2;

import java.util.Scanner;

import com.tailvt2004110014.kiemtragiuaky.khoAppleTestDrive;

public class Book {
    String ma;
    double dongia;
    int khoiluong;

   static Scanner sc = new Scanner(System.in);

   Book() {
   }

   void Book(String id, double d, int k){
        ma = id;
        dongia = d;
        khoiluong = k;
   }

   public void inThongTinBook() {
       System.out.println("===================");
       System.out.println("Mã id: " +ma);
       System.err.println("Đơn giá: " +dongia);
       System.out.println("Khối Lượng: " +khoiluong);
   }

   public void nhapThongTinBook() {
       System.out.println("Mã id: ");
       ma = sc.nextLine();
       System.err.println("Đơn Giá: ");
       dongia = sc.nextDouble();
       System.out.println("Khối lượng: ");
       khoiluong = sc.nextInt();
   }
}
