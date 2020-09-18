//
//  main.c
//  bai2
//
//  Created by Kiều Duy Khánh on 7/13/20.
//  Copyright © 2020 Kiều Duy Khánh. All rights reserved.
//

#include <stdio.h>
#include <stdbool.h>
#define nmax 100

void nhapMaTran(int a[][nmax], int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            printf("Nhap phan tu a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }
}

void inMaTran(int a[][nmax], int n){
    printf("___________________\n");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++)
            printf("\t%d", a[i][j]);
        printf("\n");
    }
    printf("___________________\n");
}

void duongCheoChinh(int a[][nmax], int n){
    printf("___________________\n");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==j)
                printf("\t%d", a[i][j]);
            else
                printf("\t*");
        }
        printf("\n");
    }
    printf("___________________\n");
}

int phanTuMax(int a[][nmax], int n){
    int max = a[0][0];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(max<a[i][j])
                max = a[i][j];
        }
    }
    return max;
}

int phanTuMin(int a[][nmax], int n){
    int min = a[0][0];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(min > a[i][j])
                min = a[i][j];
        }
    }
    return min;
}

void sapxeptang(int a[],int n){
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++){
            if(a[i] > a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
}

void sapxeptheodong(int a[][nmax], int n){
    for(int i=0; i<n; i++)
        sapxeptang(a[i], n);
    inMaTran(a, n);
}

void sapxeptheocot(int mb[][nmax], int n){
   	for (int j=0;j<n;++j) {
		for (int i=0;i<n;++i) {
			for (int k=i+1;k<n;++k) {
				if (mb[i][j] > mb[k][j]) {
					int a = mb[i][j];
					mb[i][j] = mb[k][j];
					mb[k][j] = a;
				}
			}
		}
	}
	inMaTran(mb, n);
}

int phantuMax2(int a[][nmax], int n){
	int max = phanTuMax(a, n);
	int max2 = 0;
	for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
        	if(a[i][j] == max){
        		continue;
			}
            if(max2<a[i][j])
                max2 = a[i][j];
        }
    }
    return max2;
	
}

bool KTSNT(int x){
	if(x<2 || (x>2 && x%2 ==0))
		return false;
	for(int i=2; i<=x/2; i++)
		if(x%i==0)
			return false;
	return true;
}

int sumSNT(int a[][nmax], int n){
	int sum =0;
	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			if(KTSNT(a[i][j]))
				sum += a[i][j];
		}
	}
	return sum;
}

int main(int argc, const char * argv[]) {
    int a[nmax][nmax];
    char choose;
    int n = 0;
    
    while (true) {
    printf("\n");
    printf("********************************************************************\n");
    printf("**             CHUONG TRINH QUAN LY SINH VIEN                     **\n");
    printf("**    1.  Chon 1: Nhap ma tran                                    **\n");
    printf("**    2.  Chon 2: In phan tu tren duong cheo chinh                **\n");
    printf("**    3.  Chon 3: Tim phan tu lon nhat                            **\n");
    printf("**    4.  Chon 4: Tim phan tu nho nhat                            **\n");
    printf("**    5.  Chon 5: Sap xep phan tu tang theo hang                  **\n");
    printf("**    6.  Chon 6: Sap xep phan tu tang theo cot                   **\n");
    printf("**    7.  Chon 7: Tim phan tu lon thu 2                           **\n");
    printf("**    8.  Chon 8: Tinh tong so nguyen to trong mang               **\n");
    printf("**    9.  Chon i de in ma tran                                    **\n");
    printf("**    10. Chon 0 de thoat                                         **\n");
    printf("********************************************************************\n");
    printf("**               Nhap lua chon cua ban                            **\n");
        fflush(stdin); scanf("%c",&choose);
        switch (choose) {
            case '1':
                printf("Ban da chon chuc nang so 1\n");
                printf("Nhap vao kich thuoc ma tran vuong: \n"); scanf("%d", &n);
                nhapMaTran(a, n);
                continue;
            case '2':
                printf("Ban da chon chuc nang so 2\n");
                duongCheoChinh(a, n);
                continue;
            case '3':
                printf("Ban da chon chuc nang so 3\n");
                int max = phanTuMax(a, n);
                printf("Phan tu lon nhat la: %d\n", max);
                continue;
            case '4':
                printf("Ban da chon chuc nang so 4\n");
                int min = phanTuMin(a, n);
                printf("Phan tu nho nhat la: %d\n", min);
                continue;
            case '5':
                printf("Ban da chon chuc nang so 5\n");
                sapxeptheodong(a, n);
                continue;
            case '6':
                printf("Ban da chon chuc nang so 6\n");
                sapxeptheocot(a, n);
                continue;
            case '7':
                printf("Ban da chon chuc nang so 7\n");
                int max2 = phantuMax2(a, n);
                printf("Phan tu lon thu hai la: %d\n", max2);
                continue;
            case '8':
                printf("Ban da chon chuc nang so 8\n");
                printf("Tong so nguyen to trong ma tran la: %d\n", sumSNT(a, n));
                continue;
            case 'i':
                printf("Ban da chon chuc nang so in ma tran\n");
                inMaTran(a, n);
                continue;
            case '0':
                printf("Chuong trinh ket thuc\n");
                break;
            default:
                continue;
        }
        break;
    }
    return 0;
}
