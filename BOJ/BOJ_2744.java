package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input= br.readLine();
		char [] arr;
		arr=input.toCharArray();
		 for(int i=0; i<arr.length; ++i){
	        if(65<=arr[i] && arr[i]<=90){
	            arr[i]=(char)(arr[i]+32);
	            continue;
	            }
	        if (97<=arr[i] && arr[i]<=122){
	            arr[i]=(char)(arr[i]-32);
	            continue;
	            }
	            }
	       
	    System.out.print(arr);
			
}
}	


