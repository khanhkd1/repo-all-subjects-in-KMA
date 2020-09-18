package OOP.Buoi2.Bai4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class date {
    int ngay;
    int thang;
    int nam;

    public date() {
    }

    public date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ngay: "); setNgay(scan.nextInt());
        System.out.print("Nhap thang: "); setThang(scan.nextInt());
        System.out.print("Nhap nam: "); setNam(scan.nextInt());
    }

    public Date getTime(){
        Calendar date = Calendar.getInstance();
        date.set(getNam(), getThang() -1, getNgay());
        Date date1fm = date.getTime();
        return date1fm;
    }

    public String chuanHoa(Date time){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(time);
    }

    public void xuat(){
        System.out.println("Time: "+chuanHoa(getTime()));
    }

    public Date keTiep(){
        Calendar date = Calendar.getInstance();
        date.set(getNam(), getThang() -1, getNgay()+1);
        Date date1fm = date.getTime();
        return date1fm;
    }

    @Override
    public String toString() {
        return "date{"
                +chuanHoa(getTime())
                +", ke tiep: "
                +chuanHoa(keTiep())
                + "}";
    }
}
