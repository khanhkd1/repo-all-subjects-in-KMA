package OOP_nam3.Buoi4.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void readFile(String path) throws IOException {
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        while ((line = reader.readLine()) != null)
            System.out.println(line);
    }

    static void writeFile(String path, ArrayList<KhachHang> arrKH) throws IOException {
        File file = new File(path);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for (KhachHang kh: arrKH){
            outputStreamWriter.write(kh.toString());
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }

    public static void main(String[] args) throws IOException {
        String path = "/Users/khanhkd/IdeaProjects/OOP/src/OOP_nam3/Buoi4/Bai1/text.txt";
        Scanner scan = new Scanner(System.in);
        ArrayList<KhachHang> arrKH = new ArrayList<>();
        while (true){
            System.out.println("1. Nhap in4");
            System.out.println("2. Xuat");
            System.out.println("3. Data -> text");
            System.out.println("4. Read text");
            System.out.println("5. Exit");
            System.out.print("Chon chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap so luong: "); int soLuong = scan.nextInt();
                    for (int i=0; i<soLuong; i++){
                        KhachHang kh = new KhachHang();
                        kh.nhap();
                        arrKH.add(kh);
                    }
                    continue;
                case 2:
                    System.out.println("Danh sach khach hang:");
                    for (int i=0; i<arrKH.size(); i++)
                        arrKH.get(i).xuat();
                    continue;
                case 3:
                    try {
                        writeFile(path, arrKH);
                    }
                    catch (Exception e){
                        System.out.println("Loi");
                    }
                    finally {
                        continue;
                    }
                case 4:
                    readFile(path);
                    continue;
                case 5:
                    break;
            }
            break;
        }

    }
}
