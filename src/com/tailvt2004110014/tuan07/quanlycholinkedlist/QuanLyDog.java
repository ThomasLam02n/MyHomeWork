package com.tailvt2004110014.tuan07.quanlycholinkedlist;

import java.util.Scanner;

public class QuanLyDog {
    public QuanLyDog() {

    }

    Dog head;
    Dog tail;
    Dog current;
    Dog previous;
    Scanner sc = new Scanner(System.in);
    static Dog dog = new Dog();

    Dog dienThongTin() {
        System.out.println("Tên: ");
        String ten = sc.nextLine();
        System.out.println("Tuổi: ");
        int tuoi = sc.nextInt();
        System.out.println("Màu Sắc:");
        String mausac = sc.nextLine();
        sc.nextLine();
        System.out.println("Giới Tính:");
        String giong = sc.nextLine();
        Dog dog = new Dog(ten, tuoi, mausac, giong);
        return dog;
    }

    void add() {
        Dog dog = dienThongTin();
        if (head == null) {
            head = dog;
            tail = dog;
        } else {
            tail.next = dog;
            tail = dog;
        }
    }

    void xuatthongtin() {
        current = head;
        if (head == null) {
            System.out.println("Danh Sách rỗng !");
            return;
        }
        System.out.println("Các con Dog trong ds:");
        while (current != null) {
            current.inThongTin();
            current = current.next;
        }
    }

    boolean tim(String ten){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.ten.equals(ten)){
                result = true;
                return result;
            }
             current = current.next;
        }
        return result;
    }

    void timXongInthongTin(String ten){
        if(true == tim(ten)){
            current.inThongTin();
        }else{
            System.out.println("Không tìm thấy");
        }
    } 
}
