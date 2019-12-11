package Traning;
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

       
        int temp =(int) Math.pow(10,(int) Math.log10(n));
        while(temp!=1) {
        	answer+=(n/temp);          
        	n=n-((n/temp)*temp);
        	temp/=10;
           
            }answer+=n;
        return answer;

        } 

    	    }
