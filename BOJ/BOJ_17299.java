package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new 	OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<Integer>();

        int N = Integer.parseInt(br.readLine());

        int[] seq = new int[N];
        int [] number = new int[1000001]; //F(Ai)
        int [] result = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++)
        {
            seq[i] = Integer.parseInt(st.nextToken());
            number[seq[i]]++;
        }

        for(int i=0;i<seq.length;i++)
        {
            while(!stack.isEmpty() && number[seq[stack.peek()]] < number[seq[i]])
            {
                result[stack.pop()] = seq[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            result[stack.pop()] = -1;
        }

        for(int num : result)
        {
            bw.write(num+" ");
        }
        bw.flush();
    }
}
















