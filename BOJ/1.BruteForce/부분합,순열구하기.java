// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/3ee3d9284f2e4fd7b92b2a22e17d02d6

package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static int max;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //6
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken()); //20 1 15 8 4 10
        }
        //1. 모든순열 구하기
        Arrays.sort(arr);
        max = Math.max(max,checkMaxNum(arr));

        //다음 순열 존재시
        perm(arr, 0,N);

        bw.write(max+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    //차이값 도출
    public static int checkMaxNum(int [] arr)
    {
        int length = arr.length;
        int sum=0;
        for(int i=0;i<length-1;i++)
        {
            sum+=Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
    //다음 순열
    public static void perm(int[] arr, int depth, int n) {
        if (depth == n) {
            max = Math.max(max,checkMaxNum(arr));
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n);
            swap(arr, i, depth);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //print
    public static void print(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}
