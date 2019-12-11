package Traning;
import java.util.*;

class Solution {
	  public long solution(long n) {
	      long answer = 0;
	      String str = String.valueOf(n);
	      int arr[] = new int[str.length()];
	      String result = "";

	      for(int i=0; i<str.length(); i++){
	          arr[i] = str.charAt(i) - '0';
	      }

	      for(int i=0; i<str.length()-1; i++){
	          for(int j=0; j<str.length()-1; j++){
	              int temp = 0;
	              if(arr[j] < arr[j+1]){
	                  temp = arr[j+1];
	                  arr[j+1] = arr[j];
	                  arr[j] = temp;
	              } 
	          }
	      }

	      for(int i : arr){
	          result += i;
	      }

	      answer = Long.parseLong(result);

	      return answer;
	  }
	}