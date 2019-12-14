package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int [] arr= new int[8];
		  for(int i=0;i<8;i++) {
			  arr[i]=sc.nextInt();//입력 
		  }
		  int [] idx=new int[8];
		  int [] max=new int[5];
		  int cnt=0;
	      for(int i=0;i<8;i++) {
	    	  idx[cnt]=arr[i];
	    	  cnt++;
	      }
	      cnt=0;
	      int sum=0;
	      Arrays.sort(arr);
	      for(int i=3;i<8;i++) {
	    	  max[cnt]=arr[i];
	    	  sum+=max[cnt];
	    	  cnt++;	    	  
	      }
	      System.out.println(sum);
	      for(int i=0;i<8;i++) {
	    	  for(int j=0;j<5;j++) {
	    		  if(idx[i]==max[j]) {
	    			  System.out.print(i+1+" ");
	    		  }
	    	  }
	      }
}
}

