import java.util.*;
public class HelloWolrd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y_basic=sc.nextInt();
		int y_upper=sc.nextInt();
		int y_pluspee=sc.nextInt();
		int p=sc.nextInt();
		int second=0;
		int first=x*p;
		if(p>y_upper) {
			second=y_basic+(p-y_upper)*y_pluspee;
		}
		else {
		    second=y_basic;
		}
		
		System.out.println(first<second?first:second);
		
	}
}
