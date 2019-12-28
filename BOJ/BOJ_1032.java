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
		String [] arr= new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine();
		}	
		boolean flag = true;
		for(int i=0;i<arr[0].length();i++) {
			for(int j=1;j<n;j++) {
				if(arr[j].charAt(i)!=arr[j-1].charAt(i)) {
					flag=false;		
					
				}
		}
		
		String temp;
		if (flag==true)
			temp = String.valueOf(arr[0].charAt(i));
		else
			temp = "?";
		flag=true;
		bw.write(temp);
	}
		bw.flush();
		bw.close();
}
}