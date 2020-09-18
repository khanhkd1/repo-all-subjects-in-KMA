package OOP.Buoi2.Bai2;

public class SinhVien {
    private String maSv;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, double diemLT, double diemTH) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double diemTB(){
        return (this.diemLT + this.diemTH)/2;
    }

    @Override
    public String toString() {
        return maSv + '\t' + hoTen + '\t' + diemLT +'\t'+ diemTH + '\t'+this.diemTB();
    }
}
