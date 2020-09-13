package OOP.Buoi2.Bai3;

import java.util.Scanner;

public class TamGiac {
    double canh1;
    double canh2;
    double canh3;

    public TamGiac() {
    }

    public TamGiac(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat: "); setCanh1(scan.nextDouble());
        System.out.print("Nhap canh thu hai: "); setCanh2(scan.nextDouble());
        System.out.print("Nhap canh thu ba: "); setCanh3(scan.nextDouble());
    }

    public void xuat(){
        System.out.println("3 canh tam giac: "+getCanh1()+" - "+getCanh2()+" - "+getCanh3());
    }

    public String checkTamGiac(){
        if (getCanh1() == getCanh2() && getCanh1() == getCanh3())
            return "tam giac deu";
        else if (getCanh1() == getCanh2() || getCanh1() == getCanh3() || getCanh2() == getCanh3()){
            if (getCanh1()*getCanh1() == getCanh2()*getCanh2() + getCanh3()*getCanh3() ||
                    getCanh2()*getCanh2() == getCanh1()*getCanh1() + getCanh3()*getCanh3() ||
                    getCanh3()*getCanh3() == getCanh2()*getCanh2() + getCanh1()*getCanh1())
                return "tam giac vuong can";
            else return "tam giac can";
        }
        else if (getCanh1()*getCanh1() == getCanh2()*getCanh2() + getCanh3()*getCanh3() ||
                getCanh2()*getCanh2() == getCanh1()*getCanh1() + getCanh3()*getCanh3() ||
                getCanh3()*getCanh3() == getCanh2()*getCanh2() + getCanh1()*getCanh1())
            return "tam giac vuong";
        else return "tam giac thuong";
    }

    public double chuVi(){
        return getCanh1() + getCanh2() + getCanh3();
    }

    public double dienTich(){
        double nuaC = (getCanh1()+getCanh2()+getCanh3())/2;
        return Math.sqrt(nuaC*(nuaC-getCanh1())*(nuaC-getCanh2())*(nuaC-getCanh3()));
    }

    @Override
    public String toString() {
        return "TamGiac{" +
                "canh1=" + canh1 +
                ", canh2=" + canh2 +
                ", canh3=" + canh3 +
                ", loai=" + checkTamGiac() +
                ", chuvi=" + chuVi() +
                ", dientich=" + dienTich() +
                '}';
    }
}
