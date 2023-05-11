package com.cydeo.cihat;

public class SwapAlgo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        b = (a+b) - (a=b);

        System.out.println(a);
        System.out.println(b);
    }
}
