package GiaiDeMienNam;

import java.util.Scanner;

public class ThongTin {
    String diaChi;
    String ngayGiaoDich;
    double donGia;
    double dienTich;

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap dia chi: "); setDiaChi(scan.nextLine());
        System.out.print("Nhap ngay giao dich: "); setNgayGiaoDich(scan.nextLine());
        System.out.print("Nhap don gia: "); setDonGia(scan.nextDouble());
        System.out.print("Nhap dien tich: "); setDienTich(scan.nextDouble());
    }

    public void xuat(){
        System.out.println("Dia chi: "+getDiaChi());
        System.out.println("Ngay GD: "+getNgayGiaoDich());
        System.out.println("Don gia: "+getDonGia());
        System.out.println("Dien tich: "+getDienTich());
        System.out.println("Thanh tien: "+thanhTien());
    }

    public double thanhTien() {
        return 0;
    }
}
