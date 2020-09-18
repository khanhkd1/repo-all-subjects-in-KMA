package OOP.Buoi3.Bai3;

public class Main {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        sp1.nhap();
        sp2.nhap();
        sp1.cong(sp2).xuat();
        sp1.nhan(sp2).xuat();
    }
}
