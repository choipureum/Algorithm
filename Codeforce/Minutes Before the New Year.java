package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); //test case입력 
		int sum=0;
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			sum+=(23-h)*60;
			sum+=60-m;
			System.out.println(sum);
			sum=0;
		}
		
		
}
}