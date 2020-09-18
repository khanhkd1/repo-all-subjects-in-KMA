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


bool checkNT(int a, int i){
    if(a<=1)
        return false;
    else
        return (a == i)? true: ((a%i ==0)?0: checkNT(a, i+1));
}

void inNT(int a){
    if (a<2){
        printf("\n");
        return;
    }
    else if (checkNT(a, 2))
        printf("%d ", a);
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

int maxDay(int arr[nmax], int n, int m){
    int max = arr[0];
    if(m==0) return max;
    else{
        if (maxDay(arr, n, m-1) > max) {
            max = maxDay(arr, n, m-1);
        }
    }
    return max;
    
}

int main(int argc, const char * argv[]) {
    printf("%d\n", checkNT(9, 2));
    inNT(9);
    printf("%d\n", sumNT(9));
    int arr[nmax];
    nhapDay(arr, 3, 3);
    xuatDay(arr, 3, 3);
    printf("\n");
    printf("%d\n", sumDay(arr, 3, 3));
    printf("%d\n", tichDay(arr, 3, 3));
    printf("%d\n", maxDay(arr, 3, 3));
    return 0;
}
