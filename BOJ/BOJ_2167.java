
import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {        
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		int[][] arr =new int[num1][num2];
		
		//변수 대입
		for(int i=0;i<num1;i++) {
			for(int j=0;j<num2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//변수 대입완료
		int sum=0;
		int n=sc.nextInt();
		for(int k=0;k<n;k++) {
			int i=sc.nextInt();
			int j=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(int p=i-1;p<x;p++) {//0~1  //1~2
				for(int q=j-1;q<y;q++) {//0~2  //1~3
					sum+=arr[p][q];
				}
			}
			System.out.println(sum);
			sum=0;
		}
		
}
}
