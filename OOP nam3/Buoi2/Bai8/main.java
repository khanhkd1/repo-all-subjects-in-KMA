package ThucHanhBuoi4.Bai1;

import java.util.Scanner;

public class main {

    public static void tongPhanSo(PhanSo ps1, PhanSo ps2){
        PhanSo psSum = new PhanSo(ps1.tuSo*ps2.mauSo + ps1.mauSo*ps2.tuSo, ps1.mauSo*ps2.mauSo);
        psSum = rutGon(psSum);
        System.out.println("Tong 2 phan so la: "+psSum.toString());
    }

    public static void hieuPhanSo(PhanSo ps1, PhanSo ps2){
        PhanSo psHieu = new PhanSo(ps1.tuSo*ps2.mauSo - ps1.mauSo*ps2.tuSo, ps1.mauSo*ps2.mauSo);
        psHieu = rutGon(psHieu);
        System.out.println("Hieu 2 phan so la: "+psHieu.toString());
    }

    public static void tichPhanSo(PhanSo ps1, PhanSo ps2){
        PhanSo psTich = new PhanSo(ps1.tuSo*ps2.tuSo, ps1.mauSo*ps2.mauSo);
        psTich = rutGon(psTich);
        System.out.println("Tich 2 phan so la: "+psTich.toString());
    }

    public static void thuongPhanSo(PhanSo ps1, PhanSo ps2){
        PhanSo psThuong = new PhanSo(ps1.tuSo*ps2.mauSo, ps1.mauSo*ps2.tuSo);
        psThuong = rutGon(psThuong);
        System.out.println("Thuong 2 phan so la: "+psThuong.toString());
    }

    public static PhanSo rutGon(PhanSo ps){
        int uc = ps.UCLN();
        ps.tuSo /= uc;
        ps.mauSo /= uc;
        return ps;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao tu so phan so thu nhat: "); int tuSo1 = scan.nextInt();
        System.out.print("Nhap vao mau so phan so thu nhat: "); int mauSo1 = scan.nextInt();
        System.out.print("Nhap vao tu so phan so thu hai: "); int tuSo2 = scan.nextInt();
        System.out.print("Nhap vao mau so phan so thu hai: "); int mauSo2 = scan.nextInt();
        PhanSo p1 = new PhanSo(tuSo1, mauSo1);
        PhanSo p2 = new PhanSo(tuSo2, mauSo2);
        tongPhanSo(p1, p2);
        hieuPhanSo(p1, p2);
        tichPhanSo(p1, p2);
        thuongPhanSo(p1, p2);
    }
}
