package com.tailvt2004110014.tuan03.baitapthem;

public class SachTestDrive {
    public static void main(String[] args) {

        Sach sach;
        sach = new Sach();
        
        sach.gia = 18000;
        sach.nhaxuatban ="Kim Đồng";
        sach.giaban = 20000;
        sach.soluong = 500;

        sach.inThongtin();

        sach = new Sach(19000, 500, "Detective");
        System.out.println("\nGiá bán: "+sach.gia+("\nSố lượng in: "+sach.soluong+"\nLoại sách: "+sach.loai));

    }
}
