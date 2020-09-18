package OOP.Buoi3.Bai2;

public class TaiLieu {
    private String maTL;
    private String tenNXB;
    private int soBanPH;


    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    void nhap(){};

    void xuat(){};

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTL='" + maTL + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBanPH=" + soBanPH +
                '}';
    }
}
