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
	    int cnt=0;
	    int temp=0;
	    int sum=0;
	    int n_temp=n;
	    while(n!=sum) {
	    	temp++;
	    	if(n_temp<temp) {
	    		temp=0;
	    	}
	    	else {
	    		sum+=temp;
	    		n_temp-=temp;
	    		cnt++;
	    	}	    	
	    }
	   System.out.println(cnt);
}
}	


