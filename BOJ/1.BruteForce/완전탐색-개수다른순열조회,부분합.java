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
    static int [][] graph;
    static int min = Integer.MAX_VALUE;
    static boolean [] visited;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        //1. ds
        graph = new int[N][N];
        visited = new boolean[N];
        //1. ds
        for(int i=0;i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
            {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //System.out.println(Arrays.deepToString(graph));
        dfs(0);
        System.out.println(min);
    }
    public static void dfs(int depth)
    {
        // 브루트 포스인경우인데 전체 개수도 다른 순열을 뽑고 방문 여부를 판단한다. depth에 도달하면 체크하고 갱신
        if(depth == N)
        {
            checkTeam();
            return;
        }
        visited[depth] = true;
        dfs(depth+1);
        visited[depth] = false;
        dfs(depth+1);
    }
    public static void checkTeam()
    {
        int start = 0;
        int link = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (visited[i] != visited[j])
                    continue;
                if (visited[i])
                    start += graph[i][j] + graph[j][i];
                else
                    link += graph[i][j] + graph[j][i];
            }
        }
        min = Math.min(min,Math.abs(start-link));
    }

    public static void print(boolean [] tmp)
    {
        for(int j=0;j<N;j++)
        {
           System.out.print(tmp[j]+" ");
        }
        System.out.println();
    }
}
