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

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //4
        StringBuilder sb = new StringBuilder();
        int [] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = i+1;
        }
        //1 2 3 4
        print(arr);
        System.out.println();

        while(nextLevel(arr))
        {
            print(arr);
            System.out.println();
        }
    }
    public static boolean nextLevel(int [] arr)//1234
    {
        int first_idx = arr.length-1; //3

        while(first_idx>0 && arr[first_idx]<arr[first_idx-1]) //4>3
        {
            first_idx--; //2
        }
        if(first_idx ==0) //맨처음
            return false;

        int last_idx = arr.length-1;
        while(arr[first_idx-1]>arr[last_idx]) //4>3
        {
            last_idx--; //2
        }
        swap(arr, first_idx-1, last_idx);

        last_idx = arr.length-1;
        while(first_idx < last_idx) {
            swap(arr, first_idx, last_idx);
            first_idx++;
            last_idx--;
        }
        return true;
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
