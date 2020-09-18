package OOP.Buoi2.Bai5;

import java.util.Scanner;

public class ThiSinh {
    String maTS;
    String hoTen;
    double diemToan;
    double diemLy;
    double diemHoa;

    public ThiSinh() {
    }

    public ThiSinh(String maTS, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaTS() {
        return maTS;
    }

    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

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

    public double sumDiem(){
        return getDiemToan() + getDiemLy() + getDiemHoa();
    }

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap ma TS: "); setMaTS(scan.nextLine());
        System.out.print("\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNhap diem toan: "); setDiemToan(scan.nextDouble());
        System.out.print("\tNhap diem ly: "); setDiemLy(scan.nextDouble());
        System.out.print("\tNhap diem hoa: "); setDiemHoa(scan.nextDouble());
    }

    public void xuat(){
        System.out.println("\tMa: "+getMaTS());
        System.out.println("\tHo ten: "+getHoTen());
        System.out.println("\tDiem toan: "+getDiemToan());
        System.out.println("\tDiem ly: "+getDiemLy());
        System.out.println("\tDiem hoa: "+getDiemHoa());
        System.out.println("\tTong diem: "+sumDiem());
    }

    public int compareTo(ThiSinh ts) {
        return getHoTen().compareTo(ts.getHoTen());
    }

}
