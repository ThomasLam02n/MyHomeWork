package com.tailvt2004110014.tuan03;

public class TaikhoanTestDrive {
    public static void main(String[] args) {

        Taikhoan taikhoan;
        taikhoan = new Taikhoan();
        
        taikhoan.tenchutaikhoan = "Nguyễn Văn C";
        taikhoan.sotaikhoan = "383197673135";
        taikhoan.sodutrongtaikhoan = "100.000.000.000";

        taikhoan.inThongTin();
    }
}
