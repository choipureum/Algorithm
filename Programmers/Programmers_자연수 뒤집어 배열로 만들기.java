package Traning;
import java.util.*;

class Solution {
	  public int[] solution(long n) {
	        int temp =0;
	        String str= String.valueOf(n);
	        int []answer = new int[str.length()+0];
	        for(int i=0;i<str.length();i++) {       	      	
	            answer[i]=(int)(n%10);
	            n/=10;                           
	    	    }
	     
	        
	        
	    	return answer;
	    }
	}