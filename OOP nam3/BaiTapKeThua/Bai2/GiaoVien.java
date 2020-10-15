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
public class GiaoVien extends Nguoi{
    private float luongCung;
    private float thuong;
    private float phat;

    public GiaoVien() {
    }

    public float getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public float getPhat() {
        return phat;
    }

    public void setPhat(float phat) {
        this.phat = phat;
    }
    
    public float getThucLinh(){
        return getLuongCung() + getThuong() - getPhat();
    }

    @Override
    void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap luong cung: "); setLuongCung(scan.nextFloat());
        System.out.print("\tNhap thuong: "); setThuong(scan.nextFloat());
        System.out.print("\tNhap phat: "); setPhat(scan.nextFloat());
    }

    @Override
    public String toString() {
        return "GiaoVien" + "-" + getHoTen() + "-" + getNamSinh() + "-" + getQueQuan() + "-" + luongCung + "-" + thuong + "-" + phat + "-" + getThucLinh();
    }
    
    
    
    
    
}
