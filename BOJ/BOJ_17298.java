package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) 
        {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < N; i++) {
            
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) 
            {
                seq[stack.pop()] = seq[i];
            }

            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) 
        {
            sb.append(seq[i]).append(' ');
        }
        System.out.println(sb);
    }
}
















