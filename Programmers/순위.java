import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [][] matchs = new int[m][2];
		
		for(int i=0;i<m;i++){
			st = new StringTokenizer(br.readLine());
			matchs[i][0] = Integer.parseInt(st.nextToken());
			matchs[i][1] = Integer.parseInt(st.nextToken());
		}
		System.out.println(getClearRankingCount(n,m,matchs));
	}
	
	private static int getClearRankingCount(int n, int m, int [][] matchs){
		Map<Integer, List<Integer>> winRobot = initMatch(n,matchs, 0,1);
		Map<Integer, List<Integer>> loseRobot = initMatch(n,matchs,1,0);
		
		int answer = 0;
		
		for(int i=1;i<=n;i++){
			boolean [] visited = new boolean[n];
			dfs(winRobot,visited,i);
			dfs(loseRobot,visited,i);
			
			int cnt = 0;
			for(int j=0;j<n;j++){
				if(visited[j]){
					cnt++;
				}
			}
			if(cnt == (n-1)) answer++;
		}
		return answer;
	}
	
	private static void dfs(Map<Integer, List<Integer>> map, boolean[] visited, int enemyRobot){
		if(map.get(enemyRobot).isEmpty()) return;
		
		for(int robot: map.get(enemyRobot)){
			if(!visited[robot-1]){
				visited[robot-1] = true;
				dfs(map,visited, robot);
			}
		}
	}
	
	private static Map<Integer, List<Integer>> initMatch(int n, int[][] matchs, int winner, int loser){		
		Map<Integer,List<Integer>> map = new HashMap<>();
		
		for(int i=1;i<=n;i++){
			map.put(i,new ArrayList<>());
		}
		for(int[] match: matchs){
			map.get(match[winner]).add(match[loser]);
		}
		return map;
	}
}
