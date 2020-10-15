/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua.Bai1;

import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public ThiSinh() {
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
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

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }
    
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap SBD: "); setSoBaoDanh(scan.next());
        scan.nextLine();
        System.out.print("\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNhap dia chi: "); setDiaChi(scan.nextLine());
        System.out.print("\tNhap uu tien: "); setUuTien(scan.nextLine());
    }
    
    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "ThiSinh" + "-" + soBaoDanh + "-" + hoTen + "-" + diaChi + "-" + uuTien;
    }

    
    
    
    
}
