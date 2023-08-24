package com.week4;

public class ReverseString {

    public StringBuilder reverse(StringBuilder string){
        StringBuilder reversed= new StringBuilder("");
        for(int i=string.length()-1;i>=0;i--){
            reversed.append(string.charAt(i));
        }
        return reversed;
    }

    /* public String reverse(String string){
        String reversed="";
        for(int i=string.length()-1;i>=0;i--){
            reversed+=string.charAt(i);
        }
        return reversed;
    }
     */
}
