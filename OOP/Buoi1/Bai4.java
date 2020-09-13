package OOP.Buoi1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int inHoa = 0, inThuong = 0, so = 0, kyTu = 0, khoangTrang = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') inHoa++;
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') inThuong++;
            else if (Character.isDigit(str.charAt(i))) so++;
            else if (str.charAt(i) == ' ') khoangTrang++;
            else kyTu++;
        }
        System.out.println("So ky tu in hoa trong chuoi: "+inHoa);
        System.out.println("So ky tu in thuong trong chuoi: "+inThuong);
        System.out.println("So ky tu la so trong chuoi: "+so);
        System.out.println("So ky tu dac biet trong chuoi: "+kyTu);
        System.out.println("So khoang trang trong chuoi: "+khoangTrang);
    }
}
