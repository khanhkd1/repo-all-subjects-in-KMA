/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau4;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author khanhkd
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ThiSinh> arrThiSinh = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1. Nhập danh sách thí sinh.");
            System.out.println("2. In danh sách thí sinh.");
            System.out.println("3. In danh sách thí sinh trúng tuyển.");
            System.out.println("4. Exit.");
            System.out.print("Chọn chức năng: "); int choose = scan.nextInt();
            switch(choose){
                case 1:
                    System.out.print("Nhập số lượng: "); int soLuong = scan.nextInt();
                    for(int i=0; i< soLuong; i++){
                        System.out.println("Chọn khối (1-A, 2-C): "); int khoi = scan.nextInt();
                        switch(khoi){
                            case 1:
                                System.out.println("Nhập thông tin thí sinh thứ "+i);
                                ThiSinhKhoiA tsA = new ThiSinhKhoiA();
                                tsA.nhap();
                                arrThiSinh.add(tsA);
                                break;
                            case 2:
                                System.out.println("Nhập thông tin thí sinh thứ "+i);
                                ThiSinhKhoiC tsC = new ThiSinhKhoiC();
                                tsC.nhap();
                                arrThiSinh.add(tsC);
                                break;
                            default:
                                continue;
                        }
                    }
                    continue;
                case 2:
                    for(ThiSinh ts: arrThiSinh)
                        ts.xuat();
                    continue;
                case 3:
                    for(ThiSinh ts: arrThiSinh)
                        if(ts.tongDiem() > 20)
                            ts.xuat();
                    continue;
                case 4:
                    break;
            }
            break;
        }
    }
}
