package com.tailvt2004110014.tuan01.lab1;
import java.util.Scanner;

public class HoVaTenDiem {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Họ và Tên: ");
        String hovaten = bienNhap.nextLine();
        System.out.println("Điểm TP: ");
        double diemtrungbinh = bienNhap.nextDouble();
        
        System.out.printf("HVT "+ hovaten + " ĐTB " + diemtrungbinh);
    }
}