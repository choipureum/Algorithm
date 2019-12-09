package Traning;

import java.util.*;

public class Bakjoon {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			String com = sc.next();
			int b = sc.nextInt();

			if (a == 0 && b == 0 && "W".equals(com))
				break;
			System.out.println("W".equals(com) ? (a - b < -200 ? "Not allowed" : a - b) : a + b);
		}
	}
}




	
	    

/*

 */
 