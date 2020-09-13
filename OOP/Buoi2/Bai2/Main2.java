package OOP.Buoi2.Bai2;

public class Main2 {
    static void printArrSV(SinhVien arrSV[]){
        System.out.println("Ma SV\tHo Ten\tDiem lT\tDiemTH\tDiemTB");
        for (int i=0; i<arrSV.length; i++)
            System.out.println(arrSV[i].toString());
    }
    public static void main(String[] args) {
        SinhVien[] arrSV = new SinhVien[3];
        arrSV[0] = new SinhVien("at150328", "Kieu Duy Khanh", 7.2, 7.4);
        arrSV[1] = new SinhVien("at150329", "Nguyen Quang Thanh", 7.2, 7.4);
        arrSV[2] = new SinhVien("at150330", "Nguyen Thi Thuy Linh", 7.2, 7.4);
        printArrSV(arrSV);
    }
}
