package algo;

import java.util.*;

class Main3 {  
	
	public static int[] solution(int[] progresses, int[] speeds) {	           
	       //계산 배열
	        List <Integer> completeTime = new ArrayList<>();
	        //반환배열
	        List <Integer> completeAnswer = new ArrayList<>();
	        
	        //계산배열 구하기
	        for(int i=0;i<progresses.length;i++) {
	     	    int temp = (100-progresses[i])%speeds[i]==0?(100-progresses[i])/speeds[i]:((100-progresses[i])/speeds[i]+1);	        		        	
	        	completeTime.add(temp);
	        }
	        completeAnswer.add(1);
	        //반환배열 구하기
	        int max=0;
	        for(int i=1;i<completeTime.size();i++) {
	        	max=Math.max(completeTime.get(i-1),max);
	        	
	        	if(completeTime.get(i)<=max) {
	        		completeAnswer.set(completeAnswer.size()-1,completeAnswer.get(completeAnswer.size()-1)+1);
	        	}
	        	else {
	        		completeAnswer.add(1);
	        	}
	        } 
	        int[] answer = new int [completeAnswer.size()];	 
	        
	        for(int i=0;i<completeAnswer.size();i++) {
	        	answer[i]=completeAnswer.get(i);
	        }
   
	        return answer;
	    }
	
	public static void main(String[] args) {
		int [] progresses = {95, 90, 99, 99, 80, 99};
		int [] speeds = {1,1,1,1,1,1};
		System.out.println(Arrays.toString(solution(progresses,speeds)));
	}
	}
	 

