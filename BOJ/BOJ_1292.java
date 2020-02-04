package Practice;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a=Integer.parseInt(st.nextToken()); //첫수시작
		int b=Integer.parseInt(st.nextToken()); //마지막수
		int sum=0;
		int cnt=-1;
		int temp=1;
		for(int i=1;i<=b;i++) {	
			cnt++;
			if(temp==cnt) {
				temp++;
				cnt=0;
			}
			if(i>=a) {
				sum+=temp;
			}
			}			
		System.out.println(sum);
		}
		
		
	}

