//
//  main.c
//  bai1
//
//  Created by Kiều Duy Khánh on 7/13/20.
//  Copyright © 2020 Kiều Duy Khánh. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#define nmax 100


typedef struct
{
    char MaSV[10];
    char HoTen[30];
    int Toan;
    int Ly;
    int Hoa;
    float dTB;
} SinhVien;
void tinhDTB(SinhVien *sv){
    sv->dTB = (sv->Toan + sv->Ly + sv->Hoa)/3.0;
}

void khoiTao(int *count, bool *khoitao){
    if(*khoitao){
        printf("\nDanh sach da duoc khoi tao, ban co muon clear khong? (c/k): ");
        char choose; fflush(stdin); scanf("%c", &choose);
        switch (choose) {
            case 'c':
                *count = 0;
                *khoitao = false;
                printf("\nDa clear xong.");
                break;
            case 'k':
                return;
            default:
                break;
        }
    }else{
        *count = 0;
        *khoitao = true;
        printf("\nDa khoi tao xong.");
    }
}

void nhap(SinhVien *sv){
    printf("\nNhap ma sv: "); fflush(stdin); fgets(sv->MaSV, sizeof(sv->MaSV), stdin);
    printf("Nhap ten: "); fflush(stdin); fgets(sv->HoTen, sizeof(sv->HoTen), stdin);
    printf("Nhap diem mon toan: "); scanf("%d", &sv->Toan);
    printf("Nhap diem mon ly: "); scanf("%d", &sv->Ly);
    printf("Nhap diem mon hoa: "); scanf("%d", &sv->Hoa);
    tinhDTB(sv);
}

void nhapK(SinhVien a[], int *count){
    printf("\n____________________________________\n");
    int k;
    do{
        printf("Nhap vao k sinh vien: "); scanf("%d", &k);
    }while ((*count+k) > nmax);
    
    for(int i = 0; i< k; i++){
        printf("\nNhap SV thu %d:", (*count)+i);
        nhap(&a[(*count)+i]);
    }
    *count += k;
    printf("\n____________________________________\n");
}

void xuat(SinhVien sv){
    printf("\nMa sv: %s", sv.MaSV);
    printf("Ho ten SV: %s", sv.HoTen);
    printf("Diem Toan - Ly - Hoa: %d - %d - %d\n", sv.Toan, sv.Ly, sv.Hoa);
    printf("Diem trung binh: %.2f", sv.dTB);
    printf("\n______________________________________\n");
}

void xuatN(SinhVien a[], int *count){
    printf("\n____________________________________\n");
    printf("\nDanh sach sinh vien");
    for(int i = 0;i < *count; i++){
        printf("\nThong tin SV thu %d:", i);
        xuat(a[i]);
    }
    printf("\n____________________________________\n");
}

void sapxep(SinhVien a[], int count){
    //Sap xep theo DTB tang dan
    SinhVien tmp;
    for(int i = 0;i < count;i++){
        for(int j = i+1; j < count;j++){
            if(a[i].dTB > a[j].dTB){
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
    }
    printf("Da sap xep theo diem trung binh tang dan");
}

int TimKiemTuyenTinh(SinhVien a[], int count, char ten[])
{
    for (int i = 0; i < count; i++)
        if (strcmp(a[i].HoTen, ten) == 0)
            return i;
    return -1;
}


int binarySearch(SinhVien a[], int dau, int cuoi, float x) {
  if (cuoi >= dau) {
    int mid = (dau + cuoi)/ 2;
      if (a[mid].dTB == x)
          return mid;
      if (a[mid].dTB > x)
          return binarySearch(a, dau, mid - 1, x);
    return binarySearch(a, mid + 1, cuoi, x);
  }
  return -1;
}

void xoaSinhVien(SinhVien a[], int *count, char maSV[]){
    int vitri = -1;
    for(int i=0; i< *count; i++){
        if(strcmp(a[i].MaSV, maSV) == 0)
            vitri = i;
    }
    if(vitri == -1){
        printf("Khong co ma sinh vien %s trong danh sach\n", maSV);
        return;
    }
    for(int i=vitri; i<*count-1; i++){
        a[i] = a[i+1];
    }
    *count -=1;
    printf("Xoa thanh cong");
}

void luuFile(SinhVien a[], int count){
    FILE *fptr;
    fptr = fopen("/Users/khanhkd/Desktop/ThucHanhKTLT/bai1/bai.txt","a");
    if(fptr == NULL)
      {
         printf("Error!");
         exit(1);
      }
    for(int i=0; i<count; i++){
        fprintf(fptr,"Thong tin SV thu %d:\n",i);
        fprintf(fptr, "Ma SV: %s\n", a[i].MaSV);
        fprintf(fptr, "Ho ten: %s\n", a[i].HoTen);
        fprintf(fptr, "Diem Toan: %d\n", a[i].Toan);
        fprintf(fptr, "Diem ly: %d\n", a[i].Ly);
        fprintf(fptr, "Diem Hoa: %d\n", a[i].Hoa);
        fprintf(fptr, "Diem Trung Binh: %.2f\n", a[i].dTB);
        fprintf(fptr, "___________________________\n");
    }
    fclose(fptr);
}

void docFile(){
    char *line_buf = NULL;
    size_t line_buf_size = 0;
    int line_count = 0;
    ssize_t line_size;
    FILE *fp = fopen("/Users/khanhkd/Desktop/ThucHanhKTLT/bai1/bai.txt", "r");
    if (!fp)
    {
      fprintf(stderr, "Lỗi đọc file\n");
        exit(1);
    }
    line_size = getline(&line_buf, &line_buf_size, fp);
    while (line_size >= 0)
    {
      line_count++;
      printf("%s", line_buf);
      line_size = getline(&line_buf, &line_buf_size, fp);
    }
    free(line_buf);
    line_buf = NULL;
    fclose(fp);
}

int main(int argc, const char * argv[]) {
    SinhVien a[nmax];
    bool khoitao = false;
    int count = 0;
    char choose;
    bool sapXep = false;
    bool luufile = true;
    while (true) {
        printf("\n");
        printf("********************************************************************\n");
        printf("**             CHUONG TRINH QUAN LY SINH VIEN                     **\n");
        printf("**    0.  Chon 0: Khoi tao danh sach                              **\n");
        printf("**    1.  Chon 1: Nhap k sinh vien                                **\n");
        printf("**    2.  Chon 2: In danh sach sinh vien                          **\n");
        printf("**    3.  Chon 3: Sap xep sinh vien theo DTB                      **\n");
        printf("**    4.  Chon 4: Kiem tra danh sach da sap xep chua              **\n");
        printf("**    5.  Chon 5: Tim kiem tuyen tinh theo ho ten                 **\n");
        printf("**    6.  Chon 6: Tim kiem nhi phan theo dTB                      **\n");
        printf("**    7.  Chon 7: Xoa sinh vien theo ma sinh vien                 **\n");
        printf("**    8.  Chon 8: Them sinh vien va dam bao tinh sap xep          **\n");
        printf("**    9.  Chon s de luu danh sach sinh vien ra file               **\n");
        printf("**    10. Chon l de hien thi danh sach sinh vien tu file          **\n");
        printf("**    11. Chon Z de thoat                                         **\n");
        printf("********************************************************************\n");
        printf("**               Nhap lua chon cua ban                            **\n");
        fflush(stdin); scanf("%c",&choose);
        switch (choose) {
            case '0':
                printf("Ban da chon chuc nang so 0");
                khoiTao(&count, &khoitao);
                continue;
            case '1':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 1");
                nhapK(a, &count);
                luufile = false;
                continue;
            case '2':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 2");
                xuatN(a, &count);
                continue;
            case '3':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 3\n");
                sapxep(a, count);
                sapXep = true;
                continue;
            case '4':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 4\n");
                if(sapXep == true)
                    printf("\nDanh sach da duoc sap xep\n");
                else
                    printf("\nDanh sach chua duoc sap xep, chon chuc nang so 3 de sap xep\n");
                continue;
            case '5':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 5\n");
                char ten[45];
                printf("\nNhap vao ho ten sinh vien muon tim: "); fflush(stdin); fgets(ten, 45, stdin);
                int tim = TimKiemTuyenTinh(a, count, ten);
                if(tim == -1) printf("Khong tim thay trong danh sach\n");
                else xuat(a[tim]);
                continue;
            case '6':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 6\n");
                if(sapXep){
                    float x;
                    printf("Nhap vao diem trung binh muon tim (2 vi tri sau day phay): "); scanf("%f", &x);
                    int vitri = binarySearch(a, 0, count, x);
                    if(vitri == -1) printf("Khong co trong danh sach\n");
                    else xuat(a[vitri]);
                }
                else
                    printf("Ban can sap xep truoc khi dung chuc nang nay");
                continue;
            case '7':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 7\n");
                printf("Nhap vao ma sinh vien muon xoa: "); char maSV[10]; fflush(stdin); fgets(maSV, 10, stdin);
                xoaSinhVien(a, &count, maSV);
                continue;
            case '8':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 8\n");
                nhap(&a[count]);
                count++;
                sapxep(a, count);
                continue;
            case 's':
                if(!khoitao) continue;
                printf("Ban da chon chuc nang so 9\n");
                if(!luufile)
                    luuFile(a, count);
                printf("Luu file thanh cong\n");
                luufile = true;
                continue;
            case 'l':
                printf("Ban da chon chuc nang so 10\n");
                docFile();
                continue;
            case 'Z':
                printf("Chuong trinh ket thuc\n");
                break;
            default:
                continue;
        }
        break;
    }
    return 0;
}

