import java.io.*;
import java.util.*;
// 구르미 숫자 카드 게임
class Main {
    static int n;
    static int m;
    static int[] combi;
    static int answer =0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];

        dfs(0,0,0);
        System.out.println(answer);
    }

    static void dfs(int cnt,int start, int sum){
        if(cnt==m){
            if(sum%n==0){
                answer++;
                
            };
            return;
        }
        else{
            for(int i=start;i<n;i++){
                combi[cnt] = i;
                dfs(cnt+1,i+1,sum+i);
            }
        }
    }
    
    public static boolean isOk(int sum){
        return (sum%n==0);
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
}
