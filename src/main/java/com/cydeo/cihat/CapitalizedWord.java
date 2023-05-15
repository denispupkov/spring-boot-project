package com.cydeo.cihat;

public class CapitalizedWord {

    public static void main(String[] args) {
        String word = "cydeo";
        System.out.println(makeCapitalized(word));
    }


    public static String makeCapitalized(String str){

        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
