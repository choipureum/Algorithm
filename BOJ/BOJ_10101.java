package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);		  
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  String temp="";
		  int sum=a+b+c;		  
		  if(sum==180) {
			  if(a==60&&b==60&&c==60) {temp="Equilateral";}
			  else if(a==b || b==c || a==c) {
				  temp="Isosceles";
			  }
			  else {
				  temp="Scalene";
			  }
		  }
		  else{
			  temp="Error";
		  }
		  System.out.println(temp);
		  }
		  }
		