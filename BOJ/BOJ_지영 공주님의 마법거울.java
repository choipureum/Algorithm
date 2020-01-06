package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String [] arr =new String[n];
		for(int i=0;i<n;i++) {
			arr[i]= br.readLine();
		}
		int sw=Integer.parseInt(br.readLine());
		switch(sw) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println(arr[i]);
				}
				break;
			case 2:
				for(int i=0;i<n;i++) {
					for(int j=n-1;j>=0;j++) {
						System.out.print(arr[i].charAt(j));
						if(j==0) {
							System.out.print("\n");
						}
					}
				}
				break;
			case 3:
				for(int i=n-1;i>=0;i--) {
					System.out.println(arr[i]);
				}
			
		}
}
}	


