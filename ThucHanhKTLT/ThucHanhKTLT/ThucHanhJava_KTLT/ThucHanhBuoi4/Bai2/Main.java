package ThucHanhBuoi4.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<SinhVien> sortSV(ArrayList<SinhVien> sv){
        Collections.sort(sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() > o2.getDiem())
                    return 1;
                else if (o1.getDiem() == o2.getDiem())
                    return 0;
                else return -1;
            }
        });
        return sv;
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> mangSV = new ArrayList<SinhVien>();
        Scanner scan = new Scanner(System.in);
        String choose;
        while (true){
            System.out.println("\n1. Nhap danh sach sinh vien.");
            System.out.println("2. Hien thi danh sach sinh vien.");
            System.out.println("3. Tim kiem sinh vien theo ten.");
            System.out.println("4. Sap xep sinh vien theo chieu tang cua diem.");
            System.out.println("5. Them 1 sinh vien vao danh sach ma khong thay doi tinh sap xep.");
            System.out.println("6. Loai bo 1 sinh vien theo ma sinh vien.");
            System.out.println("Nhan z de thoat chuong trinh.");
            System.out.print("Nhap chuc nang: "); choose = scan.next();
            switch (choose){
                case "1":
                    SinhVien sv = new SinhVien();
                    sv.nhap();
                    mangSV.add(sv);
                    continue;
                case "2":
                    for (SinhVien x: mangSV){
                        x.xuat();
                    }
                    continue;
                case "3":
                    scan.nextLine();
                    System.out.print("\n\tNhap vao ten muon tim kiem: "); String ten = scan.nextLine();
                    for (SinhVien x: mangSV){
                        if (x.getHoTen().contains(ten))
                            x.xuat();
                    }
                    continue;
                case "4":
                    mangSV = sortSV(mangSV);
                    for (SinhVien x: mangSV){
                        x.xuat();
                    }
                    continue;
                case "5":
                    SinhVien sv_temp = new SinhVien();
                    sv_temp.nhap();
                    mangSV.add(sv_temp);
                    mangSV = sortSV(mangSV);
                    continue;
                case "6":
                    System.out.print("Nhap ma sinh vien muon remove: "); String maSV = scan.next();
                    for (SinhVien x: mangSV){
                        if (x.getMaSV().equals(maSV)){
                            mangSV.remove(x);
                            break;
                        }
                    }
                    continue;
                case "z":
                    break;
            }
            break;
        }
    }

}
