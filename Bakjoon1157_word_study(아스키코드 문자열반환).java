package Traning;
import java.util.*;

class Bakjoon {
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








/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
 