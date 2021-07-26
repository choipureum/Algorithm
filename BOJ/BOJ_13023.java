package com.company;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static boolean isLine = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrList.get(a).add(b);
            arrList.get(b).add(a);
        }

        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited, false);
            dfs(i, arrList, visited, 1);
            if (isLine) {
                break;
            }
        }

        bw.write((isLine ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start, ArrayList<ArrayList<Integer>> arrList, boolean[] visited, int cnt) {
        if (cnt == 5) {
            isLine = true;
            return;
        }

        visited[start] = true;
        for (int i : arrList.get(start)) {
            if (!visited[i]) {
                dfs(i, arrList, visited, cnt + 1);
            }

            if (isLine) {
                return;
            } 
        }
        visited[start] = false; // 일직선이 아닐 경우, 방문한 지점은 모두 false 처리.
    }

}
