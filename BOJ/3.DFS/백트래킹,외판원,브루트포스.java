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
    static int N;
    static int min = Integer.MAX_VALUE;
    static int [][] load;
    static boolean [] visited;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine()); //4
        StringTokenizer st;

        load = new int[N][N];
        visited = new boolean[N];
        //1. ds
        for(int i=0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
            {
                load[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //2
        for(int i=0;i<N;i++) {
            visited[i] = true;
            dfs(i, i, 0, 0);
            visited[i] = false;
        }
        if(min == Integer.MAX_VALUE)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(min);
        }
    }
    public static void dfs(int start, int cur, int depth, int sum)
    {
        if(depth == N-1)
        {
            if(load[cur][start]==0)
            {
                return;
            }
            min = Math.min(min,sum+load[cur][start]);
        }

        for(int next=0;next<N;next++)
        {
            if(!visited[next] && load[cur][next]!=0)
            {
                visited[next] = true;
                dfs(start,next,depth+1,sum+load[cur][next]);
                visited[next] = false;
            }
        }
    }




}
