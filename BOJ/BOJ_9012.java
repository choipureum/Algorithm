import java.util.*;
import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
       int n =Integer.parseInt(br.readLine()); //input testcase
       
       while(n-->0) { //n에서 0까지
    	   Stack<Character> stack =new Stack<>(); //스택 선언
    	   String ps = br.readLine(); //괄호문자열받기
    	   int sw=0;
    	   char temp;
    	   // 괄호 하나씩 vps판단하기
    	   for(int j=0;j<ps.length();j++) 
    	   {
	    	   temp=ps.charAt(j);
	    	   if(temp=='(') {
		    		stack.push(temp);	    			   
	    	   }
	    	   else { //')'일때
	    		   if(!stack.isEmpty()) {
	    			   stack.pop();
	    		   }
	    		   else {
	    			   sw=1;
	    			   break;
	    		   }	    		
	    	   }
    	   }
    	   if(!stack.isEmpty()) {sw=1;}
    	   if(sw==0) {
    		   System.out.println("YES");	   		     		   
    	   }
    	   else {
    		   System.out.println("NO");    		 
    	   }
    	   stack.clear();	
	     }
   }//method end
}//class end
