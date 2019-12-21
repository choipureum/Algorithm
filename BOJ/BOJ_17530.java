package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int n=Integer.parseInt(br.readLine()); //사람수 입력 
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int carlos=arr[0];
		boolean sw=false;
		for(int i=1;i<n;i++) {
			if(arr[i]>carlos) {
				sw=true;
			}
		}
		System.out.println(!sw?"S":"N");
	}
}
