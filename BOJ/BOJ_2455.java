package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int sum=0; int max=0;
		  for(int i=0;i<4;i++) {
			  int out=sc.nextInt();
			  int in=sc.nextInt();
			  sum=in-out+sum;
			  if(sum>max) max=sum;
			 			  
	  }
		  System.out.println(max);
}
}

