package com.tailvt2004110014.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayList {
    static ArrayList<Book> dsBook = new ArrayList<Book>();
    static Scanner bieNhap = new Scanner(System.in);

    public void nhapVaoDanhSach(){
        while(true){
            Book book = new Book();
            book.nhapThongTinBook();

            bieNhap.nextLine();
            dsBook.add(book);

            System.out.println("Nhập thêm Sách: (y/n) ?");
            if(bieNhap.nextLine().equals("n"))
            break;
        }
    }

    public void xuatDanhSach(){
        for(Book book: dsBook){
            book.inThongTinBook();
        }
    }

    public void timTheoMa(){
        System.out.println("Mã cần tìm là:");
        for(Book book: dsBook){
            if(bieNhap.nextLine().equals(book.ma))
            book.inThongTinBook();
        }   
    }
}
