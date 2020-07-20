package algo;
import java.util.*;
import java.io.*;

public class Main {		
	 public static int[] solution(int n, String[] words) {
	     int[] answer = new int[2];
	    // 인원수별 2차원 배열
	     List <String> arr = new ArrayList<>();
	     int idx=-1;
	     
	     for(int i=0;i<words.length;i++) {	
	    	 if(i==0) {
	    		 arr.add(words[i]);
	    		 continue;	    		 
	    	 }
	    	 //앞단어와 다를때
	    	 if((words[i-1].charAt(words[i-1].length()-1))!=words[i].charAt(0)) {
	    		 idx=i;
	    		 break;
	    	 }
	    	 //포함하고있을때
	    	 if(arr.contains(words[i])) {
	    		 idx=i;
	    		 break;
	    	 }
	     	 arr.add(words[i]);	    	 
	     }
	     if(idx!=-1) {
	    	 answer[0]=((idx)%n)+1;
			 answer[1]=((idx)/n)+1;
	     }else if(idx==-1) {
	    	 answer[0]=0;
	    	 answer[1]=0;
	     }
	     	    
	     return answer;
	    }
	
	//문제풀이용 예시
	public static void main(String[] args) {
		int n=3;
		String [] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toString(solution(n,words)));
	}
}



