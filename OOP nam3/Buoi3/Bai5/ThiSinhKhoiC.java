package OOP.Buoi3.Bai5;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh {
    private double diemVan;
    private double diemSu;
    private double diemDia;

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin thi sinh khoi c:");
        super.nhap();
        System.out.print("\tDiem van: "); setDiemVan(scan.nextDouble());
        System.out.print("\tDiem su: "); setDiemSu(scan.nextDouble());
        System.out.print("\tDiem dia: "); setDiemDia(scan.nextDouble());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +
                "soBaoDanh='" + getSoBaoDanh()+'\''+
                ", hoTen='" + getHoTen()+'\''+
                ", diaChi='" + getDiaChi()+'\''+
                ", uuTien='" + getUuTien() +'\''+
                ", diemVan=" + diemVan +
                ", diemSu=" + diemSu +
                ", diemDia=" + diemDia +
                '}';
    }
}
