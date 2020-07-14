package algo;
import java.util.*;
import java.io.*;

public class Main {	
	
	    public static int solution(String dartResult) {	    	
	    	int answer = 0;
	    	//포인트 담아둘 리스트
	    	List <Integer>point =new ArrayList<>();
	    	
	    	for(int i=0;i<dartResult.length();i++) {
	    		char temp=dartResult.charAt(i);
	    		if(temp=='S') {
	    			point.set(point.size()-1, (int) Math.pow(point.get(point.size()-1),1));
	    			continue;
	    		}else if(temp=='D') {
	    			point.set(point.size()-1, (int) Math.pow(point.get(point.size()-1),2));
	    			continue;
	    		}else if(temp=='T') {
	    			point.set(point.size()-1, (int) Math.pow(point.get(point.size()-1),3));
	    			continue;
	    		}
	    		//S,D,T가 아닐때 *,#처리
	    		else if(temp=='*' || temp=='#'){
	    			if(temp=='*') {
	    				int cnt=0;
	    				for(int j=point.size()-1;j>=0;j--) {
	    					point.set(j, point.get(j)*2);
	    					if(cnt==1) {
	    						break;
	    					}
	    					cnt++;	    						    					
	    				}
	    			}
	    			else {
	    				point.set(point.size()-1, point.get(point.size()-1)*(-1));
	    			}
	    		}
	    		//숫자 일때
	    		else {
	    			//10일때
	    			if(point.size()>0&&temp=='0' && point.get(point.size()-1)==1) {
	    				point.set(point.size()-1, 10);
	    			}
	    			//일반 숫자
	    			else {
	    				point.add(temp-'0');
	    			}
	    		}
	    	}
	    	for(int k=0;k<point.size();k++) {
	    		answer+=point.get(k);
	    	}    	
	        return answer;
	        	        
	    }
	    //문제풀이용 예시
	public static void main(String[] args) {
		String dartResult="1D#2S*3S";
		System.out.println(solution(dartResult));
		
	}
}
