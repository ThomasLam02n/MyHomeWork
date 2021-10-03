package com.tailvt2004110014.tuan03.lab3;

import java.util.Scanner;

public class XuatBangCuuChuong {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương");
        for(int i = 1;i <= 10;i++){
            for(int j = 1;j <= 9;j++){
                System.out.printf("|%2d x %d =%2d  ",i ,j ,i*j);
            }
            System.out.println();
        }
    }
}
