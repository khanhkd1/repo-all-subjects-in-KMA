package OOP.Buoi2.Exam;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int namSinh;
    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\t\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\t\tNhap nam sinh: "); setNamSinh(scan.nextInt());
        scan.nextLine();
        System.out.print("\t\tNhap nghe nghiep: "); setNgheNghiep(scan.nextLine());
    }

    void xuat(){
        System.out.println("\t\t"+toString());
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}
