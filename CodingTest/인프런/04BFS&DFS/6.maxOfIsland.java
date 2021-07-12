package com.company;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main
{
    static int n,m;
    static int count;
    static int [][] dirs ={{0,1},{1,0},{-1,0},{0,-1}};
    //bfs stack방식
    //Maximum Depth Of BinaryTree
    public static void main(String[] args)
    {
        int [][]  grid = {
                {1,1,0,1,1},
                {0,1,1,0,0},
                {0,0,0,0,0},
                {1,1,0,1,1},
                {1,0,1,1,1},
                {1,0,1,1,1},
        };
        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        int max =0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                    int area = dfs(grid,i,j,0); //1번째 4
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }
    public static int dfs(int [][] grid,int x,int y, int area)
    {
        //1 범위 내인지
        if(x<0 || y<0 || x>=m|| y>=n || grid[x][y]==0)
        {
            return area;
        }
        //2 1인 육지가 들어오는 경우
        grid[x][y] = 0; //방문 visited
        area++;
        for(int[] dir : dirs)
        {
            area = dfs(grid,dir[0]+x,dir[1]+y,area);
        }
        return area;
    }

}
















