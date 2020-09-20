package OOP.Buoi3.Bai12;

import java.util.Scanner;

public class GiaoVien extends Nguoi {
    private double luongCung;
    private double thuong;
    private double phat;

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tHo ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNam sinh: "); setNamSinh(scan.nextLine());
        System.out.print("\tQue quan: "); setQueQuan(scan.nextLine());
        System.out.print("\tLuong cung: "); setLuongCung(scan.nextDouble());
        System.out.print("\tThuong: "); setThuong(scan.nextDouble());
        System.out.print("\tPhat: "); setPhat(scan.nextDouble());
    }

    double thucLinh(){
        return getLuongCung() + getThuong() - getPhat();
    }

    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "hoTen='" + getHoTen() + '\'' +
                ", namSinh='" + getNamSinh() + '\'' +
                ", queQuan='" + getQueQuan() + '\'' +
                ", luongCung=" + luongCung +
                ", thuong=" + thuong +
                ", phat=" + phat +
                ", thucLinh=" + thucLinh() +
                '}';
    }
}
