package OOP.Buoi2.Bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ThiSinh> arrTS = new ArrayList<ThiSinh>();
        System.out.print("Nhap so luong thi sinh: "); int n = scan.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Nhap thong tin thi sinh thu "+i);
            ThiSinh ts = new ThiSinh();
            ts.nhap();
            arrTS.add(ts);
        }

        double maxSum = arrTS.get(0).sumDiem();
        for (int i=0; i<n; i++)
            if (arrTS.get(i).sumDiem() >= maxSum)
                maxSum = arrTS.get(i).sumDiem();


        for (int i=0; i<n; i++)
            if (arrTS.get(i).sumDiem() == maxSum){
                System.out.println("---------------------");
                arrTS.get(i).xuat();
            }

        Collections.sort(arrTS, ThiSinh::compareTo);
        for (int i=0; i<n; i++){
            System.out.println("Thi sinh thu "+i);
            arrTS.get(i).xuat();
        }
    }
}
