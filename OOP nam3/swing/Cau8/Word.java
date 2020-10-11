/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau8;

/**
 *
 * @author khanhkd
 */
public class Word {
    private String en;
    private String vi;

    public Word() {
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    @Override
    public String toString() {
        return "Word{" + "en=" + en + ", vi=" + vi + '}';
    }
    
    
//    public int compareTo(Word w){
//        return this.getEn().compareTo(w.getEn());
//    }
}
