package OOP.Buoi3.Bai2;


import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPH;

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma bao: "); setMaTL(scan.nextLine());
        System.out.print("Nhap ten NXB: "); setTenNXB(scan.nextLine());
        System.out.print("Nhap ngay phat hanh: "); setNgayPH(scan.nextLine());
        System.out.print("Nhap so ban phat hanh: "); setSoBanPH(scan.nextInt());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "Bao{" +
                "maBao='" + getMaTL() + '\'' +
                ", NXB='" + getTenNXB() + '\'' +
                ", ngayPH='" + ngayPH + '\'' +
                ", soBanPH=" + getSoBanPH() +
                '}';
    }
}
