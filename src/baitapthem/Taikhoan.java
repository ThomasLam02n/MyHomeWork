package baitapthem;
import java.util.zip.DataFormatException;

public class Taikhoan {
    String tenchutaikhoan;
    String sotaikhoan;
    String sodutrongtaikhoan;

    void inThongTin(){
        System.out.println("Tên Chủ Tài Khoản: "+tenchutaikhoan);
        System.out.println("Số Tài khoản: "+sotaikhoan);
        System.out.println("Số Dư Trong Tài Khoản: "+sodutrongtaikhoan);
    }
}
