package OOP.Buoi3.Bai6;

import java.util.Scanner;

public class HocSinh {
    private String lop;
    private String khoaHoc;
    private int kyHoc;
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap lop: "); setLop(scan.nextLine());
        System.out.print("\tNhap khoa hoc: "); setKhoaHoc(scan.nextLine());
        System.out.print("\tNhap ky hoc: "); setKyHoc(scan.nextInt());
        scan.nextLine();
        System.out.print("\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNhap ngay sinh: "); setNgaySinh(scan.nextLine());
        System.out.print("\tNhap que quan: "); setQueQuan(scan.nextLine());
    }

    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", kyHoc=" + kyHoc +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
