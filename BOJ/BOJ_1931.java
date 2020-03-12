import java.util.*;
import java.io.*;


public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine()); //testcase num
		int [][] arr = new int[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		} //입력
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {				
				if(o1[1]==o2[1]) {
					return Integer.compare(o1[0], o2[0]);								
				}	
				return Integer.compare(o1[1], o2[1]);
			}
		});		
		//cnt세주기						
		int end=-1;
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(end<=arr[i][0]) {
				cnt++;
				end=arr[i][1];
			}
		}
		System.out.println(cnt);
		
	}

	
}
