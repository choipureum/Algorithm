package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [][] arr=new int[9][9];
		int max=0;int x=0; int y=0;
	    for(int i=0;i<9;i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int j=0;j<9;j++) {
	    		arr[i][j]=Integer.parseInt(st.nextToken());
	    		if(arr[i][j]>max) {
	    			max=arr[i][j];
	    				x=i+1;
	    				y=j+1;
	    				
	    		}
	    	}
	    }
	    System.out.println(max);
		 System.out.println(x+" "+y);

	  
}
}	


