package com.week4;

public class Palindrome {
    public boolean palindrome(String string){
        boolean flag=false;
        int right=0,left=string.length()-1;
        while(right<left){
            if(string.charAt(right)!=string.charAt(left))
                return false;
            right++; left--;
        }
        return true;
    }
}
