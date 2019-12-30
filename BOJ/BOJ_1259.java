package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String n=br.readLine();
			if(n.equals("0")) {
				break;
			}
			boolean sw =true;
			for(int i=0;i<n.length()/2;i++) {
				if(n.charAt(i)!=n.charAt(n.length()-i-1)) {
					sw=false;
			}
		}
		System.out.println(sw?"yes":"no");
			
		}
		}
		
}
		


