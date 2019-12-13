package Traning;
import java.util.*;

class Main {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);		  
		  int n=sc.nextInt();
		  int cnt=0;
		
		  for(int i=0;i<n;i++) {
			  int m=sc.nextInt();
			  int [] arr =new int[m];
			  for(int j=0;j<m;j++) {
				  arr[j]=sc.nextInt();				  
			  }
			  for(int j=0;j<m-1;j++) {
				  if(arr[j]>=arr[j+1]) {
					  cnt++;
				  }
			  }
			  System.out.println("Case #"+(i+1)+": "+cnt);
			  
			  
			  cnt=0;
		  }
}
}

/*
 * 4
4
1 4 3 3
5
3 4 6 7 10
4
4 3 2 1
5
4 5 6 1 7
Case #1: 2
Case #2: 0
Case #3: 3
Case #4: 1
 */
