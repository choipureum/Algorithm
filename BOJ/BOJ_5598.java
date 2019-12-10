package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String input =sc.next();
		 char [] ar =new char[input.length()];
		 
		 for(int i=0;i<input.length();i++) {
			 if(input.charAt(i)-3<'A') {
				 ar[i]= (char)(input.charAt(i)+23);
			 }
			 else {
				 ar[i]=(char)(input.charAt(i)-3);
			 }
		 }
		 for(int i=0;i<input.length();i++) {
			 System.out.print(ar[i]);
		 }
		 }
	}


		 
			
	  
	

	
