package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int n;
    static int [] distance;
    static boolean [] cycle;
    static ArrayList<ArrayList<Integer>> train; //지하철 인접리스트
    static ArrayList<Integer> cycleNode; // 순환선 지하철리스트
    static boolean visited[];
    //static char [][] maze;
    //static int n, m;
    //static int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
    //static boolean [][] visited;

    //bfs(two Dots)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //test Case
        n = Integer.parseInt(br.readLine());
        train = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[n+1];
        cycle = new boolean[n+1];
        distance = new int[n+1];

        //1. 인접리스트 생성
        for(int i=0;i<=n;i++)
        {
            train.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            train.get(node1).add(node2);
            train.get(node2).add(node1);
        }
        //check
        //System.out.println(train);

        //2. cycle 탐색
        for(int i=1;i<=n;i++)
        {
            if(isCycle(-1,i))
            {
                break;
            }
            Arrays.fill(visited,false);
        }
        //System.out.println(train);
        //System.out.println(Arrays.toString(cycle));

        //3. 거리 계산
        bfs();

        for(int i=1;i<=n;i++)
        {
            bw.write(distance[i]+" ");
        }
        bw.flush();
        bw.close();

    }
    //너비우선계산
    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(visited,false);

        for(int i=1;i<=n;i++)
        {
            if(cycle[i])
            {
                visited[i] = true;
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll(); //4

            for (int next : train.get(curr)) //3,6
            {
                if (!visited[next]) {
                    q.offer(next);
                    visited[next] = true;
                    distance[next] = distance[curr] + 1;
                }
            }
        }
    }
    public static boolean isCycle(int prev,int curr)
    {
        visited[curr] = true;

        for(int next : train.get(curr))
        {
            if(prev != next && visited[next])
            {
                cycle[next]= true;
                return true;
            }
            else if(!visited[next])
            {
                if(isCycle(curr,next))
                {
                    if(!cycle[next])
                    {
                        cycle[next]= true;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
