import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //경기수
		int M = Integer.parseInt(st.nextToken()); //위원수
		int [] match =new int [N];
		int [] person =new int [M];
		int [] result =new int[N];
		int max=0; int cnt=0;
		//리그 입력값 받기
		for(int i=0;i<N;i++) {
			match[i]=Integer.parseInt(br.readLine());
			result[i]=0;
		}
		//위원 입력값 받기
		for(int i=0;i<M;i++) {
			person[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<M;i++) { //위원
			out: for(int j=0;j<N;j++) { //리그점수
				if(match[j]<=person[i]) {
					result[j]++;
					break out;
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			if(result[i]>max) {
				max=result[i];
				cnt=i+1;
			}
		}
		System.out.println(cnt);
	}

}
