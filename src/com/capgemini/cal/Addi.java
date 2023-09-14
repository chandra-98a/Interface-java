package com.capgemini.cal;

public class Addi extends Compute implements AdvCompute{
    public void sub(){
        int a=9,b=8;
        int c=a-b;
        System.out.println("subtraction is "+c);
    }
}
