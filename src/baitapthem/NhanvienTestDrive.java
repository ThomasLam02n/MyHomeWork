package baitapthem;

public class NhanvienTestDrive {
    public static void main(String[] args) {
        
        Nhanvien nhanvien;
        nhanvien = new Nhanvien();

        nhanvien.tenNV = "Nguyễn Văn A";
        nhanvien.luong = 10000000;
        nhanvien.diachi = "123/5/6 Lý Thường Kiệt, Quận 10, Tp HCM";
        nhanvien.bophanlamviec = "IT";
        nhanvien.ngaysinh = "21/12/2112";

        nhanvien.inThongTin();
    }
}
