package com.tailvt2004110014.kiemtragiuakylan2;

import java.util.Scanner;

public class BookLinkedList {
    public BookLinkedList(){}
    Node head;
    Node tail;
    Node current;
    Node previous;
    Scanner bienNhap = new Scanner(System.in);
    Node book = new Node();
    
    Node dienThongTin(){
        System.out.println("Nhập mã: ");
        String ma = bienNhap.nextLine();
        System.out.println("Đơn giá: ");
        Double dongia = bienNhap.nextDouble();
        System.out.println("Khối lượng: ");
        int khoiluong = bienNhap.nextInt();
        Node book = new Node();
        return book;
    }

    void add(){
        Node book = dienThongTin();
        if(head==null){
            head=book;
            tail=book;
        }
        else{
            tail.next=book;
            tail=book;
        }
    }

    void inThongTin(){
        current= head;
        if(head==null){
            System.out.println("Danh sách không có gì!");
            return;
        }
        System.out.println("Danh sách:");
        while(current!=null){
            current.inThongTinBook();
            current=current.next;
        }
    }

    boolean tim(String id){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.ma.equals(id)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }

    void timXongInthongTin(String id){
        if(true==tim(id)){
            current.inThongTinBook();
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

    void addHead(){
        Node book = dienThongTin();
        book.next=head;
        head=book;
    }

    void themDangTruoc(){
        timDangTruoc();
        Node book = dienThongTin();
        previous.next=book;
        previous.next.next=current;
    }

    void timBookRoiThemVaoDangTruoc(String id){
        if(true==tim(id)){
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

    void xoaBook(String ten){
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

}
