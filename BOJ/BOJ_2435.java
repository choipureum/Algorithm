import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st =new StringTokenizer(br.readLine()); //토큰화
		int n=Integer.parseInt(st.nextToken()); //testcase 개수
		int k=Integer.parseInt(st.nextToken()); //연속된 날의 수
		
		//최댓값과 합 임시 변수
		int max=-101;
		int sum=0;
		int [] arr=new int [n];
		StringTokenizer st2 =new StringTokenizer(br.readLine()); //토큰화
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st2.nextToken());
		}
		for(int i=0;i<=n-k;i++) {
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
			}
			if(sum>=max) {
				max=sum;
			}
			sum=0;
		}
		
		System.out.println(max);
		
	}
}
