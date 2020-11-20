/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3;

/**
 *
 * @author khanhkd
 */
public class NhanVien extends Person{
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private float luongCoBan;

    public NhanVien() {
    }
    
    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    float getLuongThucLinh(){
        return getLuongCoBan() * getHeSoLuong() * (1 + getThamNien()/100);
    }

    @Override
    public String toString() {
        return getHoTen() + "$" + getNgaySinh() + "$" + getDiaChi() + "$" + getGioiTinh() + "$" + phongBan + "$" + heSoLuong + "$" + thamNien + "$" + luongCoBan + "$" + getLuongThucLinh();
    }
    
}
