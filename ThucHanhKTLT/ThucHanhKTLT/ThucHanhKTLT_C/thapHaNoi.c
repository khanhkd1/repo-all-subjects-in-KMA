#include <stdio.h>

void thapHN(int n, char thap1[], char thap2[], char thap3[]){
    if(n==1)
        printf("Chuyển từ %s sang %s\n", thap1, thap3);
    else{
        thapHN(n-1, thap1, thap3, thap2);
        printf("Chuyển từ %s sang %s\n", thap1, thap3);
        thapHN(n-1, thap2, thap1, thap3);
    }
}
 
int timKiem(int k, int mang[], int dau, int cuoi){
    if(dau>cuoi) return -1;
    int giua = (dau+cuoi)/2;
    if (k == mang[giua]) return giua;
    else if (k>mang[giua]) return timKiem(k, mang, giua+1, cuoi);
    else return timKiem(k, mang, dau, giua-1);
    
}

int main(int argc, const char * argv[]) {
    // insert code here...
    int n;
    printf("Nhap vao so vong: "); scanf("%d", &n);
    thapHN(n, "Cột A", "Cột B", "Cột C");
//    int a[] = {1,2,3,4,5,6,7};
//    printf("%d",timKiem(3, a, 0, 6));
    
    return 0;
}
