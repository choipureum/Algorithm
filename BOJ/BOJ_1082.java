package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException
    {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String [] arr =new String[4];
        for(int i=0;i<4;i++)
        {
            arr[i] = st.nextToken();
        }
        long left = Long.parseLong(arr[0]+arr[1]);
        long right = Long.parseLong(arr[2]+arr[3]);

        System.out.println(left+right);
        //bw.write(String.format(String.valueOf(result)));
        //bw.flush();
    }
}
















