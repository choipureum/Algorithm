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
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //5
        int K = sc.nextInt(); //17
        int[] time = new int[100001];
        int[] parent = new int[100001];

        Arrays.fill(time, -1);
        time[N] = 0;
        q.offer(N);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == K) { //도착
                StringBuilder sb = new StringBuilder();
                System.out.println(time[cur]);
                while (cur != N) {
                    sb.insert(0, cur + " ");
                    cur = parent[cur];
                }
                sb.insert(0, cur + " ");
                System.out.print(sb);
                System.exit(0);
            }
            for (int next : new int[]{cur - 1, cur + 1, cur * 2}) {
                if (next < 0 || next > 100000 || time[next] >= 0) continue;
                time[next] = time[cur] + 1;
                parent[next] = cur;
                q.offer(next);
            }
        }
    }
}
