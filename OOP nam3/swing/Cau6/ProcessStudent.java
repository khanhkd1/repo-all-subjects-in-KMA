/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author khanhkd
 */
public class ProcessStudent extends Student{
    private ArrayList<Student> arrStudent = new ArrayList<>();

    public ProcessStudent() {
    }

    public ArrayList<Student> getArrStudent() {
        return arrStudent;
    }

    public void setArrStudent(ArrayList<Student> arrStudent) {
        this.arrStudent = arrStudent;
    }
    
    void createArr(){
        ArrayList<Student> arrStudent = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong: "); int n = scan.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Nhap thong tin sinh vien thu "+i);
            Student sv = new Student();
            sv.nhap();
            arrStudent.add(sv);
        }
        setArrStudent(arrStudent);
    }
    
    void ghiFile() throws FileNotFoundException, IOException{
        try{
            File file = new File("/Users/khanhkd/NetBeansProjects/OOP/src/Cau6/data.txt");
            FileOutputStream outPutStream = new FileOutputStream(file);
//            ObjectOutputStream objOutPut = new ObjectOutputStream(outPutStream);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outPutStream);

            for (int i=0; i<getArrStudent().size(); i++){
//                objOutPut.writeObject(getArrStudent().get(i));
                outputStreamWriter.write(getArrStudent().get(i).getHoTen()+"-"+getArrStudent().get(i).getTuoi()+"\n");
            }
            outputStreamWriter.close();
        }
        catch (IOException e){
            System.out.println("Error");
        }
        
//        outputStreamWriter.flush();
    }
}
