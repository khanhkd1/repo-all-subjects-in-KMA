//
//  main.c
//  bai5
//
//  Created by Kiều Duy Khánh on 7/17/20.
//  Copyright © 2020 Kiều Duy Khánh. All rights reserved.
//

#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>

struct NhanVien{
    char maNV[10], hoTen[30];
    int luong, phuCap;
    struct NhanVien *next;
};

typedef struct NhanVien *node;

node taoNode(char maNV[10], char hoTen[30], int luong, int phuCap){
    node temp;
    temp = (node)malloc(sizeof(struct NhanVien));
    temp->next = NULL;
    strcpy(temp->maNV, maNV);
    strcpy(temp->hoTen, hoTen);
    temp->luong = luong;
    temp->phuCap = phuCap;
    return temp;
}

node themDau(node head, char maNV[10], char hoTen[30], int luong, int phuCap){
    node dau = taoNode(maNV, hoTen, luong, phuCap);
    if(head == NULL)
        head = dau;
    else{
        dau->next = head;
        head = dau;
    }
    return head;
}

node themCuoi(node head, char maNV[10], char hoTen[30], int luong, int phuCap){
    node cuoi = taoNode(maNV, hoTen, luong, phuCap);
    if(head == NULL)
        head = cuoi;
    else{
        node p = head;
        while (p->next != NULL) {
            p = p->next;
        }
        p->next = cuoi;
    }
    return head;
}

node InitHead(){
    node head;
    head = NULL;
    return head;
}

node addNode(node head){
    if(head == NULL){
        head = InitHead();
    }
    int n, luong, phuCap;
    char maNV[10], hoTen[30];
    do{
        printf("\nNhap so luong nhan vien muon them: "); scanf("%d", &n);
    }while(n <= 0);
    for(int i = 0; i < n; i++){
        printf("\nNhap thong tin nhan vien.");
        printf("\nNhap ma nhan vien: "); fflush(stdin); fgets(maNV, 10, stdin);
        printf("Nhap ho ten nhan vien: "); fflush(stdin); fgets(hoTen, 30, stdin);
        printf("Nhap luong: "); scanf("%d", &luong);
        printf("Nhap phu cap: "); scanf("%d", &phuCap);
        head = themCuoi(head, maNV, hoTen, luong, phuCap);
    }
    return head;
}

void inDanhSach(node head){
    for(node p = head; p!=NULL; p = p->next){
        printf("\n\tMa Nhan Vien: %s", p->maNV);
        printf("\tHo Ten: %s", p->hoTen);
        printf("\tLuong: %d", p->luong);
        printf("\n\tPhu Cap: %d", p->phuCap);
        printf("\n\t-------------------");
    }
}

void timKiem(node head, char maNV[10]){
    for(node p = head; p != NULL; p = p->next){
        if(strcmp(p->maNV, maNV) == 0){
            printf("\n\tMa Nhan Vien: %s", p->maNV);
            printf("\tHo Ten: %s", p->hoTen);
            printf("\tLuong: %d", p->luong);
            printf("\n\tPhu Cap: %d", p->phuCap);
            printf("\n\t-------------------");
            return;
        }
    }
    printf("\nKhong co trong danh sach.");
}

int main(int argc, const char * argv[]) {
    char choose;
    node head = NULL;
    char maNV[10];
    while (true) {
        printf("\n");
        printf("\n********************************************************************");
        printf("\n**             CHUONG TRINH QUAN LY NHAN VIEN                     **");
        printf("\n**    1.  Chon 1: Khoi tao danh sach                              **");
        printf("\n**    2.  Chon 2: Nhap k sinh vien                                **");
        printf("\n**    3.  Chon 3: Hien thi danh sach nhan vien                    **");
        printf("\n**    4.  Chon 4: Tim kiem tuyen tinh theo ma nhan vien           **");
        printf("\n**    5.  Chon 5: Ket thuc                                        **");
        printf("\n********************************************************************");
        printf("\n**               Nhap lua chon cua ban                            **\n");
        fflush(stdin); scanf("%c", &choose);
        switch (choose) {
            case '1':
                head = NULL;
                continue;
            case '2':
                head = addNode(head);
                continue;
            case '3':
                inDanhSach(head);
                continue;
            case '4':
                printf("\nNhap ma nhan vien muon tim: "); fflush(stdin); fgets(maNV, 10, stdin);
                timKiem(head, maNV);
                continue;
            case '5':
                break;
            default:
                continue;
        }
        break;
    }

    return 0;
}
