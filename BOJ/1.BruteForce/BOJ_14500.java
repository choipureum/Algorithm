package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int [][] graph;
    static boolean [][] visited;
    static int[][] dirs ={{0,1},{1,0},{-1,0},{0,-1}};
    static int res;
    static int n,m;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); //5 5
        n = Integer.parseInt(st.nextToken()); //5
        m = Integer.parseInt(st.nextToken()); //5

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++)
            {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //print(graph);
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++)
            {
                visited[i][j] = true;
                dfs(i,j,0,0);
                getSpecialSum(i, j);
                print(visited);
                visited[i][j] = false;
            }
        }
        bw.write(res+"");
        br.close();
        bw.flush();
        bw.close();
    }
    public static void dfs(int x, int y, int depth,int sum)
    {
        if(depth ==4)
        {
            res = Math.max(res,sum);
            return;
        }

        for(int[] dir: dirs)
        {
            int dx = x+dir[0];
            int dy = y+dir[1];

            if(dx>=0 && dy>=0 && dx<n && dy<m && !visited[dx][dy])
            {
                visited[dx][dy] = true;
                dfs(dx,dy,depth+1,sum+graph[x][y]);
                visited[dx][dy] = false;
            }
        }
    }
    public static void getSpecialSum(int y, int x) {
        //ㅗ ㅜ ㅏ ㅓ 네가지 모양 검사해보기

        if(x-1>=0 && y-1>=0 && x+1<m) {
            int first = graph[y][x]+graph[y][x-1]+graph[y][x+1]+graph[y-1][x];
            res = Math.max(res, first);
        }

        if(x-1>=0 && y+1<n && x+1<m) {
            int second = graph[y][x]+graph[y][x-1]+graph[y][x+1]+graph[y+1][x];
            res = Math.max(second, res);
        }

        if(x+1<m && y+1<n && y-1>=0) {
            int third = graph[y][x+1]+graph[y-1][x]+graph[y+1][x]+graph[y][x];
            res = Math.max(third, res);
        }

        if(x-1>=0 && y-1>=0 && y+1<n) {
            int forth = graph[y][x-1]+graph[y-1][x]+graph[y+1][x]+graph[y][x];
            res = Math.max(forth, res);
        }

    }
    public static void print(boolean[][] visited)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===");
    }
}
