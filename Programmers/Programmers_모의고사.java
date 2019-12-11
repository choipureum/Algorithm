package Traning;
import java.util.*;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List <Integer> list =new ArrayList<>();
			
		int[] n1= {1,2,3,4,5};
		int[] n2= {2, 1, 2, 3, 2, 4, 2, 5};
		int[] n3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};	
		int a1 = 0;
		int a2=0;
		int a3=0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==n1[i%5]) {
				a1+=1;
			}
			if(answers[i]==n2[i%8]) {
				a2+=1;
			}
			if(answers[i]==n3[i%10]) {
				a3+=1;
			}
		}
		int [] results= {a1,a2,a3};
		int max=results[0];
		for(int j=0;j<results.length;j++) {
			if(results[j]>max) {
				max=results[j];
			}
		}
		for(int k=0;k<results.length;k++) {
			if(max==results[k]) {
				list.add(k+1);
			}
		}
		int [] answer =new int [list.size()];
		for(int h=0;h<list.size();h++) {
			answer[h]=list.get(h);
		}
		
		return answer;
}
}

		 
			
	  
	

	
