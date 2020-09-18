//
//  main.c
//  bai4
//
//  Created by Kiều Duy Khánh on 7/15/20.
//  Copyright © 2020 Kiều Duy Khánh. All rights reserved.
//

#include <stdio.h>
#include <math.h>
#include <stdbool.h>

void chucnang1(){
    printf("\nNhap vao n: "); int n; scanf("%d", &n);
    float sum = 0;
    for(int i=1; i<=n; i++){
        sum += pow((i-5), 2);
    }
    printf("\n%.2f", sum);
}


void chucnang2(){
    printf("\nNhap vao n: "); int n; scanf("%d", &n);
    float sum = 0;
    for(int i=1; i<=n; i++){
        sum += pow(cos(i), 2);
    }
    printf("\n%.2f", sum);
}

void chucnang3(){
    printf("\nNhap vao n: "); int n; scanf("%d", &n);
    float sum = 0;
    for(int i=1; i<=n; i++){
        sum += pow(sin(i), 2);
    }
    printf("\n%.2f", sum);
}


int main(){
    char choose;
    while(true){
        printf("\nChon 1 de tinh tong: (x-5)*(x-5), x tu 1 -> n.");
        printf("\nChon 2 de tinh tong: cos(x)*cos(x), x tu 1 -> n.");
        printf("\nChon 3 de tinh tong: sin(x)*sin(x), x tu 1 -> n.");
        printf("\nChon 4 de thoat.");
        printf("\n________________________________________________");
        printf("\nNhap lua chon: "); fflush(stdin); scanf("%c", &choose);
        switch(choose){
            case '1':
                printf("\nBan da chon chuc nang 1.");
                chucnang1();
                continue;
            case '2':
                printf("\nBan da chon chuc nang 2.");
                chucnang2();
                continue;
            case '3':
                printf("\nBan da chon chuc nang 3.");
                chucnang3();
                continue;
            case '4':
                printf("\nChuong trinh ket thuc.");
                break;
            default:
                continue;
        }
        break;
    }
    return 0;
}
