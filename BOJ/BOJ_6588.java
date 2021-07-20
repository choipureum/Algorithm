package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static final int MAX = 1000000;

    public static void main(String[] args) throws IOException
    {
        boolean[] isPrime = new boolean[MAX+1];
        for(int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        for(int i = 2; i <= MAX; i++) {
            for(int j = i * 2; j <= MAX; j += i) {
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }

        while(true)
        {
            int n = Integer.parseInt(br.readLine()); //8
            if(n==0)break;
            //System.out.println(Arrays.toString(era));
            goldBache(isPrime,n); //체,8
            bw.flush();
        }
    }
    // 골드바흐판별
    private static void goldBache(boolean[] isPrime, int n) throws IOException
    {
        boolean ok = false;
        for(int i = 2; i <= n/2; i++) {
            if(isPrime[i] && isPrime[n-i]) {
                System.out.println(n + " = " + i + " + " + (n-i));
                ok = true;
                break;
            }
        }
        if(!ok)
            System.out.println("Goldbach's conjecture is wrong.");

    }

}

















