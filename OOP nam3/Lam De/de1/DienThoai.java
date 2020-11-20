/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.io.Serializable;

/**
 *
 * @author khanhkd
 */
public class DienThoai extends HangHoa implements Serializable{
    private String nhaSanXuat;
    private int boNho;
    private String mauSac;

    public DienThoai() {
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getBoNho() {
        return boNho;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "DienThoai{"+ "maHang=" + getMaHang() + ", tenHang=" + getTenHang() + ", giaBan=" + getGiaBan() + ", nhaSanXuat=" + nhaSanXuat + ", boNho=" + boNho + ", mauSac=" + mauSac + '}';
    }

    
    
    
    
}
