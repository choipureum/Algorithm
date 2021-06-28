package com.company;
import java.util.*;

public class Main {
    //Stack Queue
    //BaseBall game
    public static void main(String[] args) {
        String [] strs = {"5","-2","4","C","D","9","+","+"};
        System.out.println(points(strs));
    }
    public static int points(String [] strs)
    {
        //1 ds
        Stack<Integer> stack = new Stack<Integer>();

        //2 for
        for(String op : strs)
        {
            switch (op)
            {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "+":
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    stack.push(n2);
                    stack.push(n1);
                    stack.push(n1+n2);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int num: stack){
            sum+=num;
        }

        return sum;
    }
}


