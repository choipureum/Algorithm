package Traning;
import java.util.*;
//2018 kakao blind recruitment 

class Solution {
	  public String[] solution(int n, int[] arr1, int[] arr2) {
	      String shop1="";
		   String shop2="";
		   String temp="";
		   
		   String [] answer =	new String [n];
		   
		   for(int i=0;i<n;i++) {
			   shop1=Integer.toBinaryString(arr1[i]);
			   shop2=Integer.toBinaryString(arr2[i]);
			   while(shop1.length()!=n) {
				   shop1="0"+shop1;			   
			   }
			   while(shop2.length()!=n) {
				   shop2="0"+shop2;			   
			   }		 
			  
			   for(int j=0;j<n;j++) {
				   if(shop1.charAt(j)=='1'|| shop2.charAt(j)=='1') {				   
					   temp+="#";
					   
				   }
				   else {
					   temp+=' ';
				   }
			   }
			   
			   answer[i]=temp;
			   temp="";
			   
		   }
		   return answer;
		}
		}