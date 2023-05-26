package com.cydeo.bobur;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FixNeeded {
    public static void main(String[] args) {
        System.out.println(print("Bob") + " good morning and have a nice week "+print(" Bob ")+" Don`t forget to graduated this school left => " + fact(2L) + " Month So Study Bro Study We " +
                "need this Salary at least " + formatSalary(fib(26L)));
    }


    public static long fact(Long n) {
        if (n <= 1) return 1;
        else return n * fact(n-1);
    }

    public static Long fib(Long n){
        if (n==0)return n;
        if (n==1)return n;
        return fib(n-1)+fib(n-2);
    }

    public static String print(String name) {
        return name.toUpperCase().charAt(0) + name.substring(1);
    }
    public static String formatSalary(long salary) {
        Locale locale = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return formatter.format(salary);
    }
}


