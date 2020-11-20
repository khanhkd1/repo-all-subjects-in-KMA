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
public class Person {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;
    

    public Person() {
    }
    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
    
    void xuat(){
        System.out.println("\t" + toString());
    }

    @Override
    public String toString() {
        return hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh;
    }
    
}
