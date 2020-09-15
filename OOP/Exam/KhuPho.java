package OOP.Buoi2.Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private int soHoDan;
    private ArrayList<HoDan> arrKhuPho = new ArrayList<>();

    public KhuPho() {
    }

    public KhuPho(int soHoDan, ArrayList<HoDan> arrKhuPho) {
        this.soHoDan = soHoDan;
        this.arrKhuPho = arrKhuPho;
    }

    public int getSoHoDan() {
        return soHoDan;
    }

    public void setSoHoDan(int soHoDan) {
        this.soHoDan = soHoDan;
    }

    public ArrayList<HoDan> getArrKhuPho() {
        return arrKhuPho;
    }

    public void setArrKhuPho(ArrayList<HoDan> arrKhuPho) {
        this.arrKhuPho = arrKhuPho;
    }

    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so ho dan: "); setSoHoDan(scan.nextInt());
        ArrayList<HoDan> arrKhuPho = new ArrayList<>();
        for (int i=0; i<getSoHoDan(); i++){
            HoDan hoDan = new HoDan();
            hoDan.nhap();
            arrKhuPho.add(hoDan);
        }
        setArrKhuPho(arrKhuPho);
    }

    void xuat(){
        System.out.println("So ho dan: "+getSoHoDan());
        for (HoDan hoDan : getArrKhuPho())
            hoDan.xuat();
    }
}
