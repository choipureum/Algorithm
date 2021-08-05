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
    static int N;
    static int [] lotto;
    static boolean [] visited;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        while(true)
        {
            //1. ds
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if(N==0)break;
            visited = new boolean[N];
            lotto = new int [N];
            for(int i=0;i<N;i++)
            {
                lotto[i] = Integer.parseInt(st.nextToken());
            }
            //2. dfs
            dfs(0,0);
            System.out.println();
        }
    }
    public static void dfs(int start, int depth)
    {
        if(depth==6)
        {
            for(int i=0;i<N;i++)
            {
                if(visited[i])
                {
                    System.out.print(lotto[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=start;i<N;i++)
        {
            visited[i] = true;
            dfs(i+1,depth+1);
            visited[i] = false;
        }
    }
}
