package Traning;
import java.util.*;


class Solution {
	  public String solution(String s) {
	      String answer="";
	    	   	String [] temp = s.split(" ");            
	    	   	int min = 99999999;
	    	   	int max = -9999999;
	    	   	for(int i=0; i<temp.length;i++) {
	    	   		if(Integer.parseInt(temp[i])<=min) {
	    	   			min=Integer.parseInt(temp[i]);
	    	   		}
	    	   	}
	    	   	for(int j=0;j<temp.length;j++) {
	    	   		if(Integer.parseInt(temp[j])>max){
	    	   			max=Integer.parseInt(temp[j]);
	    	   		}
	    	   	}
	    	   	answer=min+" "+max;
	    	   	return answer;
	    }
	}