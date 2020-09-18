package OOP.Buoi3.Bai4;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien:");
        super.nhap();
        System.out.print("\tCong viec: "); setCongViec(scan.nextLine());
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "hoTen='" + getHoTen() + '\'' +
                ", namSinh=" + getNamSinh() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", congViec='" + congViec + '\'' +
                '}';
    }
}
