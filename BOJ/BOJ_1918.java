package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new 	OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        char []  input = br.readLine().toCharArray(); //A*(B+C)
        StringBuilder sb = new StringBuilder(); //결과
        int strLength = input.length;

        for(int i=0;i<strLength;i++)
        {
            char ch = input[i];

            if(ch >= 'A' && ch <='Z') //일반 알파벳
            {
                sb.append(ch+"");
            }
            else
            {
                switch(ch)
                {
                    case '(':
                        stack.push(ch); //위치
                        break;
                    case ')':
                        while(!stack.isEmpty() && stack.peek()!= '(')
                        {
                            sb.append(stack.pop());
                        }
                        if(!stack.isEmpty()) stack.pop(); // ( 를 빼준다
                        break;
                    default: // +/*- //괄호없는 연산인 경우
                        while(!stack.isEmpty() && OrderInput(stack.peek()) >= OrderInput(ch))
                        {
                            sb.append(stack.pop());
                        }
                        stack.push(ch);
                        break;
                }
            }
        }
        //스택에 있는 남은 연산자를 모두 꺼낸다.
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        bw.write(String.format(sb.toString()));
        bw.flush();
    }

    private static int OrderInput(char peek)
    {
        if(peek=='*'|| peek=='/') return 2;
        else if(peek=='+'|| peek=='-') return 1;
        else{return 0;}
    }


}
















