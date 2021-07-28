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
    static int [][] box;
    static boolean [][] visited;
    static int res=0;
    static Queue<int[]> q = new LinkedList<int[]>();

    //static ArrayList<ArrayList<Integer>> graph;
    //static ArrayList<Integer> cntList;
    //dfs
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];

        for(int i=0;i<n;i++)
        {
            String [] input = br.readLine().split(" ");
            for(int j=0;j<m;j++)
            {
                box[i][j]= Integer.parseInt(input[j]);
                if(box[i][j] == 1)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        bw.write(bfs()+"\n");
        bw.flush();
        //print(box);

    }
    public static int bfs()
    {

       while(!q.isEmpty())
       {
           int [] loc = q.poll();

           for(int [] dir : dirs)
           {
               int dx = loc[0]+dir[0];
               int dy = loc[1]+dir[1];

               if(dx>=0 && dy>=0 && dx<n && dy<m)
               {
                   if(box[dx][dy] == 0)
                   {
                        q.offer(new int[]{dx,dy});
                        //날짜 값얻기
                        box[dx][dy] = box[loc[0]][loc[1]]+1;
                   }
               }
           }
       }
       int min = Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               if(box[i][j] == 0)
               {
                   return -1;
               }
               min = Math.max(min,box[i][j]);
           }
       }
       return min-1;
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
