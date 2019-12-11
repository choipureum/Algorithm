package Traning;
import java.util.*;
//summer coding /winter coding ~2018 

class Solution {
	  public int solution(int[] d, int budget) {
	      int answer = 0;
	      int sum =0;
		   
		   Arrays.sort(d);	   
		   
		   for(int ss :d) {
			   sum+=ss;
			   answer+=1;
			   if(sum>budget) {
				   answer-=1;			   
				   break;
			   }
			   else if(sum==budget) {
				   
				   break;
			   }
		   }
		  
	    
	      return answer;
	  }
	}