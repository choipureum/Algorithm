import java.io.*;
import java.util.*;

class Main {
    static int n = 3;
    static int m = 3;
    static int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int max =1;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine());   
        n = Integer.parseInt(st.nextToken()); 
        m = Integer.parseInt(st.nextToken()); 
        
        char[][]arr = new char[n][m];
        for(int i=0;i<n;i++){
            String temp = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = temp.charAt(j);
            }
        }
        int[] start ={0,0};
        Set<Character> set = new HashSet<>();
        set.add(arr[0][0]);
        int cnt =1;
        dfs(arr,start, set,cnt);
        System.out.println(max);
    }
    private static void dfs(char[][]arr, int[]start, Set<Character>set,int cnt){
        max = Math.max(max,cnt);     

        for(int[] dir: dirs){
            int nx = start[0] + dir[0];
            int ny = start[1] + dir[1];
            if(nx>=0 && nx<n && ny>=0 && ny<m && !set.contains(arr[nx][ny])){
                set.add(arr[nx][ny]);
                dfs(arr,new int[]{nx,ny},set,cnt+1);
                set.remove(arr[nx][ny]);
            }
        }
    }
}
    

