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
    static int n,m,v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken()); //정점의개수
        int m= Integer.parseInt(st.nextToken()); //간선의개수
        int v= Integer.parseInt(st.nextToken()); //start

        visited = new boolean[n+1];
        arrayList = new ArrayList<>();

        for(int i=1;i<=n+1;i++)
        {
            arrayList.add(new TreeMap<Integer,Integer>());
        }
        Arrays.fill(visited, false);
        for(int i=0;i<m;i++)
        {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList.get(a).put(b,a);
            arrayList.get(b).put(a,b);
        }
        
        dfs(v);
        System.out.println();
        Arrays.fill(visited,false);
        bfs(v);
    }
    public static void dfs(int start)
    {
        visited[start] = true;
        System.out.print(start+" ");
        TreeMap<Integer,Integer>tmp = arrayList.get(start);
        for(int j:tmp.keySet())
        {
            if(!visited[j])
            {
                dfs(j);
            }
        }
    }
    public static void bfs(int start)
    {
        Queue<Integer>q = new LinkedList<Integer>();
        q.offer(start);
        visited[start]= true;

        while(!q.isEmpty())
        {
            int tmp = q.poll();
            System.out.print(tmp+" ");
            TreeMap<Integer,Integer>list = arrayList.get(tmp);

            for(int j:list.keySet())
            {
                if(!visited[j])
                {
                    q.offer(j);
                    visited[j]=true;
                }
            }
        }
    }



}
