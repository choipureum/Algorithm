package mainproject;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    String input;
    int [] arr =new int[N];  //스택 저장소 
    int top=-1; //정수가 없는경우 -1이므로 
    
    for(int i=0;i<N;i++) {
    	input=sc.next();
    	if(input.equals("push")) {
    		top++;
    		arr[top]=sc.nextInt();   		
    	}
    	//pop일때 
    	else if(input.equals("pop")) {
    		if(top==-1) {System.out.println(-1);}
    		else {
    			System.out.println(arr[top]);
    			top--;	
    	}
    	}
    	//size 출력 
    	else if(input.equals("size")) {
    		System.out.println(top+1);
    	}
    	//empty출력 
    	else if(input.equals("empty")) {
    		if(top==-1)  {System.out.println(1);}
    		else { System.out.println(0);}}
    	//top출력 
    	else if	(input.equals("top")) {
    		if(top==-1) {System.out.println(-1);}
    		else {
    			System.out.println(arr[top]);
    		}
    	}   			
    	}
    }     
  }

  
/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */