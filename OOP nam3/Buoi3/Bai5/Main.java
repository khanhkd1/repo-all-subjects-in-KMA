package OOP.Buoi3.Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ThiSinh> arrThiSinh = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap danh sach thi sinh.");
            System.out.println("2. In danh sach.");
            System.out.println("3. Tim kiem theo so bao danh.");
            System.out.println("4. Exit.");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so luong thi sinh: "); int soLuong = scan.nextInt();
                    for (int i=0; i<soLuong; i++){
                        System.out.print("1-khoiA, 2-khoiB, 3-khoiC: "); int temp = scan.nextInt();
                        switch (temp){
                            case 1:
                                ThiSinhKhoiA tsA = new ThiSinhKhoiA();
                                tsA.nhap();
                                arrThiSinh.add(tsA);
                                break;
                            case 2:
                                ThiSinhKhoiB tsB = new ThiSinhKhoiB();
                                tsB.nhap();
                                arrThiSinh.add(tsB);
                                break;
                            case 3:
                                ThiSinhKhoiC tsC = new ThiSinhKhoiC();
                                tsC.nhap();
                                arrThiSinh.add(tsC);
                                break;
                        }
                    }
                    continue;
                case 2:
                    System.out.println("Danh sach thi sinh:");
                    for (int i=0; i<arrThiSinh.size(); i++){
                        arrThiSinh.get(i).xuat();
                        System.out.println("\t----------------");
                    }
                    continue;
                case 3:
                    System.out.print("Nhap so bao danh muon tim: "); String sbd = scan.next();
                    for (int i=0; i<arrThiSinh.size(); i++)
                        if (arrThiSinh.get(i).getSoBaoDanh().equals(sbd)){
                            arrThiSinh.get(i).xuat();
                            break;
                        }
                    continue;
                case 4:
                    break;
            }
            break;
        }
    }
}
