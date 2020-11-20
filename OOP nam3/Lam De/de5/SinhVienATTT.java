/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import java.io.Serializable;

/**
 *
 * @author khanhkd
 */
public class SinhVienATTT extends SinhVien implements Serializable{
    private float hocPhi;

    public SinhVienATTT() {
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienATTT{" + "maSV=" + getMaSV() + ", hoTen=" + getHoTen() + ", ngaySinh=" + getNgaySinh() + ", diemTB=" + getDiemTB() + ", hocPhi=" + hocPhi + '}';
    }
    
    
}
