package OOP.Buoi3.Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<HocSinh> arrHocSinh = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap n hoc sinh.");
            System.out.println("2. In danh sach hoc sinh.");
            System.out.println("3. Tim hoc sinh theo que quan.");
            System.out.println("4. Exit.");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so luong: "); int soLuong = scan.nextInt();
                    for (int i = 0; i<soLuong; i++){
                        System.out.println("Nhap thong tin hoc sinh thu "+i);
                        HocSinh hs = new HocSinh();
                        hs.nhap();
                        arrHocSinh.add(hs);
                    }
                    continue;
                case 2:
                    for (int i=0; i< arrHocSinh.size(); i++){
                        arrHocSinh.get(i).xuat();
                        System.out.println("\t-------------");
                    }
                    continue;
                case 3:
                    System.out.print("Nhap que quan: ");
                    scan.nextLine();
                    String queQuan = scan.nextLine();
                    for (int i=0; i< arrHocSinh.size(); i++){
                        if (arrHocSinh.get(i).getQueQuan().equals(queQuan))
                            arrHocSinh.get(i).xuat();
                    }
                    continue;
                case 4:
                    break;
            }
            break;
        }
    }
}
