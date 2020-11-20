/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de8;

import java.util.Scanner;

/**
 *
 * @author khanhkd
 */
public class Number {
    private int value;
    private int min;
    private int max;

    public Number() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\tvalue: "); setValue(scan.nextInt());
        System.out.print("\tmin: "); setMin(scan.nextInt());
        System.out.print("\tmax: "); setMax(scan.nextInt());   
    }
    
    boolean checkValueNto(){
        if(value <= 1) return false;
        else if (value > 2 && value %2 == 0) return false;
        for(int i=3; i<= Math.sqrt(value); i++)
            if(value%i==0) return false;
        return true;
    }

    @Override
    public String toString() {
        return value + "-" + min + "-" + max;
    }
    
    
    
}
