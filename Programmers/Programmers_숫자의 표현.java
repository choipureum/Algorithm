package Traning;
import java.util.*;


class Solution {
	  public int solution(int n) {
	      int answer=0;
	      int temp=0;
			int cnt=1;
	      int range=(n/2)+1;
			if(n>10000){
	             return 0;
	        }
		   else{
			while(cnt<=n) {
			    for(int i=cnt;i<=range;i++) {
			     	temp+=i;		     	
			    	if(temp==n) {  
					    answer+=1;
					    break;
					    
				}
					
				
			}   temp=0;
			    cnt+=1;
			
		}
			return answer+1;
	       }
	  }
	}