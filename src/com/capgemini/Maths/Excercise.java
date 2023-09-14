package com.capgemini.Maths;

public class Excercise implements Compute {
    @Override
    public void add() {
        int a=10,b=12;
        int c=a+b;
        System.out.println("The sum of a and b ="+ c);
    }

    @Override
    public void sub() {
        int a=10,b=12;
        int c=a-b;
        System.out.println("The difference of a and b ="+ c);
    }
}
