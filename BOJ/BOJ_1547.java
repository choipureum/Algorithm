package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int n=Integer.parseInt(br.readLine());
	    int ball =1;
	    for(int i=0;i<n;i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int a=Integer.parseInt(st.nextToken());
	    	int b=Integer.parseInt(st.nextToken());
	    	if(a==ball || b==ball) {
	    		ball = b!=ball?b:a;
	    	}
	    }
		bw.write(ball+"\n");
		bw.flush();
		bw.close();
}
}	


