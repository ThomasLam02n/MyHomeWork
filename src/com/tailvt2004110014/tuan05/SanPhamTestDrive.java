package com.tailvt2004110014.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPhamTestDrive {
   public static void main(String[] args) {
        sc.nextLine();
       do{
           menu();
           System.out.println("Quay về MENU (y/n): ");
       }while(sc.nextLine().equals("y"));
       
   }

   static ArrayList<SanPham> quanLySanPham = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);

    static void menu(){
    System.out.println("------------------MENU------------------");
    System.out.println("=> 1)  Nhập DS sản phẩm                 |");
    System.out.println("=> 2)  Sắp xếp giảm dần theo giá        |");
    System.out.println("=> 3)  Xoá sản phẩm vừa nhập            |");
    System.out.println("=> 4)  Xuất giá trung bình của các SP   |");
    System.out.println("=> 5)  Kết thúc                         |");
    System.out.println("----------------------------------------");
    System.out.println("Chọn chức năng: ");
    int key = sc.nextInt();
    switch(key){
        case 1:
            nhapSP();
        break;
        case 2:
            sapXepSanPhamgiamdan();
        break;
        case 3:
            xuatSP();
        break;
        case 4:
        break;
        case 5:
        break;
        }
    }

    static void nhapSP(){

        while(true){
            SanPham sanpham;
            sanpham = new SanPham();

            sanpham.nhapThongTinSP();
            sc.nextLine();
            quanLySanPham.add(sanpham);

            System.out.println("Thêm SP (y/n): ");
            if(sc.nextLine().equals("n"))
                break;
        }
    }

    static void xuatSP(){
        for(SanPham sanpham : quanLySanPham){
            sanpham.inThongTinSP();
        }
    }

    static void sapXepSanPhamgiamdan(){

        Comparator<SanPham> comp;
        comp = new Comparator<SanPham>(){

            public int compare(SanPham o1, SanPham o2){
                return Double.compare(o1.donGia, o2.donGia);
            }
        };
        Collections.sort(quanLySanPham, comp);
        xuatSP();
    }
}   

