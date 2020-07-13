package algo;
import java.util.*;
import java.io.*;

public class Main {	
	
	    public static String solution(int[] numbers, String hand) {
	    	StringBuffer answer = new StringBuffer();
	    	int left=10;
	    	int right=12;
	    	
	    	out:for(int i=0;i<numbers.length;i++) {
	    		if(numbers[i]==0)numbers[i]=11;
	    		//왼쪽부분 걸렸을 때
	    		if(numbers[i]==1 ||numbers[i]==4 || numbers[i]==7) {
	    			answer.append("L");
	    			left=numbers[i];
	    		}
	    		//오른쪽
	    		else if(numbers[i]==3 ||numbers[i]==6 || numbers[i]==9) {
	    			answer.append("R");
	    			right=numbers[i];
	    		}
	    		else {
	    			//2,5,8,0일때
	    			int [] leftFinger = {(left/3) ,(left%3)};
	    			int [] rightFinger = {(right/3),(right%3)};
	    			int [] checkFinger = {(numbers[i]/3),(numbers[i]%3)};
	    		
	    			if(rightFinger[1]==0) {
	    				rightFinger[0]=rightFinger[0]-1;
	    				rightFinger[1]=3;
	    			}
	    			if(checkFinger[1]==0) {
	    				checkFinger[0]=checkFinger[0]-1;
	    				checkFinger[1]=3;
	    			}
	    							    			
	    				    			
	    			int ll=Math.abs(leftFinger[1]-checkFinger[1]);
	    			int rr=Math.abs(rightFinger[1]-checkFinger[1]);
	    			
	    			
	    			int leftChk=Math.abs(leftFinger[0]-checkFinger[0])+ll;
	    			int rightChk=Math.abs(rightFinger[0]-checkFinger[0])+rr;
	    			
	    			if(leftChk>rightChk) {
	    				answer.append("R");
	    				right=numbers[i];
	    			}
	    			else if(leftChk<rightChk) {
	    				answer.append("L");
	    				left=numbers[i];
	    			}
	    			//같을경우
	    			else {
	    				if(hand.equals("left")) {
	    					answer.append("L");
	    					left=numbers[i];
	    				}
	    				else if(hand.equals("right")){
	    					answer.append("R");
	    					right=numbers[i];
	    				}
	    			}	    				    		
	    		}	
	    		System.out.println(left+" "+right);
	    	}
	        return answer.toString();
	        
	        
	    }

	public static void main(String[] args) {
		int [] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand="left";
		String answer  =solution(numbers,hand);
		System.out.println(answer);
	}
}
