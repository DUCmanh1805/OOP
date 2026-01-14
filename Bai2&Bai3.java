public class Nguoi {
    String ten;
    String ngaySinh;
    String gioiTinh;

    public void nhapThongTin() {
        System.out.println("Nhap thong tin nguoi");
    }

    public void hienThiThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
    }
}
//bai2//
public class NhanVien extends Nguoi {
    double luong;

    public void hienThiLuong() {
        System.out.println("Luong: " + luong);
    }
}
//bai3//
public class SinhVien extends Nguoi {
    String lop;

    public void hienThiLop() {
        System.out.println("Lop: " + lop);
    }
}
