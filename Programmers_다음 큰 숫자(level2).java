package Traning;
import java.util.*;

class Bakjoon {
  public int solution(int n) {
      int answer =0;        
        //2진수 구하기        
        String k=Integer.toBinaryString(n);
        int cnt=0;      
        //1의 개수구하기 
        	for(int i=0;i<k.length();i++) {
        		if(k.charAt(i)== '1') {       			
        			cnt+=1;         			
        	}        	        		}        
        	//1씩증가시키며 2진수 구하고 1의개수 구한뒤 n과 비교 
         	int n2=n;       	
            while(answer==0) {            	
            	n2+=1;
            	int cnt2=0;
             	String n3 =Integer.toBinaryString(n2); 
             	System.out.println(n3);
            	for(int j=0;j<n3.length();j++) {
            		if(n3.charAt(j)=='1') {
            			cnt2+=1;
            		}          		
            	}
            	if(cnt==cnt2) {
            		answer=n2;                	
            	}       		
                   	
            }
           return answer;
        		}
        	
        }

/*
문제 설명
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한 사항
n은 1,000,000 이하의 자연수 입니다. */
 