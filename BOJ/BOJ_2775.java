import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int n=Integer.parseInt(br.readLine()); //testcase
		
		for(int i=0;i<n;i++) {
			int k=Integer.parseInt(br.readLine());
			int N=Integer.parseInt(br.readLine());
			System.out.println(House(k,N));
		}
		
		
	}
	public static int House(int k, int n) {
		int sum=0;
		if(k==1) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}		
		}
		else {
			for(int i=1;i<=n;i++) {							
				sum+=House(k-1,i);
		}	
	}
		return sum;
	}
}
