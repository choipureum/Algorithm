package Traning;
import java.util.*;
class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {};
      List <Integer> ar = new ArrayList<>();   
	 
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]%divisor ==0) {
    			ar.add(arr[i]);
    		}
    		
    	}
    	if(ar.size()<1) {
    		ar.add(-1);
    	}
    	Collections.sort(ar);
    	answer = new int[ar.size()];
    	for(int j=0;j<ar.size();j++) {
    		answer[j]=ar.get(j);
    	}
    	
    	   return answer;
    }
    }

