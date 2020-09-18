package ThucHanhBuoi3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.*;

public class Bai3 {
    public static void nhapMang(Integer[] arr, int n){
        Random rand = new Random();
        for(int i=0; i<n; i++){
            arr[i] = rand.nextInt(50);
        }
    }

    public static void xuatMang(Integer[] arr){
        for (int i=0; i< arr.length; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    public static int Max(Integer[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static int Min(Integer[] arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static boolean checkNT(int x){
        if(x<2) return false;
        else if(x>2 && x%2==0) return false;
        else {
            for(int i=3; i< (x/2); i++)
                if(x%i ==0) return false;
        }
        return true;
    }

    public static int sumNT(Integer[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++)
            if (checkNT(arr[i]))
                sum+=arr[i];
        return sum;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu cua mang: "); int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        nhapMang(arr ,n);
        System.out.print("\tCac phan tu trong mang: ");
        xuatMang(arr);
        System.out.println("\tPhan tu lon nhat trong mang: "+Max(arr));
        System.out.println("\tPhan tu nho nhat trong mang: "+Min(arr));
        Arrays.sort(arr);
        System.out.print("\tMang theo chieu tang dan: ");
        xuatMang(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("\tMang theo chieu giam dan: ");
        xuatMang(arr);
        int[] intArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        int sum = IntStream.of(intArray).sum();
        System.out.println("\tTong cac phan tu trong mang la: "+sum);
        System.out.println("\tTong cac so nguyen to co trong mang la: "+sumNT(arr));
    }
}
