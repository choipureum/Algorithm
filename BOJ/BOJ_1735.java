import java.util.*;
import java.io.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
			
		StringTokenizer st= new StringTokenizer(br.readLine()); //첫번째 분수
		StringTokenizer st2= new StringTokenizer(br.readLine()); //두번째 분수
		
		int a= Integer.parseInt(st.nextToken()); // 1분자
		int b= Integer.parseInt(st.nextToken()); // 1 분모
		int a2= Integer.parseInt(st2.nextToken()); // 2분자
		int b2= Integer.parseInt(st2.nextToken()); // 2분모
		
		int temp =gb(b,b2); //분모 최소공배수 구하기
		int result =a*(temp/b)+a2*(temp/b2);
		
		System.out.println(result/gcd(temp,result)+" "+temp/gcd(temp,result));
		
		
	}
	public static int  gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public static int gb(int a, int b) {
		return a*b/gcd(a,b);
	}
	
}
