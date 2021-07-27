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
    static int [][] maze;
    static boolean [][] visited;
    //static ArrayList<ArrayList<Integer>> graph;
    //static ArrayList<Integer> cntList;
    //bfs
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            maze = new int[n][m];
            int ans = n*m;

            //ds
            for(int i=0;i<n;i++)
            {
                String input = br.readLine();

                for(int j=0;j<m;j++)
                {
                    maze[i][j] = input.charAt(j)-'0';
                }
            }
            //print(maze);
            if(maze==null || maze.length==0)
            {
                System.out.println(0);
                return;
            }

            visited = new boolean[n][m];

            bfs(0,0,visited);
            System.out.println(maze[n-1][m-1]);
        }
    }
    public static void bfs(int x, int y, boolean [][] visited)
    {
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;

        while(!q.isEmpty())
        {
            int [] now = q.poll();

            for(int [] dir:dirs)
            {
                int dx = now[0]+dir[0];
                int dy = now[1]+dir[1];

                if(dx>=0 && dy>=0 && dx<n && dy<m)
                {
                    if(maze[dx][dy]!=0 && !visited[dx][dy])
                    {
                        q.offer(new int[] {dx,dy});
                        visited[dx][dy] = true;
                        maze[dx][dy] = maze[now[0]][now[1]]+1;
                    }
                }
            }
        }
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
























