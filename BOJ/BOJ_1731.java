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
	    int [] arr= new int [n];
	    int sw=0;
	    for(int i=0;i<n;i++) {
	    	arr[i]=Integer.parseInt(br.readLine());
	    }
	    if((arr[2]-arr[1])==(arr[1]-arr[0])){
	    	sw=1;
	    }
	    int result=0;
	    switch(sw){
	    	case 0:  //등비수열 
	    		result=arr[n-1]*(arr[2]/arr[1]);
	    		break;
	    	case 1:  //등차수열 
	    		result=(arr[2]-arr[1])+arr[n-1];
	    }
	    bw.write(result+"\n");
	    bw.flush();
	    bw.close();
}
}	


