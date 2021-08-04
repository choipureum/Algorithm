package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;
    int cnt; // 벽을 부순 개수

    Point(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }

    @Override
    public int compareTo(Point o) {
        return cnt - o.cnt;
    }
}
public class Main {
    //dfs
    static int [][] graph;
    static boolean [][] visited;
    static int[][] dirs ={{0,1},{1,0},{-1,0},{0,-1}};
    static int res; //최소값
    static int n,m;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); //4 2
        m = Integer.parseInt(st.nextToken()); //2
        n = Integer.parseInt(st.nextToken()); //4

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++)
        {
            String tmp = br.readLine();
            for(int j=0;j<m;j++)
            {
                graph[i][j] = Integer.parseInt(String.valueOf(tmp.charAt(j)));
            }
        }
        //print(graph);
        res = BFS(0,0);

        bw.write(res+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
    public static int BFS(int x, int y) {
        // 벽을 부순 개수를 오름차순으로 정렬하도록 설정.
        PriorityQueue<Point> q = new PriorityQueue<>();

        q.offer(new Point(x, y, 0));
        visited = new boolean[n][m];
        visited[x][y] = true;

        int dx, dy;

        while (!q.isEmpty()) {
            Point p = q.poll();

            // 도착점에 도달했으면 종료.
            if (p.x == n-1 && p.y == m-1) {
                return p.cnt;
            }

            for (int[] dir : dirs) {
                dx = p.x + dir[0];
                dy = p.y + dir[1];

                if (dx < 0 || dy < 0 || dx >= n || dy >= m) {
                    continue;
                }
                // 벽을 부수지 않는 경우
                if (!visited[dx][dy] && graph[dx][dy] == 0) {
                    visited[dx][dy] = true;
                    q.offer(new Point(dx, dy, p.cnt));
                }
                //벽을 부수는 경우
                if (!visited[dx][dy] && graph[dx][dy] == 1) {
                    visited[dx][dy] = true;
                    q.offer(new Point(dx, dy, p.cnt + 1));
                }
            }
        }
        return 0;
    }
}
