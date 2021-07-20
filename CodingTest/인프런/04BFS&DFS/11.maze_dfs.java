package com.company;
import java.util.*;
import java.io.*;

public class Solution {
    //DFS (Stack)
    //Maze
    static int m,n;
    static int [][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};

    public static void main(String[] args) {
        int [][] maze = {
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0},
        };
        int [] start = {0,4};
        int [] dest = {4,4};
        System.out.println(solve(maze,start,dest));
    }
    public static boolean solve(int[][] maze, int[] start, int[] dest)
    {
        if(maze==null ||maze.length==0)
        {
            return false;
        }
        m= maze.length; //5
        n= maze[0].length; //5
        boolean [][] visited = new boolean[m][n];
        return dfs(maze,start,dest,visited);
    }

    private static boolean dfs(int[][] grid, int[] start, int[] dest, boolean[][] visited)
    {
        //error check
        if(start[0]<0 || start[0]>=m || start[1] < 0 || start[1]>=n || visited[start[0]][start[1]])
        {
            return false;
        }
        //0,4
        visited[start[0]][start[1]] = true;
        if(start[0] == dest[0] && start[1] == dest[1])
        {
            return true;
        }

        for(int [] dir:dirs)
        {
            int x = start[0]; //0
            int y = start[1]; //4

            while(x>=0 && x<m && y >= 0 && y<n && grid[x][y] ==0)
            {
                x+=dir[0]; //0 1 2 3
                y+=dir[1]; //4 4 4 4
            }
            x-= dir[0];
            y-= dir[1]; //해당 없는 부분 원복

             if(dfs(grid, new int[]{x,y}, dest, visited))
             {
                 return true;
             }
        }
        return false;
    }
    private static void print(boolean [][] visited)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
    }


}
