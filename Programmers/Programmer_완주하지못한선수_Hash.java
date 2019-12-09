package mainproject;

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
       String answer="";
		
	    HashMap <String,Integer> rr =new HashMap<>();
	    
	    for(String s : participant) {
	    	if(!rr.containsKey(s)) {
	    		rr.put(s, 0);
	    	}
	    	rr.put(s,rr.get(s)+1);
	    }
	    for(String s: completion) {
	    	rr.put(s, rr.get(s)-1);
	    }
	    for(String s: rr.keySet()) {
	    	if(rr.get(s)!=0) {
	    		answer+=s;
	    	}
	    }
        return answer;
	}
}


  

    

 
  
/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */