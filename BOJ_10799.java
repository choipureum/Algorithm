import java.util.*;
import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String iron = br.readLine(); //쇠막대기 입력
       Stack<Character> stack =new Stack<>(); //스택 선언
       int result=0;
       
       for(int i=0;i<iron.length();i++) {
    	   if(iron.charAt(i)=='(') {
    		   stack.add('(');
    	   }
    	   else { // ) 일때
    		   stack.remove(stack.size()-1); //스택의 최고 길이 -1;
    		   if(iron.charAt(i-1)=='(') { //레이저라는뜻
    			  result+=stack.size();
    		   }
    		   else { //레이저가 아닌 ))일대 ->막대기 길이 플러스
    			   result+=1;
    		   }
    	   }
       }
      
    	   
       
       System.out.println(result);
       
   }
}
