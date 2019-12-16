import java.util.*;

public class HelloWolrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int cnt=1;
		
		for(int i=0;i<n;i++) {
			int input=sc.nextInt();
			switch(input) {
				case 0:
					cnt=1;
					break;
				case 1:
					sum+=cnt;
					cnt++;					
			}	
			
		}
		System.out.println(sum);
	}

}
