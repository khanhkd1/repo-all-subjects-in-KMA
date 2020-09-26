package OOP_nam3.Buoi4.Bai1;

import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private int namSinh;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap ma KH: "); setMaKH(scan.next());
        scan.nextLine();
        System.out.print("\tNhap ho ten: "); setTenKH(scan.nextLine());
        System.out.print("\tNhap nam sinh: "); setNamSinh(scan.nextInt());
        System.out.println("\t---------------");
    }

    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
