package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int [][]map;
    static boolean [] visited;
    static ArrayList<TreeMap<Integer,Integer>> arrayList;
    static int n,m;
    static int result=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken()); //정점의개수
        int m= Integer.parseInt(st.nextToken()); //간선의개수

        visited = new boolean[n+1];
        arrayList = new ArrayList<>();

        for(int i=0;i<n+1;i++)
        {
            arrayList.add(new TreeMap<Integer,Integer>());
        }
        for(int i=0;i<m;i++)
        {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList.get(a).put(b,a);
            arrayList.get(b).put(a,b);
        }
        Arrays.fill(visited,false);
        for(int i=1;i<=n;i++)
        {
            if(!visited[i])
            {
                dfs(i,arrayList,visited);
                result++;
            }
        }
        System.out.println(result);
    }
    public static void dfs(int start,ArrayList<TreeMap<Integer,Integer>> arrayList, boolean[] visited)
    {
        visited[start]= true;
        TreeMap<Integer,Integer> tmp = arrayList.get(start);

        for(int i: tmp.keySet())
        {
            if(!visited[i])
            {
                dfs(i,arrayList,visited);
            }
        }
    }



}
