package OOP.Buoi3.Bai5;

import java.util.Scanner;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tSo bao danh: "); setSoBaoDanh(scan.next());
        scan.nextLine();
        System.out.print("\tHo ten: "); setHoTen(scan.nextLine());
        System.out.print("\tDia chi: "); setDiaChi(scan.nextLine());
        System.out.print("\tUu tien: "); setUuTien(scan.next());
    }

    void xuat(){};
}
