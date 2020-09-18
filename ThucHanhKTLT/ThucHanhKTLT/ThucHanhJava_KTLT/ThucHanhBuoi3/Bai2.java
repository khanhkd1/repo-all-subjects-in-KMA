package ThucHanhBuoi3;

import java.util.Scanner;

public class Bai2 {
    public static boolean checkNT(int x){
        if(x<2) return false;
        else if(x>2 && x%2==0) return false;
        else {
            for(int i=3; i< (x/2); i++)
                if(x%i ==0) return false;
        }
        return true;
    }

    public static void inNT(int n){
        System.out.print("Cac so nguyen to nho hon n la: ");
        for(int i=0; i<n; i++)
            if (checkNT(i))
                System.out.print(i+" ");
        System.out.println();
    }

    public static int sumNT(int n){
        int sum = 0;
        for (int i=0; i<n; i++)
            if (checkNT(i)) sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: "); int n = scan.nextInt();
        inNT(n);
        System.out.println("Tong cac so nguyen to nho hon n la: "+sumNT(n));
    }
}
