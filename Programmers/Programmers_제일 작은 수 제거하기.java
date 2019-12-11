package Traning;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
      
      if(arr.length <=1) {
          return new int[] {-1};
      }
        
        for(int i=0; i<arr.length; i++) {
            arr2.add(arr[i]);
        }
        
        int min = Collections.min(arr2);
        
        int index_of_min = arr2.indexOf(min);
        
        arr2.remove(index_of_min);
        
        
        answer = new int[arr2.size()];
        
        for(int i=0; i<arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }
        
        return answer;
    }
  }
		 
			
	  
	

	
