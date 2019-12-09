package Traning;

import java.util.*;

public class Bakjoon {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int input=1000-sc.nextInt();		
		int coin=500;
		int cnt=0;
		int sw=0;

		for(int i=0;i<6;i++) {
			if(input>=coin) {
				cnt+=input/coin;				
				input=input%coin;		
				
			}
			if(sw==0) {coin/=5;sw=1;}
			else if(sw==1) {coin/=2;sw=0;}
			
		}
		System.out.println(cnt);
	}
}




	
	    

/*

 */
 