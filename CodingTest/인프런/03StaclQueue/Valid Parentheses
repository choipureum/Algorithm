package com.company;
import java.util.*;

public class Main {
    //Stack Queue
    //Valid Parentheses
    public static void main(String[] args) {
        String exp = "()[]";
        System.out.println(isValid(exp));
    }
    public static boolean isValid(String exp)
    {
        //1 ds
        Stack<Character> stack = new Stack<Character>();

        if(exp.length()%2 !=0) { return false; }

        //2
        for(int i=0;i<exp.length();i++)
        {
            switch (exp.charAt(i))
            {
                case ')':
                    if(!stack.isEmpty() && stack.peek() =='(') stack.pop();
                    else{return false; }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() =='[') stack.pop();
                    else{return false; }
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek() =='{') stack.pop();
                    else{return false; }
                    break;
                default:
                    stack.push(exp.charAt(i));
            }
        }
        if(stack.size() ==0){return true;}
        else{
            return false;
        }
    }
}


