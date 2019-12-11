package Traning;
import java.util.*;


class Solution {
	  public String solution(int a, int b) {
	         String answer ="";	   
		     int [] temp = {31,29,31,30,31,30,31,31,30,31,30,31};
		     int sum=0;
		     for(int i=0;i<a-1;i++) {
		    	 sum+=temp[i];	    	 
		     }sum+=b;
		     int sw=sum%7;
		     System.out.println(sw);
		     switch(sw) {
		     	case 1:
		     		answer="FRI";
		     		break;
		     	case 2:
		     		answer="SAT";
		     		break;
		     	case 3:
		     		answer="SUN";
		     		break;
		     	case 4:
		     		answer="MON";
		     		break;
		     	case 5:
		     		answer="TUE";
		     		break;
		     	case 6:
		     		answer="WED";
		     		break;
		     	case 0:
		     		answer="THU";	
		     		break;    
		     }
		     return answer;
		  }
		}