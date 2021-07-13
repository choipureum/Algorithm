package com.company;
import sun.awt.image.ImageWatched;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main
{
    static int m,n;
    static int [][] dirs ={{0,1},{1,0},{-1,0},{0,-1}};

    //**중요문제**
    //dfs Stack -> 한큐에 끝내야한다, 안맞는건 다 던진다 : 연역적 사고
    // 보통 dfs
    //Word Search
    public static void main(String[] args)
    {
        char [][] grid ={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word ="ABCCED";
        System.out.println(solve(grid,word));
    }
    private static boolean solve(char[][]grid, String word)
    {
        //error check
        if(grid ==null || grid.length==0 || grid[0].length ==0)
        {
            return false;
        }
        m = grid.length;
        n = grid[0].length;

        boolean [][] visited = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dfs(grid,visited,i,j,0,word)) //한큐에 끝난다면
                {
                    return true;
                }
            }
        }
        return false;
    }
    //m = 3, n = 4
    private static boolean dfs(char[][]grid, boolean[][] visited,int x, int y, int start, String word)
    {
        if(start == word.length()) return true;
        if(x<0 || y<0 || x>=m|| y>=n) //벗어난경우
        {
            return false;
        }
        if(visited[x][y])return false; //방문
        if(grid[x][y]!= word.charAt(start))return false; //

        //방문
        visited[x][y] =true;

        //사방으로 돌기
        for(int [] dir : dirs)
        {
            int dx = x+dir[0];
            int dy = y+dir[1];
            if(dfs(grid,visited,dx,dy,start+1,word))
            {
                return true;
            }
        }
        visited[x][y] = false; //현재위치 원복복
        return false;
    }





}
















