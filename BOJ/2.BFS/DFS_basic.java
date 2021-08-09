// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/3ee3d9284f2e4fd7b92b2a22e17d02d6

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
    static int [] check=new int[100001];
    static int res = Integer.MAX_VALUE; // 결과값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if(N==K)res=0;
        else
        {
            bfs();
        }
        System.out.println(res);
    }
    public static void bfs()
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(N);
        check[N]=1;
        while(!q.isEmpty())
        {
            int now = q.poll();

            for(int i=0;i<3;i++)
            {
                int next=0;
                if (i == 0) {
                    next = now + 1;
                } else if (i == 1) {
                    next = now - 1;
                } else {
                    next = now * 2;
                }

                if (next == K) {
                    res = check[now];
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    q.add(next);
                    check[next] = check[now] + 1;
                }
            }
        }
    }
}

