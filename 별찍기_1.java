package Traning;
import java.util.*;


class Bakjoon {
	 public static void main(String[] args) throws Exception {
		 Scanner sc=new Scanner(System.in);
		 int input=sc.nextInt();
		 int max=(2*input)-1;
		 int first=0;
		 int last=input*2;
		 
		 for(int i=0;i<max;i++) {
			 if(i<input) {
				 first+=1; last-=1;
				 for(int j=0;j<first;j++) {System.out.print("*");}
				 for(int j=first;j<last;j++) {System.out.print(" ");}
				 for(int j=last;j<max+1;j++) {System.out.print("*");}
				 System.out.println();
			 }
			 else {
				 first-=1; last+=1;
				 for(int j=0;j<first;j++) {System.out.print("*");}
				 for(int j=first;j<last;j++) {System.out.print(" ");}
				 for(int j=last;j<max+1;j++) {System.out.print("*");}
				 System.out.println();
			 }
		 }
	 }
}


/*
*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************
******  ******
*****    *****
****      ****
***        ***
**          **
*            *

 */
 