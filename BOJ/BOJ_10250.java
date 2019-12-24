package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); //length 
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int H=Integer.parseInt(st.nextToken()); //세로 
				int W=Integer.parseInt(st.nextToken()); //가로 
				int N=Integer.parseInt(st.nextToken()); // 몇번째 손님인가? 
				int H_cnt=0;int W_cnt=1;
				for(int j=0;j<N;j++) {
					H_cnt++;
					if(H_cnt>H) {
						H_cnt=1;
						W_cnt++;
					}				
				}
				System.out.println(W_cnt<10?(H_cnt+"0"+W_cnt):(H_cnt+""+W_cnt));
		}			
	}
}