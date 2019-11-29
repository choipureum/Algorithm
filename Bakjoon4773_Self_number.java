package Traning;

public class Bakjoon4773_Self_number {
	 public static void main(String[] args) {
			int limit=10000;
			boolean [] temp=new boolean[limit];
			for(int i=1;i<limit;i++) {
				if(self_number(i)<=limit) {
					temp[self_number(i)-1]=true;
				}
			}
			for(int j=0;j<10000;j++) {
				if(!temp[j]) {
					System.out.println(j+1);
				}
			}
			}

		  public static int self_number(int n) {
			  int total=n;
			  while(n!=0) {
				  total+=n%10;
				  n/=10;
			  }		  
			  return total;
		  }	  
	}
					
		
		
