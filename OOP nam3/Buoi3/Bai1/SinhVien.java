package OOP.Buoi3.Bai1;

import OOP.Buoi2.Bai5.ThiSinh;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String maSV;
    private double diemTB;

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap ma sv: "); setMaSV(scan.next());
        scan.nextLine();
        System.out.print("\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNhap nam sinh: "); setNamSinh(scan.nextInt());
        System.out.print("\tNhap diem TB: "); setDiemTB(scan.nextDouble());
    }

    void xuat(){
        System.out.println("\t"+toString());
    }

    public int compareTo(SinhVien sv) {
        if (this.getDiemTB() > sv.getDiemTB())
            return -1;
        else if (this.getDiemTB() == sv.getDiemTB())
            return 0;
        else return 1;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + getMaSV() + '\'' +
                ", hoTen='" + getHoTen() + '\'' +
                ", namSinh=" + getNamSinh() +
                ", diemTB=" + getDiemTB() +
                '}';
    }
}
