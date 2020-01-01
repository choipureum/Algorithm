package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt=0;
		while(true) {
			String input =br.readLine();
			if(input.charAt(0)=='#') {
				break;
			}
			else {				
				for(int i=2;i<input.length();i++) {
					if(input.charAt(i)==input.charAt(0)) {
						cnt++;
					}
				}
			}
			System.out.println(input.charAt(0)+" "+cnt);
			cnt=0;
			}
	  
}
}	


