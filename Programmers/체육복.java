package algo;

import java.util.Arrays;

class Main {  
   public static void main(String[] args) {
	   int n=10;
	   int [] lost= {3,9,10};
	   int [] reserve= {3,8,9};
	   System.out.println(solution(n,lost,reserve));
   }
   public static int solution(int n, int[] lost, int[] reserve) {
	   
	   int lost_length=lost.length;
	   int reserve_length = reserve.length;
	   Arrays.sort(lost);
	   Arrays.sort(reserve);
	   
	   
	  out:for(int i=0;i<lost.length;i++) {
		   in:for(int j=0;j<reserve.length;j++) {
			   if(lost[i]==reserve[j]) {
				   lost[i]=-1;
				   reserve[j]=-1;
				   lost_length-=1;
				   continue out;				   
			   }		   			
		   }	   	
	   }
	   out:for(int i=0;i<lost.length;i++) {
		   in:for(int j=0;j<reserve.length;j++) {
			   if(lost[i]!=-1 &&Math.abs(lost[i]-reserve[j])==1) {
				   lost[i]=-1;
				   reserve[j]=-1;
				   lost_length-=1;
				   continue out;				   
			   }		   			
		   }	   	
	   }
	   
	   int answer=n-lost_length;
       return answer;
   }
}
