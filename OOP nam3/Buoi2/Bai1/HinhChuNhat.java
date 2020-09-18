package OOP.Buoi2.Bai1;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double perimeter(){
        return (this.getChieuDai() + this.getChieuRong()) * 2;
    }

    public double acreage(){
        return this.getChieuDai() * this.getChieuRong();
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + this.chieuDai +
                ", chieuRong=" + this.chieuRong +
                ", chuVi=" + this.perimeter() +
                ", dienTich=" + this.acreage() +
                '}';
    }
}
