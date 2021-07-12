package com.company;
import java.util.*;

public class Main
{
    static int m,n;
    static int count;
    static int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};

    public static void main(String[] args) {
         char [][] grid = {
                 {'1','1','0','0','0'},
                 {'1','1','0','1','1'},
                 {'1','1','1','0','0'},
                 {'0','0','0','1','1'}
        };
         System.out.println(solve(grid));
    }
    public static int solve(char[][] grid)
    {
        if(grid==null || grid.length ==0 || grid[0].length ==0)
        {
            return 0;
        }
        m= grid.length; //4
        n= grid[0].length; //5

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid,int i, int j)
    {
        //error check
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] !='1')
        {
            return;
        }
        grid[i][j] = 'X'; //visited
        for(int[] dir: dirs)
        {
            dfs(grid,i+dir[0],j+dir[1]);
        }
    }
}
















