/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua.Bai1;

import com.sun.corba.se.impl.encoding.BufferManagerWrite;
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
public class TuyenSinh {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<ThiSinh> arrThiSinh = new ArrayList<>();
        while(true){
            System.out.println("1. Nhap danh sach.");
            System.out.println("2. In danh sach.");
            System.out.println("3. Tim kiem theo so bao danh.");
            System.out.println("4. Luu danh sach -> File.");
            System.out.println("5. Doc danh sach tu File.");
            System.out.println("6. Exit.");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch(choose){
                case 1:
                    System.out.print("Nhap so luong thi sinh: "); int soLuong = scan.nextInt();
                    for (int i=0; i<soLuong; i++){
                        System.out.print("Nhap khoi: "); String khoi = scan.next();
                        if(khoi.toLowerCase().equals("a")){
                            TSKhoiA tsA = new TSKhoiA();
                            tsA.nhap();
                            arrThiSinh.add(tsA);
                        }
                        else if (khoi.toLowerCase().equals("b")){
                            TSKhoiB tsB = new TSKhoiB();
                            tsB.nhap();
                            arrThiSinh.add(tsB);
                        }
                        else{
                            TSKhoiC tsC = new TSKhoiC();
                            tsC.nhap();
                            arrThiSinh.add(tsC);
                        }
                    }
                    continue;
                case 2: 
                    for(ThiSinh ts: arrThiSinh)
                        ts.xuat();
                    continue;
                case 4:
                    FileOutputStream fileOp = new FileOutputStream("/Users/khanhkd/NetBeansProjects/OOP/src/BaiTapKeThua/Bai1/data.txt", true);
                    OutputStreamWriter opStreamW = new OutputStreamWriter(fileOp);
                    BufferedWriter bfWriter = new BufferedWriter(opStreamW);
                    for (ThiSinh ts : arrThiSinh){
                        bfWriter.write(ts.toString());
                        bfWriter.newLine();
                    }
                    bfWriter.close();
                    opStreamW.close();
                    fileOp.close();
                    continue;
                case 5:
                    FileInputStream fileIp = new FileInputStream("/Users/khanhkd/NetBeansProjects/OOP/src/BaiTapKeThua/Bai1/data.txt");
                    InputStreamReader ipStreamR = new InputStreamReader(fileIp);
                    BufferedReader bfReader = new BufferedReader(ipStreamR);
                    String line = "";
                    while((line = bfReader.readLine()) != null){
                        String[] listIn4 = line.split("-");
                        if(listIn4[0].equals("TSKhoiA")){
                            TSKhoiA tsA = new TSKhoiA();
                            tsA.setSoBaoDanh(listIn4[1]);
                            tsA.setHoTen(listIn4[2]);
                            tsA.setDiaChi(listIn4[3]);
                            tsA.setUuTien(listIn4[4]);
                            tsA.setDiemToan(Float.parseFloat(listIn4[5]));
                            tsA.setDiemLy(Float.parseFloat(listIn4[6]));
                            tsA.setDiemHoa(Float.parseFloat(listIn4[7]));
                            arrThiSinh.add(tsA);
                        }
                        else if(listIn4[0].equals("TSKhoiB")){
                            TSKhoiB tsB = new TSKhoiB();
                            tsB.setSoBaoDanh(listIn4[1]);
                            tsB.setHoTen(listIn4[2]);
                            tsB.setDiaChi(listIn4[3]);
                            tsB.setUuTien(listIn4[4]);
                            tsB.setDiemToan(Float.parseFloat(listIn4[5]));
                            tsB.setDiemSinh(Float.parseFloat(listIn4[7]));
                            tsB.setDiemHoa(Float.parseFloat(listIn4[6]));
                            arrThiSinh.add(tsB);
                        }
                        else{
                            TSKhoiC tsC = new TSKhoiC();
                            tsC.setSoBaoDanh(listIn4[1]);
                            tsC.setHoTen(listIn4[2]);
                            tsC.setDiaChi(listIn4[3]);
                            tsC.setUuTien(listIn4[4]);
                            tsC.setDiemVan(Float.parseFloat(listIn4[5]));
                            tsC.setDiemSu(Float.parseFloat(listIn4[6]));
                            tsC.setDiemDia(Float.parseFloat(listIn4[7]));
                            arrThiSinh.add(tsC);
                        }
                    }
                    
                    for(ThiSinh ts : arrThiSinh)
                        ts.xuat();
                    continue;
                case 3:
                    System.out.print("Nhap so bao danh can tim: ");
                    String sbd = scan.next();
                    for (ThiSinh ts : arrThiSinh)
                        if(ts.getSoBaoDanh().equals(sbd))
                            ts.xuat(); 
                    continue;
                case 6:
                    break;
            }
            break;
        }
    }
}
