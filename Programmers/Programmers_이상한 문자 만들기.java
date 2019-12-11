package Traning;
import java.util.*;

class Solution {
	  public String solution(String s) {
	      String answer="";
	      int sw=0;	   
		   String [] list =s.split("");   
		   for(String ss:list) {
			   if(ss.contains(" ")) {
				   sw=0;
	               answer+=ss;
			   }
			   else {
				   
				   if(sw%2==0) {
	                   answer+=ss.toUpperCase();
					   
	                   sw+=1;
				   }
				   else {
					   
					   answer+=ss.toLowerCase();
	                   sw+=1;
					   
				   }
			   }
		   }
		   return answer;
		}
		}