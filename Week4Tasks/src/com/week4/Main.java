package com.week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       /* Scanner input=new Scanner(System.in);
        Reverse_string word=new Reverse_string();
        //String string=input.next();
        //System.out.println(word.reverse(string));

        Palindrome text=new Palindrome();
        //System.out.println(text.palindrome(string));

        string_occurence object=new string_occurence();
        System.out.println(object.occurence("Hello Hello world","Hello"));*/


        Scanner input=new Scanner(System.in);
        String s1=input.next(),s2=input.next(); int l=0;
        s1=s1.toLowerCase(); s2=s2.toLowerCase();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>s2.charAt(i)){
                l=1;
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                l=-1;
            }
            else  if(s1.charAt(i)==s2.charAt(i)){
                l=0;
            }
        }
        System.out.println(l);

    }
}