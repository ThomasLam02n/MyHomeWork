package com.tailvt2004110014.tuan04.baitapthem02;

public class Xe {

    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;

    public Xe(){
    }

    public Xe(String t, String h, String d, String g){
        tenchuxe = t;
        hangsanxuat = h;
        dong = d;
        giayphep = g;
    }

    void inThongTin(){
        System.out.println("-------Thông Tin--------");
        System.out.println("Tên Chủ Xe: "+tenchuxe);
        System.out.println("Hãng Sản Xuất: "+hangsanxuat);
        System.out.println("Dòng Xe: "+dong);
        System.out.println("Giấy Phép: "+giayphep);
    }
}
