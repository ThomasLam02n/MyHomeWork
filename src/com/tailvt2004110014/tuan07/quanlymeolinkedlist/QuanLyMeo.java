package com.tailvt2004110014.tuan07.quanlymeolinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyMeo {
    public QuanLyMeo(){}
    Meo head;
    Meo tail;
    Meo current;
    Meo previous;
    Scanner bienNhap = new Scanner(System.in);
    Meo dienThongTin(){
        System.out.println("Nhập tên: ");
        String ten = bienNhap.nextLine();
        System.out.println("Nhập Tuổi: ");
        int tuoi = bienNhap.nextInt();
        System.out.println("Màu Sắc: ");
        bienNhap.nextLine();
        String mausac = bienNhap.nextLine();
        System.out.println("Giống: ");
        String giong = bienNhap.nextLine();
        Meo meo = new Meo(ten, tuoi, mausac, giong);
        return meo;
    }
    void add(){
        Meo meo = dienThongTin();
        if(head==null){
            head=meo;
            tail=meo;
        }
        else{
            tail.next=meo;
            tail=meo;
        }
    }
    void inThongTin(){
        current= head;
        if(head==null){
            System.out.println("Danh sách không có con mèo nào");
            return;
        }
        System.out.println("Các con mèo trong danh sách:");
        while(current!=null){
            current.inThongTin();
            current=current.next;
        }
    }
    boolean tim(String ten){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.ten.equals(ten)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }
    void timXongInthongTin(String ten){
        if(true==tim(ten)){
            current.inThongTin();
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }
    void timMeoRoiThemVaoDangTruoc(String ten){
        if(true==tim(ten)){
            if(current==head){
                addHead();
            }
            else{
                themDangTruoc();
            }
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }
    void timDangTruoc(){
        previous = head;
        while(previous!=null){
            if(previous.next==current){
                return;
            }
            previous=previous.next;
        }
    }
    void themDangTruoc(){
        timDangTruoc();
        Meo meo = dienThongTin();
        previous.next=meo;
        previous.next.next=current;
    }
    void addHead(){
        Meo meo = dienThongTin();
        meo.next=head;
        head=meo;
    }
    void xoaMeo(String ten){
        if(true==tim(ten)){
            if(current==head){
                xoaHead();
            }
            else if (current==tail){
                xoaTail();
            }
            else {
                xoaGiua();
            }
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }
    void xoaHead(){
        head=head.next;
    }
    void xoaTail(){
        current = head;
        while(current!=null){
            if(current.next==tail){
                tail=current;
                tail.next=null;
                return;
            }
            current=current.next;
        }
    }
    void xoaGiua(){
        timDangTruoc();
        current=current.next;
        previous.next=current;
    }
    void sua(String ten){
        if(true==tim(ten)){
            Meo meo = dienThongTin();
            current.giong=meo.giong;
            current.mausac=meo.mausac;
            current.ten=meo.ten;
            current.tuoi=meo.tuoi;
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }

}
