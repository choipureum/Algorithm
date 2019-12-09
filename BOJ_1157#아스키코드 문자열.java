package github;
import java.util.*;


public class Bakjoon_1157_ASCII_CODE_Array_return {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String N=sc.next().toUpperCase();
    	
    		int max = Integer.MIN_VALUE; //최소값으로 홀딩 
    		int cnt =0;
    		int where =-1;
    		int [] arr = new int[26];
    	    
    		//0-25까지 배열에  char값을 빼줘야  해당하는 값을 ++
    		for(int i=0;i<N.length();i++) {
    			char temp =N.charAt(i);
    			arr[temp-'A']++;
    		}
    		//max값 찾
    		for(int i=0;i<arr.length;i++) {
    			if(arr[i]>max) {
    				max=arr[i];
    			}
    		}
    		for(int i=0;i<arr.length;i++) {
    			if(max==arr[i]) {
    				cnt++;where=i;
    			}
    		}if(cnt>1) {
    			System.out.println( "?");
    		}
    		else {
    			System.out.println((char)(where+'A'));
    		}
    		
    	}
    }

