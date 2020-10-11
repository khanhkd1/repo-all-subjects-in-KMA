/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau6;

import java.io.IOException;

/**
 *
 * @author khanhkd
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ProcessStudent prsStudent = new ProcessStudent();
        prsStudent.createArr();
        prsStudent.ghiFile();
        System.out.println("OK");
    }
        
    
}
