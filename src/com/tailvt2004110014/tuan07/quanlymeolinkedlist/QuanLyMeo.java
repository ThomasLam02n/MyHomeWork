package com.tailvt2004110014.tuan07.quanlymeolinkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import com.tailvt2004110014.kiemtragiuaky.Node;
import com.tailvt2004110014.tuan06.quanlynhanvien.NhanVien;

public class QuanLyMeo {
    static LinkedList<Meo> qlmeo = new LinkedList<Meo>();
    public static Scanner bienNhap = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    public static void dienThongTin(){
        while(true){
            
            Meo meo = new Meo();
            meo.nhapThongTin();
            bienNhap.nextLine();
            qlmeo.add(meo);
            System.out.println("Thêm mèo(y/n): ");
            if(bienNhap.nextLine().equals("n")){
                break;
            }
        }
    }

    public static void inThongTin(){
        for(Meo meo : qlmeo){
            meo.inThongTin();
        }
    }

    public static void sapxep(){
    
    }
    
}
