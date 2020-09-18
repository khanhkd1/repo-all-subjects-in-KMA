package OOP.Buoi3.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap n sinh vien");
            System.out.println("2. In");
            System.out.println("3. Sap xep theo diem TB");
            System.out.println("4. Exit");
            System.out.print("Nhap chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so sinh vien: "); int n = scan.nextInt();
                    for (int i=0; i<n; i++){
                        System.out.println("Nhap thong tin sv thu "+i);
                        SinhVien sv = new SinhVien();
                        sv.nhap();
                        arrSV.add(sv);
                    }
                    continue;
                case 2:
                    for (int i=0; i<arrSV.size(); i++){
                        System.out.println("Thong tin sv thu "+i);
                        arrSV.get(i).xuat();
                    }
                    continue;
                case 3:
                    Collections.sort(arrSV, SinhVien::compareTo);
                    continue;
                case 4:
                    break;
            }
            break;
        }

    }
}
