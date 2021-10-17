package com.tailvt2004110014.tuan04.baitapthem02;

import java.util.Scanner;

public class SinhVien1TestDrive {
    public static void main(String[] args) {
        SinhVien1[] DanhSachSV = new SinhVien1[3];

        SinhVien1 sv0 = new SinhVien1("2004110014", "Tai", "19", "Tp. HCM");
        SinhVien1 sv1 = new SinhVien1("2004110015", "Tèo", "20", "Tp. HCM");
        SinhVien1 sv2 = new SinhVien1("2004110016", "Tin", "21", "Tp. HCM");
    
        DanhSachSV[0] = sv0;
        DanhSachSV[1] = sv1;
        DanhSachSV[2] = sv2;

        DanhSachSV[1].inThongTin();
        DanhSachSV[0].inThongTin();
        DanhSachSV[2].inThongTin();
    }
}
