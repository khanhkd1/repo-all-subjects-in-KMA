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
public class SinhVienMatMa extends SinhVien implements Serializable{
    private String donVi;
    private float luong;

    public SinhVienMatMa() {
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVienMatMa{" + "maSV=" + getMaSV() + ", hoTen=" + getHoTen() + ", ngaySinh=" + getNgaySinh() + ", diemTB=" + getDiemTB() + ", donVi=" + donVi + ", luong=" + luong + '}';
    }
    
    
}
