/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua.Bai2;

import BaiTapKeThua.Bai1.ThiSinh;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<GiaoVien> arrGiaoVien = new ArrayList<>();
        while(true){
            System.out.println("1. Nhap danh sach.");
            System.out.println("2. In danh sach.");
            System.out.println("3. Ghi danh sach -> File.");
            System.out.println("4. Doc file.");
            System.out.println("5. Exit.");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch(choose){
                case 1:
                    System.out.print("Nhap so luong: "); int soLuong = scan.nextInt();
                    for (int i=0; i<soLuong; i++){
                        System.out.println("Nhap thong tin giao vien:");
                        GiaoVien gv = new GiaoVien();
                        gv.nhap();
                        arrGiaoVien.add(gv);
                    }
                    continue;
                case 2:
                    for (GiaoVien gv: arrGiaoVien)
                        gv.xuat();
                    continue;
                case 3:
                    FileOutputStream fileOp = new FileOutputStream("/Users/khanhkd/NetBeansProjects/OOP/src/BaiTapKeThua/Bai2/data.txt", true);
                    OutputStreamWriter opStreamW = new OutputStreamWriter(fileOp);
                    BufferedWriter bfWriter = new BufferedWriter(opStreamW);
                    for (GiaoVien gv : arrGiaoVien){
                        bfWriter.write(gv.toString());
                        bfWriter.newLine();
                    }
                    bfWriter.close();
                    opStreamW.close();
                    fileOp.close();
                    continue;
                case 4:
                    FileInputStream fileIp = new FileInputStream("/Users/khanhkd/NetBeansProjects/OOP/src/BaiTapKeThua/Bai2/data.txt");
                    InputStreamReader ipStreamR = new InputStreamReader(fileIp);
                    BufferedReader bfReader = new BufferedReader(ipStreamR);
                    String line = "";
                    while((line = bfReader.readLine()) != null){
                        String[] listIn4 = line.split("-");
                        GiaoVien gv = new GiaoVien();
                        gv.setHoTen(listIn4[1]);
                        gv.setNamSinh(listIn4[2]);
                        gv.setQueQuan(listIn4[3]);
                        gv.setLuongCung(Float.parseFloat(listIn4[4]));
                        gv.setThuong(Float.parseFloat(listIn4[5]));
                        gv.setPhat(Float.parseFloat(listIn4[6]));
                        arrGiaoVien.add(gv);
                    }
                    
                    for(GiaoVien gv : arrGiaoVien)
                        gv.xuat();
                    continue;
                case 5:
                    break;
            }
            
            break;
        }
    }
    
}
