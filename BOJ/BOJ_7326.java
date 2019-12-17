package Traning;
	import java.util.*;
	
	class Main {
		  public static void main(String args[]) {
			  Scanner sc=new Scanner(System.in);
			  int n=sc.nextInt();
			  int temp=0;
			  int sum=0;
			  out:for(int i=0;i<n;i++) {
				  int x=sc.nextInt();
				  int y=sc.nextInt();
				  if(x==y) {
					  sum=0;
					  fir:for(int j=0;j<=x;j++) {
						  	if(x==0) break fir;
						  	if(j%2==1) {							  
							  sum+=1;
						  	}
						  	else if(j%2==0 && j!=0) {
							  sum+=3;
						  	}
				  }				 
				  }
				  if(y==x-2 && x>=2) {
					  sum=2;
					  sec:for(int j=2;j<=x;j++) {
						  	if(x==2) break sec;
						  	if(j%2==1) {							  
							  sum+=1;
						  	}
						  	else if(j%2==0 && j!=2){
							  sum+=3;
						  	}
					  		}	
					        			  
				  			}
				  
				  if(y!=x && y!= x-2) {
					  System.out.println("No Number");
					  continue;
				  }
				  System.out.println(sum);	
			  
			  } 			 
			  sc.close();
		  }
	}
