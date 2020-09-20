package OOP.Buoi3.Bai5;

import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh {
    private double diemToan;
    private double diemHoa;
    private double diemSinh;

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemSinh() {
        return diemSinh;
    }

    public void setDiemSinh(double diemSinh) {
        this.diemSinh = diemSinh;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin thi sinh khoi B:");
        super.nhap();
        System.out.print("\tDiem toan: "); setDiemToan(scan.nextDouble());
        System.out.print("\tDiem hoa: "); setDiemHoa(scan.nextDouble());
        System.out.print("\tDiem sinh: "); setDiemSinh(scan.nextDouble());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "soBaoDanh='" + getSoBaoDanh()+'\''+
                ", hoTen='" + getHoTen()+'\''+
                ", diaChi='" + getDiaChi()+'\''+
                ", uuTien='" + getUuTien() +'\''+
                ", diemToan=" + diemToan +
                ", diemHoa=" + diemHoa +
                ", diemSinh=" + diemSinh +
                '}';
    }
}
