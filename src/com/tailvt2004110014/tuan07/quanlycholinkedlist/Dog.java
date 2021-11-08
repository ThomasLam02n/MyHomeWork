package com.tailvt2004110014.tuan07.quanlycholinkedlist;

import java.util.Scanner;

public class Dog {
    String ten;
    int tuoi;
    String mausac;
    String giong;
    Dog next;
static Scanner sc = new Scanner(System.in);
Dog(){

}

Dog(String name, int age, String color, String sex){
    ten = name;
    tuoi = age;
    mausac = color;
    giong = sex;
}

public void inThongTin(){
    System.out.println("-------------------");
    System.out.println("Tên: "+ten);
    System.out.println("Tuổi: "+tuoi);
    System.out.println("Màu Sắc: "+mausac);
    System.out.println("Giống: "+giong);
}

public void nhapThongTin(){
    System.out.println("Tên: ");
    ten = sc.nextLine();
    System.out.println("Tuổi: ");
    tuoi = sc.nextInt();
    System.out.println("Màu Sắc:");
    mausac = sc.nextLine();
    sc.nextLine();
    System.out.println("Giới Tính:");
    giong = sc.nextLine();
}
}
