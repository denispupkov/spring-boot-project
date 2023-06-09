package com.cydeo.almi;

import java.util.Stack;

public class ReversedStack {

    //todo Almi as you see inside of the second loop you are creating a new string in every iteration
    //could you use other structure instead string but at the end return string
    //hint *you might think about StringBuilder
    public static String reverseStr(String str){

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) stack.push(str.charAt(i));

        for (int i = 0; i < str.length(); i++) sb.append(stack.pop());

        return sb.toString();

    }
}
