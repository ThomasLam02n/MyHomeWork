package com.tailvt2004110014.tuan05.quanlysinhvien;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {

    static List<Sinhvien> dssinhvien = new ArrayList<Sinhvien>(); // Để Arraylist và Scanner ra ngoài main để không
    static Scanner bienNhap = new Scanner(System.in);

    public static void nhapthongtin() {

        while (true) {

            Sinhvien sinhvien;
            sinhvien = new Sinhvien(); // Tạo 1 biến tên "sinhvien" sau đó dùng toán tử nêu để tạo đối tượng

            sinhvien.nhapThongTin();
            bienNhap.nextLine(); // fix lỗi enter
            dssinhvien.add(sinhvien); // Dùng dấu chấm "." đế tham chiếu đối tượng

            System.out.println("Thêm SV: (y/n)?: ");
            if (bienNhap.nextLine().equals("n")) // nếu nhập "n" thì sẽ kết thúc vòng lặp
                break;
        }
    }

    public static void xuatthongtin() {

        for (Sinhvien sinhvien : dssinhvien) {
            sinhvien.inThongTin();
        }
    }

    public static void xuatngaunhien() {

        Collections.shuffle(dssinhvien); // dùng để trộn dssinhvien
    }

    // Sắp xếp tăng dần theo MSSV
    public static void sapxepthongtin() {

        Comparator<Sinhvien> comp;
        comp = new Comparator<Sinhvien>() {

            public int compare(Sinhvien o1, Sinhvien o2) { // so sánh giữa 2 đối tượng
                return Double.compare(o1.masoSV, o2.masoSV);
            }
        };
        Collections.sort(dssinhvien, comp);
    }

    public static void timTenSV() {

        System.out.println("Tên cần tìm: ");
        for (Sinhvien sinhvien : dssinhvien) {
            if (bienNhap.nextLine().equals(sinhvien.hovatenSV)) {
                sinhvien.inThongTin();
            }
        }
    }

    public static void xoathongtin(){
        System.out.println("Tên cần xoá: ");
        for (Sinhvien sinhvien : dssinhvien) {
            if (bienNhap.nextLine().equals(sinhvien.hovatenSV)) {
                dssinhvien.remove(sinhvien.hovatenSV);
            }
        }
    }
}
