//
//  main.c
//  bai3
//
//  Created by Kiều Duy Khánh on 7/14/20.
//  Copyright © 2020 Kiều Duy Khánh. All rights reserved.
//

#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>

struct Sach{
    int MaSach;
    char TenSach[100];
    char TacGia[100];
    int MaNXB;
    struct Sach *next;
};

typedef struct Sach *node; //Từ giờ dùng kiểu dữ liệu LinkedList có thể thay bằng node cho ngắn gọn

//tao node
node CreateNode(int MaSach, char TenSach[100], char TacGia[100], int MaNXB){
    node temp; // declare a node
    temp = (node)malloc(sizeof(struct Sach)); // Cấp phát vùng nhớ dùng malloc()
    temp->next = NULL;// Cho next trỏ tới NULL
    // Gán giá trị cho Node
    temp->MaSach = MaSach;
    strcpy(temp->TenSach, TenSach);
    strcpy(temp->TacGia, TacGia);
    temp->MaNXB = MaNXB;
    return temp;//Trả về node mới đã có giá trị
}

//them dau
node AddHead(node head, int MaSach, char TenSach[100], char TacGia[100], int MaNXB){
    node temp = CreateNode(MaSach, TenSach, TacGia, MaNXB); // Khởi tạo node temp với data = value
    if(head == NULL){
        head = temp; // //Nếu linked list đang trống thì Node temp là head luôn
    }else{
        temp->next = head; // Trỏ next của temp = head hiện tại
        head = temp; // Đổi head hiện tại = temp(Vì temp bây giờ là head mới mà)
    }
    return head;
}

//them cuoi
node AddTail(node head, int MaSach, char TenSach[100], char TacGia[100], int MaNXB){
    node temp, p;// Khai báo 2 node tạm temp và p
    temp = CreateNode(MaSach, TenSach, TacGia, MaNXB);//Gọi hàm createNode để khởi tạo node temp có next trỏ tới NULL và giá trị là value
    if(head == NULL){
        head = temp;     //Nếu linked list đang trống thì Node temp là head luôn
    }
    else{
        p = head;// Khởi tạo p trỏ tới head
        while(p->next != NULL){
            p = p->next;//Duyệt danh sách liên kết đến cuối. Node cuối là node có next = NULL
        }
        p->next = temp;//Gán next của thằng cuối = temp. Khi đó temp sẽ là thằng cuối(temp->next = NULL mà)
    }
    return head;
}

//duyet all phan tu
void Traverser(node head){
    printf("\n");
    for(node p = head; p != NULL; p = p->next){
        printf("\n\tMa Sach: %d", p->MaSach);
        printf("\n\tTen Sach: %s", p->TenSach);
        printf("\n\tTac Gia: %s", p->TacGia);
        printf("\n\tMa NXB: %d", p->MaNXB);
        printf("\n_________________");
    }
}

void TraverserNXB(node head, int MaNXB){
    printf("\n");
    for(node p = head; p != NULL; p = p->next){
        if(p->MaNXB == MaNXB){
            printf("\n\tMa Sach: %d\n", p->MaSach);
            printf("\n\tTen Sach: %s", p->TenSach);
            printf("\n\tTac Gia: %s", p->TacGia);
            printf("\n\tMa NXB: %d", p->MaNXB);
            printf("\n_________________");
        }
        else continue;
    }
}

void TraverserMaSach(node head, int MaSach){
    printf("\n");
    for(node p = head; p != NULL; p = p->next){
        if(p->MaSach == MaSach){
            printf("\n\tMa Sach: %d\n", p->MaSach);
            printf("\n\tTen Sach: %s", p->TenSach);
            printf("\n\tTac Gia: %s", p->TacGia);
            printf("\n\tMa NXB: %d", p->MaNXB);
            printf("\n_________________");
            return;
        }
        else continue;
    }
}

//khoi tao node head
node InitHead(){
    node head;
    head = NULL;
    return head;
}

//nhap dslk
node Input(){
    node head = InitHead();
    int n, MaSach, MaNXB;
    char TenSach[100], TacGia[100];
    do{
        printf("\nNhap so luong sach muon them: "); scanf("%d", &n);
    }while(n <= 0);
 
    for(int i = 0; i < n; ++i){
        printf("\nNhap sach thu %d", i);
        printf("\n\tNhap Ma Sach: "); scanf("%d", &MaSach);
        printf("\n\tNhap Ten Sach: "); fflush(stdin); fgets(TenSach, 100, stdin);
        printf("\n\tNhap Tac Gia: "); fflush(stdin); fgets(TacGia, 100, stdin);
        fflush(stdin);
        printf("\n\tNhap Ma NXB: "); scanf("%d", &MaNXB);
        head = AddTail(head, MaSach, TenSach, TacGia, MaNXB);
    }
    return head;
}

int main(int argc, const char * argv[]) {
    // insert code here...
    node head = NULL;
    int MaSach, MaNXB;
    bool daNhap = false;
    char choose;
    while(true){
        printf("\n");
        printf("\n********************************************************************");
        printf("\n**             CHUONG TRINH QUAN LY SACH                          **");
        printf("\n**    1.  Chon 1: Them sach                                       **");
        printf("\n**    2.  Chon 2: Hien thi tat ca cac sach                        **");
        printf("\n**    3.  Chon 3: Hien thi sach cua NXB                           **");
        printf("\n**    4.  Chon 4: Tim sach theo ma sach                           **");
        printf("\n**    5.  Chon 5: Sap xep sach theo chieu tang cua ma sach        **");
        printf("\n**    6.  Chon 6: Thoat chuong trinh                              **");
        printf("\n********************************************************************");
        printf("\n**               Nhap lua chon cua ban                          **\n");
        fflush(stdin); scanf("%c",&choose);
        switch (choose) {
            case '1':
                printf("\nBan da chon chuc nang so 1");
                if(!daNhap){
                    head = Input();
                    daNhap = true;
                }
                else{
                    printf("\n\tNhap Ma Sach: "); scanf("%d", &MaSach);
                    printf("\n\tNhap Ten Sach: "); char TenSach[100]; fflush(stdin); fgets(TenSach, 100, stdin);
                    printf("\n\tNhap Tac Gia: "); char TacGia[100]; fflush(stdin); fgets(TacGia, 100, stdin); fflush(stdin);
                    printf("\n\tNhap Ma NXB: "); scanf("%d", &MaNXB);
                    head = AddTail(head, MaSach, TenSach, TacGia, MaNXB);
                }
                continue;
            case '2':
                printf("\nBan da chon chuc nang so 2");
                if(head == NULL)
                    printf("\nChua co sach nao duoc nhap");
                else
                    Traverser(head);
                continue;
            case '3':
                printf("\nBan da chon chuc nang so 3");
                printf("\nNhap Ma NXB: "); scanf("%d", &MaNXB);
                TraverserNXB(head, MaNXB);
                continue;
            case '4':
                printf("\nBan da chon chuc nang so 4");
                printf("\nNhap Ma Sach: "); scanf("%d", &MaSach);
                TraverserMaSach(head, MaSach);
                continue;
            case '5':
                printf("\nBan da chon chuc nang so 5");
                printf("\nDang nghi");
                continue;
            case '6':
                printf("\nThoat chuong trinh.\n");
                break;
            default:
                continue;
        }
        break;
    }
    return 0;
}
