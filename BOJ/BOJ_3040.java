package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] arr =new int[9];
		int sum=0;
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}//입력값 삽입 
		
		out:for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i!=j && sum-arr[i]-arr[j]==100) {
					for(int k=0;k<9;k++) {
						if(k!=i &&k!=j) {
							System.out.println(arr[k]);
						}						
					}
					break out;
				}
			}
		}
}
}	


