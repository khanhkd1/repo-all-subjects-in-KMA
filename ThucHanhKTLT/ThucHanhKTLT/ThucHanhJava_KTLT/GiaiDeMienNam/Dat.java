package GiaiDeMienNam;

import java.util.Scanner;

public class Dat extends ThongTin{
    String loaiDat;

    public Dat() {
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public void nhap() {
        Scanner scan = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai dat: "); setLoaiDat(scan.next());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loai dat: "+getLoaiDat());
    }

    @Override
    public double thanhTien() {
        if (getLoaiDat().toUpperCase().equals("A"))
            return getDienTich()*getDonGia()*1.5;
        else return getDienTich()*getDonGia();
    }
}
