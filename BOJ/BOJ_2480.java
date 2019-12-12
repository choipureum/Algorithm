package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);		  
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  int [] arr= {a,b,c};
		  int result=0;
		  int cnt=0;
		  Arrays.sort(arr);
		  for(int i=0;i<3;i++) {
			  if(arr[0]==arr[i]) {
				  cnt=arr[0];
			  }
			  else {
				  cnt=arr[1];
			  }
		  }
		  
		  if(arr[0]==arr[1]&&arr[0]==arr[2]) {
			  result=10000+arr[0]*1000;
		  }
		  else {
			  if(arr[0]!=arr[1]&&arr[0]!=arr[2]) {
				  result=arr[2]*100;
			  }
			  else {
				  result=1000+cnt*100;
			  }
		  }
	  System.out.println(result);
}
}