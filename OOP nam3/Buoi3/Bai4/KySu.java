package OOP.Buoi3.Bai4;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nghanhDaoTao;

    public String getNghanhDaoTao() {
        return nghanhDaoTao;
    }

    public void setNghanhDaoTao(String nghanhDaoTao) {
        this.nghanhDaoTao = nghanhDaoTao;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin ky su:");
        super.nhap();
        System.out.print("\tNghanh dao tao: "); setNghanhDaoTao(scan.nextLine());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "KySu{" +
                "hoTen='" + getHoTen() + '\'' +
                ", namSinh=" + getNamSinh() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", nghanhDaoTao='" + getNghanhDaoTao() + '\'' +
                '}';
    }
}
