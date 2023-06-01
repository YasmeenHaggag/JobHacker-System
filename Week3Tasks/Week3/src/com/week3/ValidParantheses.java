package com.week3;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
            if(s.length()%2!=0)
                return false;
            char chars[]=s.toCharArray();
            Stack<Character> Stack = new Stack<Character>();
            for (char i:chars){
                if(i=='('||i=='['||i=='{')
                    Stack.push(i);
                else
                if(!Stack.empty()&&i==')'&&Stack.peek()=='(')
                    Stack.pop();
                else  if(!Stack.empty()&&i=='}'&&Stack.peek()=='{')
                    Stack.pop();
                else  if(!Stack.empty()&&i==']'&&Stack.peek()=='[')
                    Stack.pop();
                else return false;
            }
            return (Stack.isEmpty());
        }
    }



}
