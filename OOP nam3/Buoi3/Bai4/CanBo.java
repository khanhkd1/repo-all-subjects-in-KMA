package OOP.Buoi3.Bai4;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tHo ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNam sinh: "); setNamSinh(scan.nextInt());
        scan.nextLine();
        System.out.print("\tGioi tinh: "); setGioiTinh(scan.nextLine());
        System.out.print("\tDia chi: "); setDiaChi(scan.nextLine());
    };

    void xuat(){};
}
