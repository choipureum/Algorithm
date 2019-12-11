package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  String input=sc.next();
		  int cnt1=0;
		  int cnt2=0;
		  
		  for(int i=0;i<input.length()-2;i++) {
			  switch(input.charAt(i)) {
			  	case 'J':
				  if(input.charAt(i+1)=='O'&&input.charAt(i+2)=='I') {
					  cnt1++;
					  break;
				  }
			  	case 'I':
					  if(input.charAt(i+1)=='O'&&input.charAt(i+2)=='I') {
						  cnt2++;
					  }			
			  					  	
			  		
			  }
		  }
		  System.out.println(cnt1);System.out.println(cnt2);
		  }
		  }
		