package Traning;
import java.util.*;

class Main {  
	 public static void main(String[] args) {         
		Scanner sc =new Scanner(System.in);
		 int [] arr =new int [26];		  
	     String temp=sc.next();
	     int cnt=-1;
	     for(char i='a';i<='z';i++) {
	    	cnt++;
	    	for(int j=0;j<temp.length();j++) {
	    		if(i==(char)temp.charAt(j)) {
	    			arr[cnt]++;
	    		}
	    	}
	    }
	    for(int i=0;i<26;i++) {
			   System.out.print(arr[i]+" ");
		   }
	   }
	
    }   
    