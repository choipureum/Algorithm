package algo;

import java.util.Arrays;

class Main {  
   public static void main(String[] args) {
	   String s="AB";
	   String s2="z";
	   String s3="a B z";
	   
	   int n=1;
	   int n2=1;
	   int n3=4;
	   System.out.println(solution(s,n));
	   System.out.println(solution(s2,n2));
	   System.out.println(solution(s3,n3));
   }
   public static String solution(String s, int n) {
	  StringBuilder sb= new  StringBuilder();
	   
	   for(int i=0;i<s.length();i++) {
		   if(s.charAt(i)==' ') {
			   sb.append(' ');
		   }
		   else if(s.charAt(i)+n>122 || s.charAt(i)+n>90 && s.charAt(i)<=90) {
			   sb.append((char)(s.charAt(i)+n-26));
		   }
		   else{
			   sb.append((char)(s.charAt(i)+n));
		   }
	   }
  
       return sb.toString();
   }
}
