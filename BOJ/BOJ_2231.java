import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int n=Integer.parseInt(br.readLine()); //testcase		
		
		System.out.println(bunhae(n));
		
}
	
	public static int bunhae(int n) {		
		int cnt=0;
		
		while(true) {
			int sum=0;
			cnt++;
			String temp =String.valueOf(cnt);
			for(int i=0;i<temp.length();i++) {
				sum+=temp.charAt(i)-'0';
			}
			sum+=cnt;
			if(sum==n) {
				return cnt;
			}
			if(cnt==n) {				
				return 0;
			}
		}
	}
}
