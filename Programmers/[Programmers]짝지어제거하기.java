package algo;
import java.util.*;
import java.io.*;

public class Main {		
	 public static int solution(String s){
	    int answer=0;
	    Stack<Character> stack = new Stack<Character>();	   
	   boolean sw=false;
	   
	   if(s.length()%2==1) {
		   return 0;
	   }
	    stack.add(s.charAt(0));	   
	    
	    
	    for(int i=1;i<s.length();i++) {
	    	stack.add(s.charAt(i));
		    //같을때
		    if(stack.size()>1 &&stack.get(stack.size()-2)==stack.get(stack.size()-1)) {
		    	stack.pop();
		    	stack.pop();
		    	continue;
		    }	    		    	
		   }	  
	    if(stack.size()==0) {
	    	answer=1;
	    	return answer;
	    }
	    int cnt=0;
	    while(true) {	    	
	    	if(stack.get(cnt)==stack.get(cnt+1)) {
		    	stack.pop();
		    	stack.pop();
		    	sw=true;
		    	cnt=0;
		    	continue;
		    }
	    	if(stack.size()==0) {
	    		answer=1;
	    		break;
	    	}	    
	    	if(stack.size()==cnt+2) {
	    		if(!sw) {
		    		break;
		    	}
	    		sw=false;
	    		cnt=0;
	    	}
	    	cnt++;
	    }       	
	    return answer;
	   }
	
	//문제풀이용 예시
	public static void main(String[] args) {
		String s="baabaa";
		String s2="cdcd";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
	}
}



