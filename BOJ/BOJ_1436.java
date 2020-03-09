import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int n=Integer.parseInt(br.readLine());
		System.out.println(finalNum(n));
		
		
	}
	public static int finalNum(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			String temp =String.valueOf(cnt);
			if(temp.contains("666")) {
				n--;
			}
		}
		return cnt;
	}
}
