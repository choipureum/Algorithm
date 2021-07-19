package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new 	OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        HashMap<Character,Integer> map = new HashMap<>();
        char ch = 'A';
        for(int i=0;i<N;i++)
        {
            int k = Integer.parseInt(br.readLine());
            map.put(ch,k);
            ch++;
        }
        Stack<Double> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) 
        {
            ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z')
                stack.push((double) map.get(ch));
            else {
                double b = stack.pop();
                double a = stack.pop();

                switch (ch) {
                    case '+':
                        double n = a + b;
                        stack.push(n);
                        break;
                    case '-':
                        n = a - b;
                        stack.push(n);
                        break;
                    case '*':
                        n = a * b;
                        stack.push(n);
                        break;
                    case '/':
                        n = a / b;
                        stack.push(n);
                        break;
                }

            }
        }
        bw.write(String.format("%.2f",stack.pop()) + "\n");
        bw.flush();
    }
}
















