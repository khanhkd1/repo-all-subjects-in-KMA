/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

/**
 *
 * @author khanhkd
 */
public class NhanVien extends Person{
    private String phongBan;
    private int heSoLuong;
    private int thamNien;
    private int luongCoBan;

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, int heSoLuong, int thamNien, int luongCoBan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    NhanVien() {
        super();
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    
    
    double getThucLinh(){
        return getLuongCoBan() * getHeSoLuong() * (1 + getThamNien()/100);
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + getHoTen() + ", ngaySinh=" + getNgaySinh() + ", diaChi=" + getDiaChi() + ", gioiTinh=" + getGioiTinh() + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan + '}';
    }
    
    
}
