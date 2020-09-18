import java.util.Scanner;

public class testDeQui {

    
    
    static void nhap(int arr[], int n, int i){
        if(i == 0)
            return;
        else {
            Scanner scan = new Scanner(System.in);
            System.out.print("Nhap phan tu thu "+(n-i)+": ");
            arr[n-i] = scan.nextInt();
            nhap(arr, n, i-1);
        }
    }

    static void xuat(int arr[], int n, int i){
        if(i == 0)
            return;
        else {
            System.out.println("Phan tu thu "+(n-i)+": "+arr[n-i]);
            xuat(arr, n, i-1);
        }
    }

    static int minDay(int arr[], int n, int i){
        int min = arr[n-i];
        if(i == 1) return min;
        else if (minDay(arr, n, i-1) < min)
            min = minDay(arr, n, i-1);
        return min;
    }

    static int tichDay(int arr[], int n, int i){
        int tich = 1;
        if (i == 0) return tich;
        else tich = arr[n-i];
        return tich * tichDay(arr, n, i-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: "); int n = scan.nextInt();
        int arr[] = new int[n];
        nhap(arr, n, n);
        xuat(arr, n, n);
        System.out.println("Min: "+minDay(arr, n, n));
        System.out.println("Tich: "+tichDay(arr, n, n));
    }
}
