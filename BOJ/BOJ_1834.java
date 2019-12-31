package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    Long n=Long.parseLong(br.readLine());
	    Long sum=(long) 0;
	    for(long i=1;i<n;i++) { 
	    	sum += (n+1)*i; 
	    	}
	    bw.write(sum+"\n");
	    bw.flush();
	    bw.close(); 
}
}	


