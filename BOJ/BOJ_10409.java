package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int FIFO =Integer.parseInt(st.nextToken());
		StringTokenizer ss = new StringTokenizer(br.readLine());
		int sum=0;

		for(int i=0;i<n;i++) {
			sum+=Integer.parseInt(ss.nextToken());
			if(sum>FIFO) {
				System.out.println(i);
				break;
			}			
		}
		if(sum<=FIFO) {
			System.out.println(n);
		}
}
}


