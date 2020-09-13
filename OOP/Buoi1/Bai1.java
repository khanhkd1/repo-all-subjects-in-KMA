package OOP.Buoi1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai1 {
    static void process(int nam, int thang, int ngay){
        Calendar date1 = Calendar.getInstance();
        date1.set(nam, thang -1, ngay);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1fm = date1.getTime();
        date1.add(Calendar.DAY_OF_MONTH, 1);
        Date date2fm = date1.getTime();
        System.out.println("Sau ngay "+sdf.format(date1fm)+" la ngay "+sdf.format(date2fm));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao nam: "); int nam = scan.nextInt();
        System.out.print("Nhap vao thang: "); int thang = scan.nextInt();
        System.out.print("Nhap vao ngay: "); int ngay = scan.nextInt();
        process(nam, thang, ngay);
    }
}
