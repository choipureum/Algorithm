package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException
    {
        String input = br.readLine();
        PriorityQueue<String> pq = new PriorityQueue<String>(Comp);
        int length = input.length();

        for(int i=0;i<length;i++)
        {
            String tmp= input.substring(i);
            pq.offer(tmp);
        }
        print(pq);
        //bw.write(String.format(String.valueOf(result)));
        //bw.flush();
    }
    private static Comparator<String>Comp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            // TODO Auto-generated method stub
            return o1.compareTo(o2);
        }
    };
    public static void print(PriorityQueue<String> pq) throws IOException
    {
        while(!pq.isEmpty())
        {
            bw.write(pq.poll()+"\n");
        }
        bw.flush();
    }
}

















