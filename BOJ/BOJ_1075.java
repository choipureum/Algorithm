package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int f=sc.nextInt();
		  
		  int temp=(n/100)*100;
		  while(true) {
			  if(temp%f==0) {
				  int result=temp%100;
				  if(result<10) {
					  System.out.println("0"+result);
					  break;
				  }
				  else {
					  System.out.println(result);
					  break;
				  }
			  }
			  temp++;
		  }
	
		  
}
}

