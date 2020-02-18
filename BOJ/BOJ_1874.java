import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); //경우의 수 
		int [] arr =new int[n];
		int num=1;
		boolean flag =true;
		Stack<Integer>stack =new Stack<>();//스택선언
		List<Character>list =new ArrayList<>();
		for(int i=0;i<n;i++) { //입력
			arr[i]=Integer.parseInt(br.readLine()); //[4,3,6,8...]
			
			if(flag) {
				if(arr[i]>=num) {
					while(arr[i]>=num) {
						stack.push(num);
						num++;
						list.add('+');
					}
				}
				if(stack.isEmpty()) {
					flag=false;
					
				}
				else  {
					while(stack.peek()>=arr[i]) {
						stack.pop();
						list.add('-');					
						if(stack.isEmpty()) {
							break;
						}
					}
				}
			}
		}
		if(!flag) {System.out.println("NO");}
		else {
			for(int j=0;j<list.size();j++) {
				System.out.println(list.get(j));
			}
					
		}
		
}
}
