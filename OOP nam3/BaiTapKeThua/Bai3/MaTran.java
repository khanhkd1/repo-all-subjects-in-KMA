/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua.Bai3;

import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class MaTran {
    private int soDong;
    private int soCot;
    private int[][] matrix;
    
    public MaTran() {
    }

    public MaTran(int soDong, int soCot) {
        this.soDong = soDong;
        this.soCot = soCot;
    }

    public int getSoDong() {
        return soDong;
    }

    public void setSoDong(int soDong) {
        this.soDong = soDong;
    }

    public int getSoCot() {
        return soCot;
    }

    public void setSoCot(int soCot) {
        this.soCot = soCot;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    
    
    void nhapMaTran(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tNhap dong: "); setSoDong(scan.nextInt());
        System.out.print("\tNhap cot: "); setSoCot(scan.nextInt());
        int [][] matrix_temp = new int[getSoDong()][getSoCot()];
        for(int i=0; i<getSoDong(); i++)
            for(int j=0; j<getSoCot(); j++){
                System.out.print("\tNhap phan tu "+(i+1)+","+(j+1)+": ");
                matrix_temp[i][j] = scan.nextInt();
            }
        setMatrix(matrix_temp);
    }
    
    void inMaTran(){
        for(int i=0; i<getSoDong(); i++){
            for(int j=0; j<getSoCot(); j++)
                System.out.print(getMatrix()[i][j]+" ");
            System.out.println("");
        }
    }
}
