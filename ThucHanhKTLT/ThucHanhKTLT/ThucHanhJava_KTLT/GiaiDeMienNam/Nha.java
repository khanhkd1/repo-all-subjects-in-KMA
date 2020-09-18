package GiaiDeMienNam;

import java.util.Scanner;

public class Nha extends ThongTin{
    String loaiNha;

    public Nha() {
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai nha : "); setLoaiNha(scan.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loai nha: "+getLoaiNha());
    }

    @Override
    public double thanhTien() {
        if (getLoaiNha().toUpperCase().equals("BIET THU"))
            return getDienTich()*getDonGia();
        else return getDienTich()*getDonGia()*0.9;
    }
}
