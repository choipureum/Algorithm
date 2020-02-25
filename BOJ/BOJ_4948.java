import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n =Integer.parseInt(br.readLine());
			if(n==0) {
				break;
			}
			else {
				System.out.println(PrimeNum(n));
			}
		}
		
		
}
	public static int PrimeNum(int n) {
		int answer=0;
		
		out:
		for(int i=n+1;i<=2*n;i++) {
			if(i!=1) {							
				if(i==2) {
					answer++;
				}
				else {
					for(int j=2;j<=Math.sqrt(i);j++) {
						if(i%j==0) {
							continue out;
						}						
					}
					answer++;
				}
			}			
		}		
		return answer;
	}
}
