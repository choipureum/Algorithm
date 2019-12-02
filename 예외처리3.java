package github;
import java.util.*;
import java.util.Scanner;

class Main {
	  public static int string_sum(String str) {
		 try {
			 String[] array = new String [20];
			 array=str.split(" ");
			 int sum=0;
			 int[] answer = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();			 			 
			 for(int i=0;i<answer.length;i++) {
				 sum+=answer[i];
			 }
			return sum;	 
		 }
		 catch(NumberFormatException e) {
			 return 0;
		 }	
		}

		public static void main(String[] args) {
			System.out.println(string_sum("100 q 300")); // 0
			System.out.println(string_sum("100 300")); // 400
		}
	}