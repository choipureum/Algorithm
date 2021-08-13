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
        Queue<Integer> Q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] dist = new int[100001];
        int[] parent = new int[100001];

        Arrays.fill(dist, -1);
        dist[N] = 0;
        Q.offer(N);
        while (!Q.isEmpty()) {
            int cur = Q.poll();
            if (cur == K) {
                StringBuilder sb = new StringBuilder();
                System.out.println(dist[cur]);
                while (cur != N) {
                    sb.insert(0, cur + " ");
                    cur = parent[cur];
                }
                sb.insert(0, cur + " ");
                System.out.print(sb);
                System.exit(0);
            }
            for (int n : new int[]{cur - 1, cur + 1, cur * 2}) {
                if (n < 0 || n > 100000 || dist[n] >= 0) continue;
                dist[n] = dist[cur] + 1;
                parent[n] = cur;
                Q.offer(n);
            }
        }
    }
}
