package OOP.Buoi3.Bai4;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int bac;

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin cong nhan:");
        super.nhap();
        System.out.print("\tBac: "); setBac(scan.nextInt());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "hoTen='" + getHoTen() + '\'' +
                ", namSinh=" + getNamSinh() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", bac='" + getBac()+"/9'" +
                '}';
    }
}
