package OOP.Buoi3.Bai2;


import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tacGia;
    private int soTrang;


    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma sach: "); setMaTL(scan.nextLine());
        System.out.print("Nhap ten NXB: "); setTenNXB(scan.nextLine());
        System.out.print("Nhap tac gia: "); setTacGia(scan.nextLine());
        System.out.print("Nhap so trang: "); setSoTrang(scan.nextInt());
        System.out.print("Nhap so ban phat hanh: "); setSoBanPH(scan.nextInt());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + getMaTL() + '\'' +
                ", NXB='" + getTenNXB() + '\'' +
                ", tacGia='" + getTacGia() + '\'' +
                ", soTrang=" + getSoTrang() +
                ", soBanPH=" + getSoBanPH() +
                '}';
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }
}
