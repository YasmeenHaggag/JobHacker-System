package com.week4;

public class string_occurence {
    public int occurence(String string,String subString){
        String arr[] = string.split(" ");
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(subString))
                counter++;
        }
        return counter;
    }
}
