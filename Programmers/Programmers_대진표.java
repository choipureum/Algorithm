package mainproject;

import java.io.*;
import java.util.*;
import java.util.stream.*;


class Main {	
	    public static int solution(int n, int a, int b)
	    {
	        int cnt=0;
	        int a_g=0;
	        int b_g=0;
	        while(true) {
	        	cnt++;
	        	a_g=a%2==0?a-1:a+1;
	        	b_g=b%2==0?b-1:b+1;
	        	if(a_g==b && b_g ==a) {	        		
	        		break;
	        	}
	        	a=a%2==0?a/2:a/2+1;
	        	b=b%2==0?b/2:b/2+1;
	        }
	        

	        return cnt;
	    }
	
    public static void main(String args[]) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println(solution(8,4,7)); //3
    }
}
/*

 */