package com.tailvt2004110014.tuan03.baitapthem;

public class XeTestDrive {
    public static void main(String[] args) {

        Xe xe;
        xe = new Xe();
        
        xe.tenchuxe = "Nguyễn Văn B";
        xe.hangsanxuat = "Honda";
        xe.dong = "Tay ga";
        xe.giayphep = "Có";
        xe.dungtichxang = "100 lít";

        xe.inThongTin();

        xe = new Xe("Nguyễn Văn B", "Honda", "Tay ga");
        System.out.println("\nTên chủ xe: "+xe.tenchuxe+"\nHãng sản xuất: "+xe.hangsanxuat+"\nDòng xe: "+xe.dong);
    }
}
