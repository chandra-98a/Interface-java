package com.capgemini.dc;

public class Addition implements Compute{
    @Override
    public void add() {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("c ="+c);
    }

    @Override
    public void sub() {
        int a=10,b=20,c;
        c=a-b;
        System.out.println("c ="+c);
    }
    void mul(){
        int a=10,b=20,c;
        c=a*b;
        System.out.println("c ="+c);
    }
}
