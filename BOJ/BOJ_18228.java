package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); //얼음개수 
		StringTokenizer st=new StringTokenizer(br.readLine()); //토큰화 
		List<Integer> ar =new ArrayList<>(); // 정수를 담기위한 리스트 선언 
		int temp=0;
		int sum=0;
		int sw=0;
		for(int i=0;i<n;i++) {
			temp=Integer.parseInt(st.nextToken()); //정수 하나씩 받기 
			switch(sw) {
				case 0:
					if(temp!=-1) {
						ar.add(temp);
					}
					else {
						Collections.sort(ar);
						sum+=ar.get(0);
						ar.clear();
						sw=1;
						break;
					}
				case 1:
					ar.add(temp);
					
		}		
		}
		Collections.sort(ar);		
		sum+=ar.get(0);
		System.out.println(sum);
	}
}