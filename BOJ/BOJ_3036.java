import java.util.*;
import java.io.*;


public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine()); // circle num
		
		StringTokenizer st= new StringTokenizer(br.readLine()); 
		int circle = Integer.parseInt(st.nextToken()); //first circle
		
		for(int i=0;i<n-1;i++) {
			int tmp = Integer.parseInt(st.nextToken()); //nextcircle
			System.out.println(circle/gcd(circle,tmp)+"/"+tmp/gcd(circle,tmp));
		}
	}
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
