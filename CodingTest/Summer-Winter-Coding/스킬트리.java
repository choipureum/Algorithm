package algo;
import java.util.*;
import java.io.*;

public class Main {		
	 public static int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	        int idx=0;	       
	        
	       //스킬트리 하나씩 가져오기
	    out:for(int i=0;i<skill_trees.length;i++) {
	    		idx=0;	
	    		boolean flag = true;
	    		int temp=0;
	    		// 비교
	    		for(int j=0;j<skill_trees[i].length();j++) {
	    			//스킬과 비교
	    			for(int k=idx;k<skill.length();k++) {
	    				if(skill.charAt(k) == skill_trees[i].charAt(j)){
	                        if(k!=idx){
	                            flag = false;
	                        }else{
	                            idx++;
	                        }

	                    }
	                }
	            }
	            if(flag == true){
	                answer ++;
	            }
	    			}
	    		
	         
	        return answer;
	    }
		 
	 
	//문제풀이용 예시
	public static void main(String[] args) {
		String skill="ABC";
		String [] skill_trees= {"X", "OP", "STU"};
		System.out.println(solution(skill,skill_trees));
		
	}
}

