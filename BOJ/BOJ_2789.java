package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] cambridge= {'c','a','m','b','r','i','d','g','e'};
		String input =br.readLine().toLowerCase();
		String result="";
		for(int i=0;i<input.length();i++) {
			int sw=0;
			for(int j=0;j<cambridge.length;j++) {
				if(input.charAt(i)==cambridge[j]) {
					sw=1;					
				}				
			}
			if(sw==0) {
				result+=input.charAt(i);				
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
}
}	


