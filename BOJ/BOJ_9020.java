import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//에라스토테네스의 체
		boolean [] era = new boolean[10001];
		//모든 소수 =false 소수가 아닌수 =true
		for(int i=2;i<Math.sqrt(10001);i++) {			
			if(!(era[i])) {
				for(int j=2;i*j<10001;j++) {
					era[i*j]=true;
				}
			}
		}
				
		int n=Integer.parseInt(br.readLine());//test case입력받기
		int cnt;
		for(int i=0;i<n;i++) {
			int temp =Integer.parseInt(br.readLine()); //입력값
			temp/=2;
			cnt=0;
			while(true) {
				if(!(era[temp-cnt])&& !(era[temp+cnt])) {
					System.out.println((temp-cnt)+" "+(temp+cnt));
					break;
				}
				cnt++;
			}			
		}
	
	}
}
