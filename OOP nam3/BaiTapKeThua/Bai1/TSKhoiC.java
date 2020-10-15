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
public class TSKhoiC extends ThiSinh{
    private float diemVan;
    private float diemSu;
    private float diemDia;

    public TSKhoiC() {
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(float diemSu) {
        this.diemSu = diemSu;
    }

    public float getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(float diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap diem van: "); setDiemVan(scan.nextFloat());
        System.out.print("\tNhap diem su: "); setDiemSu(scan.nextFloat());
        System.out.print("\tNhap diem dia: "); setDiemDia(scan.nextFloat());
    }

    @Override
    public String toString() {
        return "TSKhoiC" + "-" + getSoBaoDanh() + "-" + getHoTen() + "-" + getDiaChi() + "-" + getUuTien()+ "-" + diemVan + "-" + diemSu + "-" + diemDia;
    }
    
    
    
}
