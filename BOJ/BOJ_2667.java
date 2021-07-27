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
    static int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
    static char [][] maze;
    static boolean [][] visited;
    static int cnt=0;
    static ArrayList<Integer> cntList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        maze = new char [k][k];
        visited = new boolean[k][k];
        cntList = new ArrayList<Integer>();
        m=k;
        n=k;
        if(maze ==null || maze.length==0)
        {
            System.out.println(0);
            return;
        }
        for(int i=0;i<k;i++)
        {
            char [] input = br.readLine().toCharArray();
            for(int j=0;j<k;j++)
            {
                maze[i][j] = input[j];
            }
        }
        int count=0;

        for(int i=0;i<k;i++) {
            for (int j = 0; j < k; j++)
            {
                if(maze[i][j]=='1') {
                    count++;
                    int [] tmp = {i,j};
                    int island =dfs(tmp,0);
                    cntList.add(island);
                }
            }
        }
        System.out.println(count);
        Collections.sort(cntList);
        print(cntList);

    }
    public static int dfs(int[]start,int area)
    {
        //e/c
        if(start[0]>=n || start[1]>=m || start[0]<0|| start[1]<0|| maze[start[0]][start[1]]=='0') return area;

        maze[start[0]][start[1]]='0';

        //2 1인 육지가 들어오는 경우
        area++;
        for(int[] dir : dirs)
        {
            int[] tmp ={dir[0]+start[0],dir[1]+start[1]};
            area = dfs(tmp,area);
        }
        return area;
    }
    //테스트
    public static void print(ArrayList<Integer>cntList)
    {
        int k = cntList.size();
        for(int i=0;i<k;i++)
        {
           System.out.println(cntList.get(i));
        }
    }
}
























