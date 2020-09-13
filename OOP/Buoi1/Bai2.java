package OOP.Buoi1;

import java.util.Scanner;

public class Bai2 {
    static boolean checkNT(int n){
        if (n<=1) return false;
        else if (n != 2 && n%2==0) return false;
        else {
            for (int i = 2; i<=n/2; i++)
                if (n%i==0) return false;
            return true;
        }
    }

    static void inNT(int n){
        System.out.print("\tCac so nguyen to nho hon "+n+" la: ");
        for (int i=0; i<n; i++)
            if (checkNT(i))
                System.out.print(i+" ");
    }

    static boolean checkSHH(int n){
        int sum = 0;
        for (int i=1; i<= n/2; i++)
            if (n%i==0) sum+=i;
        if (sum==n) return true;
        else return false;
    }

    static void inSHH(int n){
        System.out.print("\tSo hoan hao nho hon "+n+" la: ");
        for (int i=1; i<n; i++)
            if (checkSHH(i))
                System.out.print(i+" ");
    }

    static int UCLN(int a, int b){
        while (a*b !=0){
            if (a > b)
                a -= b;
            else b -= a;
        }
        return a + b;
    }

    static void psToiGian(int a, int b){
        int n = UCLN(Math.abs(a), Math.abs(b));
        if (a*b>0)
            System.out.println("\tPhan so toi gian la: "+Math.abs(a/n)+"/"+Math.abs(b/n));
        else System.out.println("\tPhan so toi gian la: -"+Math.abs(a/n)+"/"+Math.abs(b/n));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, a, b;
        while (true){
            System.out.println("1. Kiem tra so nguyen to.");
            System.out.println("2. In cac so nguyen to nho hon n.");
            System.out.println("3. Kiem tra so hoan hao.");
            System.out.println("4. In cac so hoan hao nho hon n.");
            System.out.println("5. Tim UCLN cua 2 so nguyen duong.");
            System.out.println("6. Rut gon phan so.");
            System.out.println("7. Exit");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("\tNhap n: "); n = scan.nextInt();
                    if (checkNT(n)) System.out.println("\t"+n+" la so nguyen to.");
                    else System.out.println("\t"+n+" khong la so nguyen to.");
                    continue;
                case 2:
                    System.out.print("\tNhap n: "); n = scan.nextInt();
                    inNT(n);
                    continue;
                case 3:
                    System.out.print("\tNhap n: "); n = scan.nextInt();
                    if (checkSHH(n)) System.out.println("\t"+n+" la so hoan hao.");
                    else System.out.println("\t"+n+" khong la so hoan hao.");
                    continue;
                case 4:
                    System.out.print("\tNhap n: "); n = scan.nextInt();
                    inSHH(n);
                    continue;
                case 5:
                    System.out.print("\tNhap a: "); a = scan.nextInt();
                    System.out.print("\tNhap b: "); b = scan.nextInt();
                    System.out.println("\tUCLN cua a va b la: "+UCLN(a,b));
                    continue;
                case 6:
                    System.out.print("\tNhap tu so: "); a = scan.nextInt();
                    do {
                        System.out.print("\tNhap mau so: "); b = scan.nextInt();
                    }while (b==0);
                    psToiGian(a, b);
                    continue;
                case 7:
                    break;
            }
            break;
        }
    }
}
