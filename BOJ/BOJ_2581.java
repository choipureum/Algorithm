import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		boolean [] era =new boolean[10001];
		era[1]=true; //첫번째를 true로 해줘야 된다(밑의 에라스토 체에 걸리지않음)
		//에라스토테니스의 체
		for(int i=2;i<Math.sqrt(10001);i++) {
			for(int j=2;i*j<10001;j++) {
				era[i*j]=true;
			}
		}		
		int min=10001;
		int sum=0;
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		
		for(int i=M;i<=N;i++) {
			if(!era[i]) {				
				sum+=i;
				if(i<=min) {
					min=i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum+"\n"+min);
		}
	}
}
