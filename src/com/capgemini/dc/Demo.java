package com.capgemini.dc;

import com.capgemini.Calculations.A;

public class Demo {
    public static void main(String[] args){
        Addition a=new Addition();
        Compute ptr;
        ptr=a;
        ptr.add();
        ptr.sub();
       // ptr.mul();   error

        ((Addition)(ptr)).mul();
    }
}
