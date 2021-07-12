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
                 {'1','1','0','0','0'},
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

        //O(M*N)
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void bfs(char[][] grid,int i, int j)
    {
        grid[i][j] = 'X'; //visited : 해당위치 방문체크

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j}); // 0,0

        while(!queue.isEmpty())
        {
            int [] cur = queue.poll();

            for(int [] dir:dirs)
            {
                int x1 = cur[0]+dir[0];
                int y1 = cur[1]+dir[1];

                if(x1 >= 0 && y1>=0 && x1 <m && y1<n && grid[x1][y1] =='1')
                {
                    grid[x1][y1] = 'X';
                    queue.offer(new int[]{x1,y1});
                }
            }
        }
    }
}
















