package com.tailvt2004110014.tuan04.baitapthem02;
import java.util.zip.DataFormatException;
public class SinhVien1 {
    String mssv;
    String name;
    String tuoi;
    String quequan;

    SinhVien1(String m, String n, String t, String q){
        mssv = m;
        name = n;
        tuoi = t;
        quequan = q;
    }

    void inThongTin(){
        System.out.println("-------Thông Tin---------");
        System.out.println("Mã số Sinh viên: " +mssv);
        System.out.println("Tên Sinh viên: "+name);
        System.out.println("Tuổi Sinh vien: "+tuoi);
        System.out.println("Quê Quán: "+quequan);
    }
}  
