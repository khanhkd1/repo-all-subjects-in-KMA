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
public class TSKhoiA extends ThiSinh{
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public TSKhoiA() {
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap diem toan: "); setDiemToan(scan.nextFloat());
        System.out.print("\tNhap diem ly: "); setDiemLy(scan.nextFloat());
        System.out.print("\tNhap diem hoa: "); setDiemHoa(scan.nextFloat());
    }
    

    @Override
    public String toString() {
        return "TSKhoiA" + "-" + getSoBaoDanh() + "-" + getHoTen() + "-" + getDiaChi() + "-" + getUuTien() + "-" + diemToan + "-" + diemLy + "-" + diemHoa;
    }
    
    
    
    
    
}
