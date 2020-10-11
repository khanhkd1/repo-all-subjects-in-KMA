/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau4;

import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class ThiSinhKhoiC extends ThiSinh{
    private double diemVan;
    private double diemSu;
    private double diemDia;

    public ThiSinhKhoiC() {
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhập điểm văn: "); setDiemVan(scan.nextDouble());
        System.out.print("\tNhập điểm sử: "); setDiemSu(scan.nextDouble());
        System.out.print("\tNhập điểm địa: "); setDiemDia(scan.nextDouble());
        
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    double tongDiem() {
        return diemVan + diemSu + diemDia;
    }
    
    

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" + "hoTen=" + getHoTen() + ", ngaySinh=" + getNgaySinh() + ", diaChi=" + getDiaChi() + ", diemVan=" + diemVan + ", diemSu=" + diemSu + ", diemDia=" + diemDia + ", tongDiem=" + tongDiem() + '}';
    }
    
    
    
    
    
}
