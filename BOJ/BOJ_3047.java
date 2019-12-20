package Traning;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		String order=sc.next();
		for(int i=0;i<3;i++) {
			if(order.charAt(i)=='A') {
				System.out.print(arr[0]+" ");
			}
			else {
				System.out.print(order.charAt(i)=='B'?arr[1]+" ":arr[2]+" ");
			}
		}
	}
}