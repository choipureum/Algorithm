package github;
import java.util.*;

class Main {
	  public static int fact(int n) {
			
			try {
			  int answer=1;
			  if(n<0) throw new IllegalArgumentException("Negative numbers cannot be calculated");
			  for(int i=n;i>1;i--) {
				  answer*=n;
				  n=n-1;
			  }
			  return answer;
			} 
			catch (IllegalArgumentException e) {
			  return n;
			}			
		}
		public static void main(String[] args) {
			  System.out.println(fact(5));
			  //120
			  
				System.out.println(fact(-5));
				//Negative numbers cannot be calculated
		    //-5
			}
		}
