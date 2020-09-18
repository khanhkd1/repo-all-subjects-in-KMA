package OOP.Buoi2.Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private int soThanhVien;
    private String diaChi;
    private ArrayList<Nguoi> arrHoDan = new ArrayList<>();

    public HoDan() {
    }

    public HoDan(int soThanhVien, String diaChi, ArrayList<Nguoi> arrHoDan) {
        this.soThanhVien = soThanhVien;
        this.diaChi = diaChi;
        this.arrHoDan = arrHoDan;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<Nguoi> getArrHoDan() {
        return arrHoDan;
    }

    public void setArrHoDan(ArrayList<Nguoi> arrHoDan) {
        this.arrHoDan = arrHoDan;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap so thanh vien: "); setSoThanhVien(scan.nextInt());
        scan.nextLine();
        System.out.print("\tNhap dia chi: "); setDiaChi(scan.nextLine());
        ArrayList<Nguoi> arrHoDan = new ArrayList<>();
        for (int i=0; i<getSoThanhVien(); i++){
            System.out.println("\t---------------------");
            Nguoi nguoi = new Nguoi();
            nguoi.nhap();
            arrHoDan.add(nguoi);
        }
        setArrHoDan(arrHoDan);
    }

    void xuat(){
        System.out.println("\tDia chi: "+getDiaChi());
        for (Nguoi nguoi: getArrHoDan())
            nguoi.xuat();
    }
}
