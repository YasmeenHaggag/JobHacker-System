package com.week3;
import java.util.Arrays;
public class IfPanagram {
    public static boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        Arrays.sort(chars);
        int counter=0;
        if(sentence.length()<26)
            return false;
        for(int i=0;i<sentence.length()-1;i++){
            if(chars[i]!=chars[i+1]){
                counter++;
            }
        }
        if(counter==25) return true;
        else return false;
    }
}
