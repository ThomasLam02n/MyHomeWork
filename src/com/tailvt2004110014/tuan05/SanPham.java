package com.tailvt2004110014.tuan05;

import java.util.Scanner;

public class SanPham {
    String tenSanPham;
    int donGia;
    String giamGia;
    String thueNhapKhau;

    SanPham(){

    }

    public void SanPham(String tsp, int dg, String gg, String tnk){
        tenSanPham = tsp;
        donGia = dg;
        giamGia = gg;
        thueNhapKhau = tnk;
    }

    public void inThongTinSP(){
        System.out.println("===============================");
        System.out.println("Tên Sản Phẩm: "+tenSanPham);
        System.out.println("Đơn Giá: "+donGia);
        System.out.println("Giảm Giá: "+giamGia);
        System.out.println("Thuế Nhập Khẩu: "+thueNhapKhau);
    }

    public void nhapThongTinSP(){
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Tên SP: ");
        String tsp = bienNhap.nextLine();
        System.out.println("Đon Giá: ");
        int dg = bienNhap.nextInt();
        System.out.println("Giảm giá: ");
        int gg = bienNhap.nextInt();
        System.out.println("Thuế nhập khẩu: ");
        float tnk = bienNhap.nextFloat();
    }


}
