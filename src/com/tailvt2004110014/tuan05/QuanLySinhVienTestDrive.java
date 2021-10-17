package com.tailvt2004110014.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class QuanLySinhVienTestDrive {
    public static void main(String[] args) {
        bienNhap.nextLine();
        do{
            bienNhap.nextLine();
            Menu();
            System.out.println("Quay về MENU (y/n)?: ");  // tạo nút quay về mỗi lần sài 1 chức năng !
        }while(bienNhap.next().equals("y"));
    }
    
    static List<Sinhvien> dssinhvien = new ArrayList<Sinhvien>(); // Để Arraylist và Scanner ra ngoài main để không cần nhập biến cho các hàm !
    static Scanner bienNhap = new Scanner(System.in);

    static void Menu(){
        
        System.out.println("---------------MENU----------------");
        System.out.println("1)  Nhập Danh Sách Sinh Viên       |");
        System.out.println("2)  Xuất Danh Sách Sinh Viên       |");
        System.out.println("3)  Sắp Xếp                        |");
        System.out.println("4)  Xuất Danh Sách SV Ngẫu Nhiên   |");
        System.out.println("5)  Xoá                            |");
        System.out.println("6)  Kết Thúc.                      |");
        System.out.println("-----------------------------------");

        System.out.println("Chọn chức năng (chọn số): ");
        int key = bienNhap.nextInt();

        switch (key) { 
            case 1:
                nhapthongtin();
                break;
            case 2:
                xuatthongtin();
                break;
            case 3:
                sapxepthongtin();
                break;
            case 4:
                xuatngaunhien();
                break;
            case 5:
                bienNhap.nextLine();
                xoathongtin();
                break;
            case 6:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
        }
    }

    static void nhapthongtin(){

        while(true){
        Sinhvien sinhvien;
        sinhvien = new Sinhvien(); //Tạo 1 biến tên "sinhvien" sau đó dùng toán tử nêu để tạo đối tượng trong vùng nhớ HEAP 

        sinhvien.nhapThongTin();
        bienNhap.nextLine(); // fix lỗi enter
        dssinhvien.add(sinhvien); // Dùng dấu chấm "." đế tham chiếu đối tượng

        System.out.println("Thêm SV: (y/n)?: ");
        if(bienNhap.nextLine().equals("n")) // nếu nhập "n" thì sẽ kết thúc vòng lặp
            break;
        }
    }
    
    static void xuatthongtin(){

        for (Sinhvien sinhvien: dssinhvien){
            sinhvien.inThongTin();
        }
    }

    static void xuatngaunhien() {

        Collections.shuffle(dssinhvien); // dùng để trộn dssinhvien
        xuatthongtin();
    }
    //Sắp xếp tăng dần theo MSSV
    static void sapxepthongtin(){

        Comparator<Sinhvien> comp;
        comp = new Comparator<Sinhvien>(){

            public int compare(Sinhvien o1, Sinhvien o2) { // so sánh giữa 2 đối tượng 
                return Double.compare(o1.masoSV, o2.masoSV); 
            }
        };
        Collections.sort(dssinhvien, comp);
        xuatthongtin();
    }
    
    static void xoathongtin(){
      
    }
}



