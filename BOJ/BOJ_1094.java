package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] arr = {1,2,4,8,16,32,64};
		int x= Integer.parseInt(br.readLine());
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				result=1;
			}
		}
		if(result==0) {
			int temp=x;
			while(temp!=0) {
				in:for(int j=arr.length-1;j>=0;j--) {
					if(temp>=arr[j]) {
						temp-=arr[j];
						result+=1;
						break in;
					}
				}
			}
		}
		System.out.println(result);
		}
		}
		
		
		


