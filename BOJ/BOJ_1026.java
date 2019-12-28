package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); //length입력 
		int [] A=new int[n];
		int [] B=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {			
			A[i]=Integer.parseInt(st.nextToken());
		}
		StringTokenizer ts = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {			
			B[i]=Integer.parseInt(ts.nextToken());
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int sum=0;
		for(int i=0;i<n;i++) {			
			sum+=A[i]*B[n-i-1];
			
		}
		bw.write(sum+"\n");
		bw.flush();
		bw.close();
	}
}