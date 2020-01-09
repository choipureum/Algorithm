package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int iter=Integer.parseInt(br.readLine()); // input 
		int fir=2;
		int result=0;
		for(int i=0;i<iter;i++) {			
			fir+=(int) (Math.pow(2, i));					
		}
		System.out.println((int)(Math.pow(fir, 2)));
}
}

