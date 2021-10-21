package com.tailvt2004110014.tuan06;

public class MayTinh {

    String tenMayTinh;
    String cpu;
    String vga;
    int soRam;

    MayTinh(){}

    void MayTinh(String name, String c, String v, int ram){

        tenMayTinh = name;
        cpu = c;
        vga = v;
        soRam = ram;
    }

    public void inThongTinMayTinh(){

        System.out.println("Tên hãng máy tính: "+tenMayTinh);
        System.out.println("Loại CPU: "+cpu);
        System.out.println("");

    }
}
