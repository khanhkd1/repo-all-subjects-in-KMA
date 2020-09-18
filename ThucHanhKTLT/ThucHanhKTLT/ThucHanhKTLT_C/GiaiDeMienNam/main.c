#include <stdio.h>
#include <string.h>
#include <stdbool.h>

struct NhanVien{
    char MaNV[10];
    char HoTen[45];
    double luong;
    struct NhanVien *next;
};

typedef struct NhanVien *node;

node createNode(char MaNV[10], char HoTen[45], double luong){
    node temp;
    temp = (node)malloc(sizeof(struct NhanVien));
    temp->next = NULL;
    strcpy(temp->MaNV, MaNV);
    strcpy(temp->HoTen, HoTen);
    temp->luong = luong;
    return temp;
}

node addTail(node head, char MaNV[10], char HoTen[45], double luong){
    node temp, p;
    temp = createNode(MaNV, HoTen, luong);
    if (head == NULL) {
        head = temp;
    }
    else{
        p = head;
        while (p->next!=NULL) {
            p = p->next;
        }
        p->next = temp;
    }
    return head;
}

void inDanhSach(node head){
    for(node p = head; p != NULL; p = p->next){
        printf("-----------------------------\n");
        printf("\tMa NV: %s", p->MaNV);
        printf("\tHo Ten: %s", p->HoTen);
        printf("\tLuong: %.2f\n", p->luong);
    }
}

node nodeCuoi(node head){
    if (head == NULL) {
        return head;
    }else{
        node cuoi;
        for (node p = head; ; p = p->next) {
            if (p->next == NULL) {
                cuoi = p;
                break;
            }
        }
        return cuoi;
    }
}

node sapXep(node head){
    for (node p=head; p != nodeCuoi(head); p = p->next) {
        for (node k = p->next; k!=NULL; k = k->next) {
            if (strcmp(p->MaNV, k->MaNV) > 0) {
                char MaNV[10], HoTen[45];
                strcpy(MaNV, k->MaNV);
                strcpy(HoTen, k->HoTen);
                double luong = k->luong;
                strcpy(k->MaNV, p->MaNV);
                strcpy(k->HoTen, p->HoTen);
                k->luong = p->luong;
                strcpy(p->MaNV, MaNV);
                strcpy(p->HoTen, HoTen);
                p->luong = luong;
            }
        }
    }
    return head;
}

node nhapDS(){
    node head = NULL;
    int n;
    char MaNV[10], HoTen[45];
    double luong;
    do {
        printf("Nhap so luong NV muon them: "); scanf("%d", &n);
    } while (n<=0);
    
    for(int i=0; i<n; i++){
        printf("-----------------------------\n");
        printf("\tNhap ma NV: "); fflush(stdin); fgets(MaNV, 10, stdin);
        printf("\tNhap ho ten: "); fflush(stdin); fgets(HoTen, 45, stdin);
        fflush(stdin);
        printf("\tNhap luong: "); scanf("%lf", &luong);
        head = addTail(head, MaNV, HoTen, luong);
    }
    return head;
}

int main(int argc, const char * argv[]) {
    node head = NULL;
    bool daNhap = false;
    int choose;
    while (true) {
        printf("*------------------------*\n");
        printf("1. Nhap danh sach\n");
        printf("2. In danh sach\n");
        printf("3. Sap xep theo ma nv\n");
        printf("4. Exit\n");
        printf("Nhap chuc nang: "); scanf("%d", &choose);
        switch (choose) {
            case 1:
                if (daNhap) {
                    char MaNV[10], HoTen[45];
                    double luong;
                    printf("Nhap ma nv: "); fflush(stdin); fgets(MaNV, 10, stdin);
                    printf("Nhap ho ten: "); fflush(stdin); fgets(HoTen, 45, stdin);
                    fflush(stdin);
                    printf("Nhap luong: "); scanf("%lf", &luong);
                    head = addTail(head, MaNV, HoTen, luong);
                }else{
                    head = nhapDS();
                    daNhap = true;
                }
                continue;
            case 2:
                inDanhSach(head);
                continue;
            case 3:
                head = sapXep(head);
                printf("Da sap xep, chon 2 de in ra danh sach");
                continue;
            case 4:
                break;
            default:
                continue;
        }
        break;
    }
    return 0;
}
