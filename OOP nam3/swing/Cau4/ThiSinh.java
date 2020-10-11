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
public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhập họ tên: "); setHoTen(scan.nextLine());
        System.out.print("\tNhập ngày sinh: "); setNgaySinh(scan.next());
        scan.nextLine();
        System.out.print("\tNhập địa chỉ: "); setDiaChi(scan.nextLine());
    }
    
    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + '}';
    }
    
    double tongDiem(){
        return 0;
    }
    
    
}
