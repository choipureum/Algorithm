package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int i, j, m = sc.nextInt(); 
        int n = sc.nextInt();
        int [] a = new int[n + 1];

        for (i = 0; i <= n; i++) {
            a[i] = 0;
            a[1] = 1;
        }
        //에라스토 테네스의 체 채우기
        for (i = 2; i <= n; i++)
        {
            for (j = 2; i*j <= n; j++)
            {
                a[i * j] = 1;
            }
        }


        for (i = m; i <= n; i++)
        {
            if(a[i] != 1)
            {
                System.out.println(i);
            }
        }
    }
}

















