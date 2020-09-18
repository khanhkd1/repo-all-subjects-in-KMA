package OOP.Buoi3.Bai3;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public SoPhuc() {

    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap phan thuc: "); setPhanThuc(scan.nextDouble());
        System.out.print("Nhap phan ao: "); setPhanAo(scan.nextDouble());
    }

    void xuat(){
        System.out.println("\t"+toString());
    }

    public SoPhuc cong(SoPhuc sp){
        SoPhuc sumSP = new SoPhuc(getPhanThuc()+sp.getPhanThuc(),
                getPhanAo()+sp.getPhanAo());
        return sumSP;
    }

    public SoPhuc nhan(SoPhuc sp){
        SoPhuc nhanSP = new SoPhuc(getPhanThuc()* sp.getPhanThuc() - getPhanAo()*sp.getPhanAo(),
                getPhanThuc()*sp.getPhanAo()+getPhanAo()*sp.getPhanThuc());
        return nhanSP;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                phanThuc +
                " + " + phanAo + "i"
                + '}';
    }
}
