/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

import java.io.Serializable;

/**
 *
 * @author khanhkd
 */
public class SinhVien extends Person implements Serializable{
    private String chuyenNganh;
    private float diemQuaTrinh;
    private float diemHocPhan;

    public SinhVien() {
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public float getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(float diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public float getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(float diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + getHoTen() + ", ngaySinh=" + getNgaySinh() + ", diaChi=" + getDiaChi() + ", gioiTinh=" + getGioiTinh() + ", chuyenNganh=" + chuyenNganh + ", diemQuaTrinh=" + diemQuaTrinh + ", diemHocPhan=" + diemHocPhan + ", diemTongKet=" + getDiemTongKet() + ", xepHang=" + getXepHang() + '}';
    }
    
    float getDiemTongKet(){
        return (float) (diemQuaTrinh * 0.3 + diemHocPhan * 0.7);
    }
    
    String getXepHang(){
        if (getDiemTongKet() < 4) return "F";
        else if (getDiemTongKet() < 5) return "D";
        else if (getDiemTongKet() < 6) return "C";
        else if (getDiemTongKet() < 8.5) return "B";
        return "A";
    }
}
