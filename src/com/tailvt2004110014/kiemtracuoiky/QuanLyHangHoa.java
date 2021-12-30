package com.tailvt2004110014.kiemtracuoiky;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyHangHoa {

    static Node head = null;
    Node tail = null;
    Node current = null;
    Node previous = null;
    Node temp;
    Node save;
    HangHoa hanghoa;

    public QuanLyHangHoa() {
    }

    Scanner bienNhap = new Scanner(System.in);

    // Hàm mồi để test Chương Trình
    public void moi(String kind, String id, String name, int cost, int quantity, String date) {
        HangHoa hanghoa = new HangHoa();
        Node newhanghoa = new Node(hanghoa);
        newhanghoa.data.HangHoa(kind, id, name, cost, quantity, date);
        if (head == null) {
            head = newhanghoa;
            tail = newhanghoa;
        } else {
            tail.next = newhanghoa;
            tail = newhanghoa;
        }
    }

    public void addFist() throws ParseException {
        HangHoa hanghoa = new HangHoa();
        Node newhanghoa = new Node(hanghoa);
        newhanghoa.data.nhapThongTinHangHoa();
        if (head == null) {
            head = newhanghoa;
            tail = newhanghoa;
        } else {
            newhanghoa.next = head;
            head = newhanghoa;
        }
    }

    void print() {
        Node current = head;
        if (head == null) {
            System.out.println("Danh sach không co hang hoa nao !");
            return;
        }
        System.out.println("Danh sach hang hoa:");
        while (current != null) {
            current.data.inThongTinHangHoa();
            current = current.next;

        }
    }

    boolean find(String mahang) {
        current = head;
        boolean result = false;
        while (current != null) {
            if (current.data.mahang.equals(mahang)) {
                result = true;
                return result;
            }
            current = current.next;
        }
        return result;
    }

    void find_and_print(String mahang) {
        if (true == find(mahang)) {
            current.data.inThongTinHangHoa();
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    boolean find_kind(String loai) {
        current = head;
        boolean result = false;
        while (current != null) {
            if (current.data.loai.equals(loai)) {
                current.data.inThongTinHangHoa();
                result = true;

            }
            current = current.next;
        }
        return result;
    }

    void find_and_print_kind(String loai) {
        if (false == find_kind(loai)) {
            System.out.println("Không tìm thấy");
        }
    }

    boolean find_date(String ngaynhapkho) {
        current = head;
        boolean result = false;
        while (current != null) {
            if (current.data.mahang.equals(ngaynhapkho)) {
                result = true;
                return result;
            }
            current = current.next;
        }
        return result;
    }

    void find_and_print_date(String ngaynhapkho) {
        if (true == find(ngaynhapkho)) {
            current.data.inThongTinHangHoa();
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    void swapInfo() {
        HangHoa hangHoa = new HangHoa();
        temp = new Node(hangHoa);
        temp.data.loai = save.data.loai;
        temp.data.mahang = save.data.mahang;
        temp.data.tenhanghoa = save.data.tenhanghoa;
        temp.data.gianhap = save.data.gianhap;
        temp.data.soluongtonkho = save.data.soluongtonkho;
        temp.data.ngaynhapkho = save.data.ngaynhapkho;
        save.data.loai = current.data.loai;
        save.data.mahang = current.data.mahang;
        save.data.tenhanghoa = current.data.mahang;
        save.data.gianhap = current.data.gianhap;
        save.data.soluongtonkho = current.data.soluongtonkho;
        save.data.ngaynhapkho = current.data.ngaynhapkho;
        current.data.loai = temp.data.loai;
        current.data.mahang = temp.data.mahang;
        current.data.tenhanghoa = temp.data.tenhanghoa;
        current.data.gianhap = temp.data.gianhap;
        current.data.soluongtonkho = temp.data.soluongtonkho;
        current.data.ngaynhapkho = temp.data.ngaynhapkho;
    }

    void tangDan_Selection() {
        current = head;
        while (current != null) {
            Node check = current;
            save = current;
            while (check != null) {
                if (check.data.gianhap < save.data.gianhap) {
                    save = check;
                }
                check = check.next;
            }
            swapInfo();
            current = current.next;
        }
    }

    void giamDan_Selection() {
        current = head;
        while (current != null) {
            Node check = current;
            save = current;
            while (check != null) {
                if (check.data.gianhap > save.data.gianhap) {
                    save = check;
                }
                check = check.next;
            }
            swapInfo();
            current = current.next;
        }
    }

    void timDangTruoc() {
        previous = head;
        while (previous != null) {
            if (previous.next == current) {
                return;
            }
            previous = previous.next;
        }
    }

    void delete(String mahang) {
        if (true == find(mahang)) {
            if (current == head) {
                xoaHead();
            } else if (current == tail) {
                xoaTail();
            } else {
                xoaGiua();
            }
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    void xoaHead() {
        head = head.next;
    }

    void xoaTail() {
        current = head;
        while (current != null) {
            if (current.next == tail) {
                tail = current;
                tail.next = null;
                return;
            }
            current = current.next;
        }
    }

    void xoaGiua() {
        timDangTruoc();
        current = current.next;
        previous.next = current;
    }

    void remake(String mahang) throws ParseException {
        if (true == find(mahang)) {
            HangHoa hanghoa = new HangHoa();
            Node newhanghoa = new Node(hanghoa);
            newhanghoa.data.nhapThongTinHangHoa();
            current.data.loai = hanghoa.loai;
            current.data.mahang = hanghoa.mahang;
            current.data.tenhanghoa = hanghoa.tenhanghoa;
            current.data.gianhap = hanghoa.gianhap;
            current.data.soluongtonkho = hanghoa.soluongtonkho;
            current.data.ngaynhapkho = hanghoa.ngaynhapkho;
        } else {
            System.out.println("Không tìm thấy");
        }
    }
    
    void toTal(){
        Node current = head;
        int tongHangHoa = 0;
        int tongGia = 0;
        int tongThucPham = 0;
        int tongSanhSu = 0;
        int tongDienmay = 0;
        if(head == null){

        }else{
            while(current != null){
                tongHangHoa++;
                tongGia = tongGia + (current.data.gianhap*current.data.soluongtonkho);
                if(current.data.loai.equals("Thuc Pham")){
                    tongThucPham++;
                }
                if(current.data.loai.equals("Sanh Su")){
                    tongSanhSu++;
                }
                if(current.data.loai.equals("Dien May")){
                    tongDienmay++;
                }
                current = current.next;
            }    
        }
        System.out.println("Tổng số lượng hàng hoá: "+tongHangHoa);
        System.out.println("Tổng giá trị nhập kho: "+tongGia);
        System.out.println("Số lượng hàng Thực Phẩm: "+tongThucPham);
        System.out.println("Số lượng hàng Sành Sứ: "+tongSanhSu);
        System.out.println("Số lượng hàng Điện Máy: "+tongDienmay);
    }

}
