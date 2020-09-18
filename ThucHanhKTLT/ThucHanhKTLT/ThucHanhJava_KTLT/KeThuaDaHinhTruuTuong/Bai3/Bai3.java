package KeThuaDaHinhTruuTuong.Bai3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static int[] Nhap(int soDau,int n){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[n];
        arr[0] = soDau;
        for (int i=1; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static double[] Nhap(double soDau, int n){
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[n];
        arr[0] = soDau;
        for (int i=1; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            arr[i] = scan.nextDouble();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Object[] arr = new Object[20];
        double[] arr = new double[20];
        
        System.out.print("Nhap so luong phan tu: "); int n = scan.nextInt();
        System.out.print("Nhap phan tu thu 1: "); double sodau = scan.nextDouble();
        if ((sodau - (int)sodau) == 0){
            sodau = (int)sodau;
//            int arr = new int[20];
        }
        arr = Nhap(sodau, n);

    }
}
