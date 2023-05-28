package com.week4;

import java.util.StringTokenizer;

public class StringOccurence {
    public int occurence(String string, String subString) {
        int cnt = 0;
        StringTokenizer word = new StringTokenizer(string);
        for (int i = 0; i <=word.countTokens()+1; i++) {
            if (word.nextToken().equals(subString)  ) {
                cnt++;
            }
        }
        return cnt;
    }
}
