package OOP_nam3.Buoi4.Bai2;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    public enum XEPLOAI{
        GIOI, KHA, TRUNGBINH, YEU;
    }
    
    private String maSV;
    private double diemTB;

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
        System.out.println("\t--------------");
    }

    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + getHoTen() + '\'' +
                ", namSinh=" + getNamSinh() +
                ", diemTB=" + diemTB +
                '}';
    }

    public int compareTo(SinhVien sv){
        if (diemTB > sv.diemTB) return 1;
        else if (diemTB == sv.diemTB) return 0;
        else return -1;
    }
}
