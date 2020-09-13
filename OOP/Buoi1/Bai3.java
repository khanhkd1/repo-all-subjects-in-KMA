package OOP.Buoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    static void inputArr(int arr[]){
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.print("Nhap phan tu thu "+i+": "); arr[i] = scan.nextInt();
        }
    }

    static void outputArr(int arr[]){
        for (int i=0; i<arr.length; i++)
            System.out.print(" "+arr[i]+" ");
    }

    static int[] sortArr(int arr[]){
        for (int i=0; i<arr.length; i++)
            for (int j = i+1; j<arr.length; j++)
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
        return arr;
    }

    static int fMax(int arr[]){
        int max = arr[0];
        for (int i=0; i<arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    static int sMax(int arr[]){
        int fMax = fMax(arr);
        int sMax = arr[0];
        for (int i=0; i<arr.length; i++)
            if (arr[i] > sMax && arr[i] < fMax)
                sMax = arr[i];
        return sMax;
    }

    static int[] indexFMaxSMax(int arr[], int fMaxsMax){
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++)
            if (arr[i] == fMaxsMax)
                index.add(i);
        int[] indexx = new int[index.size()];
        for (int i=0; i<index.size(); i++)
            indexx[i] = index.get(i);
        return indexx;
    }

    static int[] addPhantu(int arr[], int n){
        ArrayList<Integer> arrs = new ArrayList<>();
        for (int i : arr)
            arrs.add(i);
        arrs.add(n);
        int[] indexx = new int[arrs.size()];
        for (int i=0; i<arrs.size(); i++)
            indexx[i] = arrs.get(i);
        return sortArr(indexx);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[0];
        while (true){
            System.out.println("\n1. Nhap phan tu cua mang.");
            System.out.println("2. In mang");
            System.out.println("3. Sap xep mang theo thu tu tang dan.");
            System.out.println("4. Tim phan tu lon nhat, lon thu 2 va chi so cua chung.");
            System.out.println("5. Them phan tu vao mang.");
            System.out.println("6. Exit");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("\tNhap so luong phan tu cua mang: "); int n = scan.nextInt();
                    arr = new int[n];
                    inputArr(arr);
                    continue;
                case 2:
                    System.out.print("\tCac phan tu cua mang: ");
                    outputArr(arr);
                    continue;
                case 3:
                    arr = sortArr(arr);
                    outputArr(arr);
                    continue;
                case 4:
                    System.out.print("\tFirst Max: "+fMax(arr)+", index trong mang: "); outputArr(indexFMaxSMax(arr, fMax(arr)));
                    System.out.print("\n\tSecond Max: "+sMax(arr)+", index trong mang: "); outputArr(indexFMaxSMax(arr, sMax(arr)));
                    continue;
                case 5:
                    System.out.print("\tNhap phan tu can them: "); int a = scan.nextInt();
                    arr = addPhantu(arr, a);
                    System.out.print("\tDa them phan tu vao mang: ");
                    outputArr(arr);
                    continue;
                case 6:
                    break;
            }
            break;
        }
    }
}
