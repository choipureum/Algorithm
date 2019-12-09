package Traning;

import java.util.*;

public class Bakjoon {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    String[] yoil = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	    int sum=0;
	    for(int i=0;i<N-1;i++) {
	    	sum+=days[i];
	    }
	    sum+=M;
	    System.out.println(yoil[sum%7]);
	}
}




	
	    

/*

 */
 