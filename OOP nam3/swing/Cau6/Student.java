/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau6;

import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class Student {
    private String hoTen;
    private int tuoi;

    public Student() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap ho ten: "); setHoTen(scan.nextLine());
        System.out.print("\tNhap tuoi: "); setTuoi(scan.nextInt());
    }
    
}
