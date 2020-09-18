package OOP.Buoi3.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TaiLieu> arrTL = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Tim kiem theo loai");
            System.out.println("4. Exit");
            System.out.print("Nhap lua chon: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so tai lieu: "); int num = scan.nextInt();
                    for (int i=0; i<num; i++){
                        System.out.print("Nhap loai tai lieu (1-sach, 2-tapchi, 3-bao): ");
                        int n = scan.nextInt();
                        switch (n){
                            case 1:
                                Sach sach = new Sach();
                                sach.nhap();
                                arrTL.add(sach);
                                break;
                            case 2:
                                TapChi tc = new TapChi();
                                tc.nhap();
                                arrTL.add(tc);
                                break;
                            case 3:
                                Bao bao = new Bao();
                                bao.nhap();
                                arrTL.add(bao);
                                break;
                            default:
                                continue;
                        }
                    }
                    continue;
                case 2:
                    for (int i=0; i< arrTL.size(); i++)
                        arrTL.get(i).xuat();
                    continue;
                case 3:
                    System.out.print("Nhap tai lieu muon tim (1-sach, 2-tapchi, 3-bao): ");
                    int tim = scan.nextInt();
                    switch (tim){
                        case 1:
                            for (int i=0; i<arrTL.size(); i++)
                                if (arrTL.get(i).getClass().equals(Sach.class))
                                    arrTL.get(i).xuat();
                            break;
                        case 2:
                            for (int i=0; i<arrTL.size(); i++)
                                if (arrTL.get(i).getClass().equals(TapChi.class))
                                    arrTL.get(i).xuat();
                            break;
                        case 3:
                            for (int i=0; i<arrTL.size(); i++)
                                if (arrTL.get(i).getClass().equals(Bao.class))
                                    arrTL.get(i).xuat();
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
