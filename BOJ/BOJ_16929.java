package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
    static char [][] game;
    static boolean [][] visited;
    static int [][] cnt;
    //static ArrayList<ArrayList<Integer>> graph;
    //static ArrayList<Integer> cntList;
    //dfs(two Dots)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        game = new char[n][m];
        visited = new boolean[n][m];
        cnt = new int[n][m];

        for(int i=0;i<n;i++)
        {
            char [] arr = br.readLine().toCharArray();
            for(int j=0;j<m;j++)
            {
                game[i][j] = arr[j];
            }
        }
        //print(game);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j])
                {
                   visited= new boolean[n][m];

                    int [] start  = {i,j};
                    if(dfs(i,j,start,1,visited))
                    {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }
    public static boolean dfs(int x, int y,int[]start,int length, boolean[][]visited)
    {
        if(visited[x][y])
        {
            return length-cnt[x][y]>=4;
        }
        cnt[x][y] = length;

        visited[x][y] = true;

        for(int [] dir : dirs)
        {
            int dx = x+dir[0];
            int dy = y+dir[1];
            if(dx>=0 && dy>=0 && dx<n && dy<m)
            {
                if(game[x][y]==game[dx][dy])
                    if(dfs(dx,dy,start,length+1,visited))
                        return true;

            }
        }
        return false;
    }

    //테스트
    public static void print(int [][] maze)
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
