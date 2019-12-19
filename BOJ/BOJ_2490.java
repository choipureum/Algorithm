package Traning;
import java.util.*;

class Main {  
	 public static void main(String[] args) {         
		Scanner sc =new Scanner(System.in);
		int cnt=0;
		String answer="";
        for(int i=0;i<3;i++) {
        	String input =sc.nextLine().replaceAll(" ", "");
        	for(int j=0;j<4;j++) {
        		if(input.charAt(j)=='0') {
        			cnt++;
        		}
        	}
        	switch(cnt) {
        		case 0:
        			answer="E";
        			break;
        		case 1:
        			answer="A";
        			break;
        		case 2:
        			answer="B";
        			break;
        		case 3:
        			answer="C";
        			break;
        		case 4:
        			answer="D";
        	}
        	 System.out.println(answer);
        	 cnt=0;
        }
       
    }   
    } 
