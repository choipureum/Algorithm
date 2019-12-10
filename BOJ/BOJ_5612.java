package Traning;

import java.util.*;

public class Bakjoon {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    int result=sc.nextInt();
	    int max=result;
	    for(int i=0;i<n;i++) {
	    	int plus=sc.nextInt();
	    	int minus=sc.nextInt();
	    	
	    	result=result+plus-minus;
	    	if(result<0) {max=0;break;}
	        }
	    	if(result>max) {max=result;}
	    System.out.println(max);
	}
}




	
	    

/*

 */
 