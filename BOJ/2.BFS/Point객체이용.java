// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/3ee3d9284f2e4fd7b92b2a22e17d02d6

package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int N; // 세로
    static int K; // 가로
    static boolean[] visited; // 방문 관리
    static int res = Integer.MAX_VALUE; // 결과값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100_001];

        bfs();
        System.out.println(res);
    }
    public static void bfs()
    {
        Queue<Point> q = new LinkedList<Point>();
        q.offer(new Point(N,0));

        while(!q.isEmpty())
        {
            Point p = q.poll();
            visited[p.x] = true; //방문

            if(p.x == K) // 도달
            {
                res = Math.min(res, p.y);
            }

            if(p.x*2 <=100_000 && !visited[p.x*2])
            {
                q.offer(new Point(p.x*2 , p.y));
            }
            if(p.x+1 <=100_000 && !visited[p.x+1])
            {
                q.offer(new Point(p.x+1 , p.y+1));
            }
            if(p.x-1 >=0 && !visited[p.x-1])
            {
                q.offer(new Point(p.x-1 , p.y+1));
            }
        }
    }
}
class Point
{
    int x;
    int y;
    Point(int x,int y)
    {
        this.x =x;
        this.y =y;
    }
}
