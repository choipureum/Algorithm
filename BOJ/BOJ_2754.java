package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input =br.readLine();
		double result =0;
		switch(input) {
			case "A+":
				result=4.3; break;
			case "A0":
				result=4.0;break;
			case "A-":
				result=3.7;break;
			case "B+":
				result=3.3;break;
			case "B0":
				result=3.0;break;
			case "B-":
				result=2.7;break;
			case "C+":
				result=2.3;break;
			case "C0":
				result=2.0;break;
			case "C-":
				result=1.7;break;
			case "D+":
				result=1.3;break;
			case "D0":
				result=1.0;break;
			case "D-":
				result=0.7;break;
			case "F":
				result=0.0;
				
		}
			System.out.println(result);
		}
		
		
		
}

/*
A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7
 */