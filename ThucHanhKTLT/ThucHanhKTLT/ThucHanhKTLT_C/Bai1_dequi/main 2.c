//
//  main.c
//  Bai1_dequi
//
//  Created by Kiều Duy Khánh on 7/29/20.
//  Copyright © 2020 Kiều Duy Khánh. All rights reserved.
//

#include <stdio.h>
#include <stdbool.h>
#define nmax 20

// i bat dau tu 2
bool checkNT(int a, int i){
    if(a<=1)
        return false;
    else
        return (a == i)? true: ((a%i ==0)?false: checkNT(a, i+1));
}

void inNT(int a){
    if (a<2){
        printf("\n");
        return;
    }
    else if (checkNT(a-1, 2))
        printf("%d ", a-1);
    inNT(a-1);
}

int sumNT(int a){
    int sum = 0;
    if (a<2) return sum;
    else{
        if (checkNT(a-1, 2)) {
            sum = a-1;
        }
    }
    return sum + sumNT(a-1);
}

void nhapDay(int arr[nmax], int n, int m){
    if (n <1 || m ==0) return;
    else{
        scanf("%d", &arr[n-m]);
        nhapDay(arr, n, m-1);
    }
}

void xuatDay(int arr[nmax], int n, int m){
    if (m == 0) return;
    else{
        printf("%d ", arr[n-m]);
        xuatDay(arr, n, m-1);
    }
}

int sumDay(int arr[nmax], int n, int m){
    int sum = 0;
    if (m == 0) return sum;
    else{
        sum = arr[n-m];
    }
    return sum + sumDay(arr, n, m-1);
}

int tichDay(int arr[nmax], int n, int m){
    int tich = 1;
    if (m == 0) return tich;
    else{
        tich = arr[n-m];
    }
    return tich * tichDay(arr, n, m-1);
}

int maxDay(int arr[nmax], int n){
    if( n ==1) return arr[n-1];
    else{
        if (arr[n-1] > maxDay(arr, n-1)) return arr[n-1];
        else return maxDay(arr, n-1);
    }
}

int minDay(int arr[nmax], int n){
    if( n == 1) return arr[n-1];
    else{
        if (arr[n-1] < minDay(arr, n-1)) return arr[n-1];
        else return minDay(arr, n-1);
    }
}

int demNT(int arr[nmax], int n){
    int dem = 0;
    if (n == 0) return dem;
    else{
        if (checkNT(arr[n-1], 2)) {
            dem++;
        }
    }
    return dem + demNT(arr, n-1);
}

void chuyenHe2(int n){
    if (n!=0) {
        chuyenHe2(n/2);
        printf("%d", (n%2));
    }
}

void chuyenHe8(int n){
    if (n!=0) {
        chuyenHe8(n/8);
        printf("%d", (n%8));
    }
}

void chuyenHe16(int n){
    if (n!=0) {
        chuyenHe16(n/16);
        if ((n%16)<10) printf("%d", (n%16));
        else if (n%16==10) printf("A");
        else if (n%16==11) printf("B");
        else if (n%16==12) printf("C");
        else if (n%16==13) printf("D");
        else if (n%16==14) printf("E");
        else if (n%16==15) printf("F");
    }
}

int main() {
    int so;
    printf("\n-------BAI-1--------\n");
    printf("Nhap so can check: "); scanf("%d", &so);
    printf("1-la ngto, 0-khong la ngto: %d\n", checkNT(so, 2));
    printf("Cac so ngto nho hon %d la: ", so); inNT(so);
    printf("Tong cac so ngto nho hon %d la: %d\n", so, sumNT(so));
    int arr[nmax];
    int n;
    printf("\n-------BAI-2--------\n");
    printf("Nhap so luong phan tu day: "); scanf("%d", &n);
    nhapDay(arr, n, n);
    xuatDay(arr, n, n);
    printf("\n");
    printf("tong day: %d\n", sumDay(arr, n, n));
    printf("tich day: %d\n", tichDay(arr, n, n));
    printf("max day: %d\n", maxDay(arr, n));
    printf("min day: %d\n", minDay(arr, n));
    printf("nto trong day: %d\n", demNT(arr, n));
    printf("\n");
    printf("\n-------BAI-3--------\n");
    printf("Nhap so muon chuyen: "); scanf("%d", &so);
    printf("Chuyen %d sang he 2: ", so);
    chuyenHe2(so);
    printf("\n");
    printf("Chuyen %d sang he 8: ", so);
    chuyenHe8(so);
    printf("\n");
    printf("Chuyen %d sang he 16: ", so);
    chuyenHe16(so);
    printf("\n");
    return 0;
}
