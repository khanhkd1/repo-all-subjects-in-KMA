package OOP.Buoi3.Bai5;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh{
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin thi sinh khoi A:");
        super.nhap();
        System.out.print("\tDiem toan: "); setDiemToan(scan.nextDouble());
        System.out.print("\tDiem ly: "); setDiemLy(scan.nextDouble());
        System.out.print("\tDiem hoa: "); setDiemHoa(scan.nextDouble());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "soBaoDanh='" + getSoBaoDanh()+'\''+
                ", hoTen='" + getHoTen()+'\''+
                ", diaChi='" + getDiaChi()+'\''+
                ", uuTien='" + getUuTien() +'\''+
                ", diemToan=" + getDiemToan() +
                ", diemLy=" + getDiemLy() +
                ", diemHoa=" + getDiemHoa() +
                '}';
    }
}
