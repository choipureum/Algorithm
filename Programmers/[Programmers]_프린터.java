package algo;
import java.util.*;

class Main {  
   public static void main(String[] args) {
	   int [] priortities = {1, 1, 9, 1, 1, 1};
	   int location =0;
	   System.out.println(solution(priortities,location));
   }
   
   public static int solution(int[] priorities, int location) {
       int answer = 0;
       PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
       int cnt=0;
       for(int e:priorities) {
    	   que.add(e);
       }
       while(!que.isEmpty()) {
    	   for(int i=0;i<priorities.length;i++) {
    		   System.out.println(location+" "+i);
    		   if(que.peek()==priorities[i]) {
    			   que.poll();
    			   answer++;
    			   if(location==i) {
	    			   que.clear();
	    			   break;
    		   }
    	   }
       }
       
   }
       return answer;
   }
}

