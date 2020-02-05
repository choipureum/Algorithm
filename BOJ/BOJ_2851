import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int result=0;
		int [] arr=new int[10];
		for(int i=0;i<10;i++) {
			int temp=sc.nextInt();
				if(i==0 &&temp>=100) {
					result=temp;
					break;
				}
				else {
					sum+=temp;
					arr[i]=sum;
									
					if(sum>100) {
						if(Math.abs(arr[i-1]-100)<Math.abs(arr[i]-100)){
							result=arr[i-1];
							break;
						}
						else if(Math.abs(arr[i-1]-100)>=Math.abs(arr[i]-100)) {
							result=arr[i];
							break;
						}
						
					}					
				}
				}
		if(sum<100&&result==0) {result=sum;}
		System.out.println(result);
	}
}
