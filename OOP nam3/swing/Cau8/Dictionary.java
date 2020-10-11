/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author khanhkd
 */
public class Dictionary extends Word{
    private ArrayList<Word> arrWord = new ArrayList<>();

    public Dictionary() {
    }
    
    public void addToArray(Word w){
        arrWord.add(w);
    }

    public ArrayList<Word> getArrWord() {
        return arrWord;
    }

    public void setArrWord(ArrayList<Word> arrWord) {
        this.arrWord = arrWord;
    }
    
    void sort(){
        ArrayList<Word> temp = getArrWord();
        Collections.sort(temp, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getEn().compareTo(o2.getEn());
            }
        });
        setArrWord(temp);
    }
    
}
