package Traning;
import java.util.*;

class Solution {
	  public boolean solution(int x) {
	     	int x_x =x;
	    	   	boolean answer = false;    	   
	    	   	int a = (int)Math.pow(10,(int) Math.log10(x));    	   	
	    	   	int sum =0;
	    	   	int [] arr = new int [a];
	    	    for(int i=0;i<a;i++) {
	    	    	arr[i]=x%10;
	    	    	x=(int)x/10;    	    	
	    	    }   
	    	    for(int j=0;j<a;j++) {
	    	    	sum+=arr[j];
	    	    }
	    	    if(x_x%sum==0) {
	    	    	answer=true;
	    	    }
	    	    return answer;
	    }
	}