package com.company;
import sun.awt.image.ImageWatched;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main
{
    static int m,n;
    static int[][] dirs ={{1,0},{0,1},{-1,0},{0,-1}};
    //bfs
    //Queue 이용
    //Maze
    public static void main(String[] args)
    {
        int[][] maze ={
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0}
        };
        int [] start = {0,4};
        int [] end = {4,4};
        System.out.println(solve(maze,start,end));
    }
    public static boolean solve(int[][] maze, int [] start, int[] end) //원래는 start, end없다면 for문 두번으로 해야되지만 시작점, 종료점을 줬기때문에 for2번 필요없음
    {
        m = maze.length; //5
        n = maze[0].length; //5

        if(start[0] ==end[0] && start[1] == end[1]) //두점이 같을때
        {
            return true;
        }
        boolean [][] visited = new boolean[m][n];
        visited[start[0]][start[1]] = true; // 시작점
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(start); //0,4

        while(!queue.isEmpty())
        {
            int [] cur = queue.poll();
            for(int[] dir : dirs)
            {
               int x = cur[0];
               int y = cur[1];
               //**핵심 조건**
               while(x>=0 && y>=0 && x<m && y<n && maze[x][y]==0) //뚫린경우
               {
                   //쭉간다
                   x+= dir[0];
                   y+= dir[1];
                   //System.out.println("x:"+x+"/y:"+y);
               }
               //바로앞이 3,4 -> 2,4로 해줘야됨
                x-=dir[0];
                y-=dir[1];
                if(visited[x][y])continue;
                visited[x][y] = true;
                if(x==end[0] && y==end[1]) return true;
                //print(visited);
                queue.offer(new int[]{x,y});
            }
        }
        return false;
    }
    private static void print(boolean [][] visited)
    {
        if(visited ==null || visited.length==0)
        {
            return;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(visited[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
















