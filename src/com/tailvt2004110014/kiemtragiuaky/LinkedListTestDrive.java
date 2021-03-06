package com.tailvt2004110014.kiemtragiuaky;

import java.util.Scanner;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList qlDS = new  LinkedList();
        Scanner bienNhap = new Scanner(System.in);

        do {
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Add Head                       |");
            System.out.println("2)  Add Tail                       |");
            System.out.println("3)  In DS                          |");
            System.out.println("4)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = bienNhap.nextInt();

            switch (key) {
            case 1:
                qlDS.addHead();
            case 2:
                qlDS.addTail();
                break;
            case 3:
                qlDS.inDanhSach();
                break;
            case 4:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
            }

            System.out.println("Quay về MENU (y/n)?: "); // tạo nút quay về mỗi lần sài 1 chức năng !
            bienNhap.nextLine();

        } while (bienNhap.nextLine().equals("y"));
    }
}
