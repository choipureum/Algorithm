package Traning;
import java.util.Scanner;

class Bakjoon {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine().trim();
	    s=s.replaceAll(" ","");//remove space
	    s=s.toLowerCase(); //do all the same
	    
	    boolean flag =true; //true =palindromes false=not palindromes
	    int mid=s.length()/2; //search mid
	    for(int i=0;i<mid;i++) {
	    	if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
	    		flag=false;
	    	}
	    }
	   	System.out.println(!flag?"false":"true");
	  }
	}

/*
Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

Examples of palindromes:
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.

 */
 