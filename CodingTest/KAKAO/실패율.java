package algo;

import java.util.Arrays;
import java.util.Comparator;

class Main {  
   public static void main(String[] args) {
	   int n=5;
	   int [] stages= {2, 1, 2, 6, 2, 4, 3, 3};
	   System.out.println(Arrays.toString(solution(n,stages)));
   }
   
   public static int[] solution(int N, int[] stages) {
       int[] answer = new int[N];
       
       double [][]failrate = new double[N][2];
       
       for(int i=0;i<N;i++) {
    	   failrate[i][0]=i+1;   
       }
       
       for(int i=0;i<N;i++) {
    	   int bunja=0;
    	   int bunmo=stages.length;
    	   
    	   for(int j=0;j<stages.length;j++) {
    		   if(stages[j]==failrate[i][0]) {
    			   bunja++;
    		   }else if(stages[j]<failrate[i][0]) {
    			   bunmo--;
    		   }
    	   }//stages loop end//
    	   //bunmo가 0인경우 조심
    	   if(bunmo<=0) {
    		   failrate[i][1]=0;
    	   }else {
    		   failrate[i][1]=(double)bunja/(double)bunmo;    	 
    	   }   	   
       }
       	Arrays.sort(failrate,new Comparator<double[]>() {   	   
    	   @Override
    	   public int compare(double[] o1, double[] o2) {
    		   if(o1[1]<o2[1]) {
    			   return 1;
    		   }
    		   else if(o1[1]==o2[1]) {
    			   return (int) (o1[0]-o2[0]);
    		   }else {
    			   return -1;
    		   }
    		
    	}
	});       
       for(int i=0;i<N;i++) {
    	   answer[i]=(int)failrate[i][0];
       }
       return answer;
   }
}

