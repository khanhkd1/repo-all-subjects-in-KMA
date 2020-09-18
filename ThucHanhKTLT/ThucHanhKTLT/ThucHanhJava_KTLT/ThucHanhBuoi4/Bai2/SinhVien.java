package ThucHanhBuoi4.Bai2;

import java.util.Scanner;

public class SinhVien {
    private String maSV, hoTen;
    private double diem;

    public SinhVien(String maSV, String hoTen, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }



    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap ma sinh vien: "); this.setMaSV(scan.nextLine());
        System.out.print("\tNhap ho ten: "); this.setHoTen(scan.nextLine());
        System.out.print("\tNhap diem: "); this.setDiem(scan.nextDouble());
    }

    public void xuat(){
        System.out.println("\n\tMa sinh vien: "+this.getMaSV());
        System.out.println("\tHo ten: "+this.getHoTen());
        System.out.println("\tDiem: "+this.getDiem());
    }

}
