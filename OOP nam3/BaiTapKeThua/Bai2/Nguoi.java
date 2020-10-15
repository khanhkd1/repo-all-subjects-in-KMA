/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua.Bai2;

import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class Nguoi {
    private String hoTen;
    private String namSinh;
    private String queQuan;

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNhap ngay sinh: "); setNamSinh(scan.nextLine());
        System.out.print("\tNhap que quan: "); setQueQuan(scan.nextLine());
    }
    
    void xuat(){
        System.out.println("\t"+toString());
    }

    @Override
    public String toString() {
        return "Nguoi" + "-" + hoTen + "-" + namSinh + "-" + queQuan;
    }
    
    
}
