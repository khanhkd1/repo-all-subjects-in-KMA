package OOP_nam3.Buoi4.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SinhVien> arrSinhVien = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Sort");
            System.out.println("4. Sort follow enum (pass)");
            System.out.println("5. Exit");
            System.out.print("Nhap chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so luong: "); int soLuong = scan.nextInt();
                    for (int i=0; i<soLuong; i++){
                        SinhVien sv = new SinhVien();
                        sv.nhap();
                        arrSinhVien.add(sv);
                    }
                    continue;
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    for (int i=0; i<arrSinhVien.size(); i++)
                        arrSinhVien.get(i).xuat();
                    continue;
                case 3:
                    Collections.sort(arrSinhVien, SinhVien::compareTo);
                    continue;
                case 4:
                    continue;
                case 5:
                    break;
            }
            break;
        }
    }
}
