/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau7;

/**
 *
 * @author khanhkd
 */
public class NhanVien extends Person{
    private String phongBan;
    private double heSoLuong;
    private int thamNien;
    private double luongCoBan;

    public NhanVien() {
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    double getLuongThucLinh(){
        return getLuongCoBan() * getHeSoLuong() * (1 + getThamNien()/100);
    }

    @Override
    public String toString() {
        return getHoTen() + "-" + getNgaySinh() + "-" + getDiaChi() + "-" + getGioiTinh() + "-" + phongBan + "-" + heSoLuong + "-" + thamNien + "-" + luongCoBan;
    }
    
    
    
}
