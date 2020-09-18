package ThucHanhBuoi3;

import java.util.Scanner;

public class Bai1 {
    public static int sumGT(int n){
        int sum = 0, temp=1;
        for (int i=1; i<=n; i++){
            temp *= i;
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao n: "); int n = scan.nextInt();
        System.out.print("Tong giai thua tu 1 den n la: "+sumGT(n));
    }
}
