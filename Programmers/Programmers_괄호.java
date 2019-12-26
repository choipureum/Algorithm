package mainproject;

import java.io.*;
import java.util.*;
import java.util.stream.*;


class Main {
   public static boolean solution(String s) {
        boolean answer = true;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(') {
        		answer= false;
        	}
        	else {       	
        	switch(s.charAt(i)) {
        		case '(':
        			cnt1++;
        			break;
        		case ')':
        			cnt2++;
        			if(cnt1<cnt2) {
        				answer=false;
        			}
        			
        	}       
        }
        }
        if(cnt1!=cnt2){answer=false;}
	    return answer;
	  }
	
    public static void main(String args[]) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println(solution("()()")); //true
    	System.out.println(solution("()())"));
    }
}
/*

 */