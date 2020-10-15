/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua.Bai3;

/**
 *
 * @author khanhkd
 */
public class Main {
    
    static MaTran dotProduct(MaTran mt1, MaTran mt2){
        MaTran mtDot = new MaTran(mt1.getSoDong(), mt1.getSoCot());
        int[][] maTrix_temp = new int[mtDot.getSoDong()][mtDot.getSoCot()];
        for (int i=0; i<mtDot.getSoDong(); i++)
            for(int j=0; j<mtDot.getSoCot(); j++)
                maTrix_temp[i][j] = mt1.getMatrix()[i][j] * mt2.getMatrix()[i][j];
        mtDot.setMatrix(maTrix_temp);
        return mtDot;
    }
    
    static MaTran sumProduct(MaTran mt1, MaTran mt2){
        MaTran mtDot = new MaTran(mt1.getSoDong(), mt1.getSoCot());
        int[][] maTrix_temp = new int[mtDot.getSoDong()][mtDot.getSoCot()];
        for (int i=0; i<mtDot.getSoDong(); i++)
            for(int j=0; j<mtDot.getSoCot(); j++)
                maTrix_temp[i][j] = mt1.getMatrix()[i][j] + mt2.getMatrix()[i][j];
        mtDot.setMatrix(maTrix_temp);
        return mtDot;
    }
    
    public static void main(String[] args) {
        MaTran mt1 = new MaTran();
        MaTran mt2 = new MaTran();
        System.out.println("Nhap ma tran 1:");
        mt1.nhapMaTran();
        System.out.println("Ma tran 1:");
        mt1.inMaTran();
        System.out.println("Nhap ma tran 2:");
        mt2.nhapMaTran();
        System.out.println("Ma tran 2:");
        mt2.inMaTran();
        MaTran sumProduct = sumProduct(mt1, mt2);
        MaTran dotProduct = dotProduct(mt1, mt2);
        System.out.println("Cong ma tran 1 va 2:");
        sumProduct.inMaTran();
        System.out.println("Nhan ma tran 1 va 2:");
        dotProduct.inMaTran();
    }
    
}
