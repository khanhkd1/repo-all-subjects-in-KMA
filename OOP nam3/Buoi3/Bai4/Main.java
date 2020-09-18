package OOP.Buoi3.Bai4;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<CanBo> arrCanBo = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap danh sach can bo.");
            System.out.println("2. Tim kiem theo ho ten.");
            System.out.println("3. Hien thi danh sach can bo.");
            System.out.println("4. Exit.");
            System.out.print("Nhap lua chon: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so luong can bo muon them: "); int n = scan.nextInt();
                    for (int i=0; i<n; i++){
                        System.out.print("1-CongNhan, 2-KySu, 3-NhanVien: "); int m = scan.nextInt();
                        switch (m){
                            case 1:
                                CongNhan cn = new CongNhan();
                                cn.nhap();
                                arrCanBo.add(cn);
                                break;
                            case 2:
                                KySu ks = new KySu();
                                ks.nhap();
                                arrCanBo.add(ks);
                                break;
                            case 3:
                                NhanVien nv = new NhanVien();
                                nv.nhap();
                                arrCanBo.add(nv);
                                break;
                        }
                    }
                    continue;
                case 2:
                    System.out.print("Nhap ho ten muon tim: ");
                    scan.nextLine();
                    String hoTen = scan.nextLine();
                    for (int i=0; i<arrCanBo.size(); i++)
                        if (arrCanBo.get(i).getHoTen().toUpperCase().contains(hoTen.toUpperCase()))
                            arrCanBo.get(i).xuat();
                    continue;
                case 3:
                    System.out.println("Danh sach cac can bo:");
                    for (int i=0; i<arrCanBo.size(); i++){
                        arrCanBo.get(i).xuat();
                        System.out.println("\t--------------");
                    }
                    continue;
                case 4:
                    break;
            }
            break;
        }
    }
}
