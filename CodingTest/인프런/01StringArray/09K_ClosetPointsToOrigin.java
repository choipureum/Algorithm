import java.util.*;

public class K_ClosetPointsToOrigin {
	public static void main(String[] args) {
		int [][] points = {{3,3},{5,-1},{-2,4}};
		int k=2;
		//int [][] points = {{1,3},{2,-2}};
		//int k=1;
		
		int [][] result = solve(points,k);
		print(result);
	}
	public static int[][] solve(int[][] points,int k){
		//1. ds
		Queue<int[]>pq = new PriorityQueue<int[]>((a,b)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
		int [][] result = new int[k][2];
		
		//2. for, while
		for(int []p : points) {
			pq.offer(p);
		}
		int idx = 0;
		while(idx<k) {
			result[idx] = pq.poll();
			idx++;
		}
		return result;
	
	
	}
	public static void print(int [][] result) {
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i][0]+" ");
			System.out.print(result[i][1]);
			System.out.println();
		}
	}
}
