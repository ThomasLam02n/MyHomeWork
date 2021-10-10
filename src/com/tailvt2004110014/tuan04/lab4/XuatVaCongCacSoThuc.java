package com.tailvt2004110014.tuan04.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class XuatVaCongCacSoThuc {
    public static void main(String[] args) {
        //Khai báo 1 ArrayList có tên là list, có kiểu là Double
        ArrayList<Double>list = new ArrayList<Double>();
        Scanner bienNhap = new Scanner(System.in); 
        double sum = 0;
        //Nhập các phần từ vào list
        for(int i = 0; i < 5; i++){
        System.out.println("Nhập phần tử trong mảng: " +i+ " > ");
        list.add(bienNhap.nextDouble());
        }
        //Xuất các phần từ theo chuỗi(String) của list ra màn hình
        for(int i = 0; i < 5; i++){
            System.out.println("Xuất phần tử trong mảng: ");
            System.out.println(list.toString());
            break;
        }
        //Cộng tất cả các phần tử đã nhập của list và in ra màn hình
        for(int i = 0; i < 5; i++){
            sum += list.get(i);
        }
        System.out.println("Tổng của các phần tử vừa nhập: "+sum);
    }
}
