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
public class ThiSinhKhoiA extends ThiSinh{
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinhKhoiA() {
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhập điểm toán: "); setDiemToan(scan.nextDouble());
        System.out.print("\tNhập điểm lý: "); setDiemLy(scan.nextDouble());
        System.out.print("\tNhập điểm hoá: "); setDiemHoa(scan.nextDouble());
        
    }

    @Override
    void xuat() {
        System.out.println("\t"+toString());
    }

    @Override
    double tongDiem() {
        return diemToan + diemLy + diemHoa;
    }
    
    

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" + "hoTen=" + getHoTen() + ", ngaySinh=" + getNgaySinh() + ", diaChi=" + getDiaChi() + ", diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + ", tongDiem=" + tongDiem() + '}';
    }
    
    
    
    
    
    
    
}
