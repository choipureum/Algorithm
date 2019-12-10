package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int result=a;
	
		 outline: while(true) {
			
				 String temp=sc.next();
				 if(temp.contentEquals("=")) {
					 break outline;
				 }
				 int b=sc.nextInt();
				
				 if(temp.contentEquals("/")){ result=result/b;} 
				 if(temp.contentEquals("+")){ result=result+b;} 
				 if(temp.contentEquals("-")){ result=result-b;} 
				 if(temp.contentEquals("*")){ result=result*b;} 
					 
				 }
		     
			System.out.println(result);
				 }
			 }

		 
			
	  
	

	
