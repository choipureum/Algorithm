// Authored by : choipureum
// Co-authored by : -
// Link : -

package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    //Unique Path
    //DP
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int m =7, n=3;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m,int n)
    {
        int [][] map = new int[m][n];

        for(int i=0;i<m;i++)
        {
            map[i][0] = 1;
        }
        for(int i=0;i<n;i++)
        {
            map[0][i] = 1;
        }
        //2중
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                map[i][j] = map[i][j-1]+map[i-1][j];
            }
        }
        return map[m-1][n-1];
    }
}
