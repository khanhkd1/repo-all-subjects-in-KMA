package GiaiDeMienNam;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("1. Nhap, xuat thong tin nha.");
            System.out.println("2. Nhap, xuat thong tin dat.");
            System.out.println("3. Thoat.");
            System.out.print("Chon chuc nang: ");
            int choose = scan.nextInt();
            switch (choose){
                case 1:
                    Nha nha = new Nha();
                    nha.nhap();
                    nha.xuat();
                    continue;
                case 2:
                    Dat dat = new Dat();
                    dat.nhap();
                    dat.xuat();
                    continue;
                case 3:
                    break;
            }
            break;
        }
    }
}
