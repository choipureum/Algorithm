package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    static int [][] maze;
    static boolean [][] visited;
    static int cnt=0;
    static ArrayList<Integer> cntList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            cnt=0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            if(n==0 && m==0) break;

            maze = new int[n][m];

            for(int i=0;i<n;i++)
            {
                String [] input = br.readLine().split(" ");
                for(int j=0;j<m;j++)
                {
                    maze[i][j] = Integer.parseInt(input[j]);
                }
            }
            visited= new boolean[n][m];

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(maze[i][j]==1 && !visited[i][j])
                    {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
    }
    public static void dfs(int x, int y)
    {
        if(x<0||y<0||x>=n||y>=m || maze[x][y]==0 || visited[x][y])
        {
            return;
        }

        visited[x][y]= true;

        for(int[] dir : dirs)
        {
            int dx = x+dir[0];
            int dy = y+dir[1];
            if(dx>=0 && dy>=0 && dx<n && dy<m)
            {
                if(!visited[dx][dy] && maze[dx][dy]==1)
                {
                    dfs(dx,dy);
                }
            }
        }
    }

    //테스트
    public static void print(boolean[][] maze)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
