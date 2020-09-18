package OOP.Buoi3.Bai2;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma tap chi: "); setMaTL(scan.nextLine());
        System.out.print("Nhap ten NXB: "); setTenNXB(scan.nextLine());
        System.out.print("Nhap so phat hanh: "); setSoPH(scan.nextInt());
        System.out.print("Nhap thang phat hanh: "); setThangPH(scan.nextInt());
        System.out.print("Nhap so ban phat hanh: "); setSoBanPH(scan.nextInt());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTapChi='" + getMaTL() + '\'' +
                ", NXB='" + getTenNXB() + '\'' +
                ", soPH=" + soPH +
                ", thangPH=" + thangPH +
                ", soBanPH=" + getSoBanPH() +
                '}';
    }
}
