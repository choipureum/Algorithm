import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(); //3
		int y=sc.nextInt();//편의점 25 //110
		int n=sc.nextInt();
		double [] arr=new double[n+1];
		arr[0]=(double)x/y;		
		for(int i=0;i<n;i++) {
			int x_1=sc.nextInt();
			int y_1=sc.nextInt();
			arr[i+1]=(double)x_1/y_1;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]*1000);
	}
}

