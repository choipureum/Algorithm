import java.util.*;

public class PlusOne {
	public static void main(String[] args) {
		int[] arr = {9,9,9}; // 관건
		int[] arr2= {1,2,3};
		int[] arr3 = {0,0,1};
		int[] arr4 = {2,1,9,9,9};
		
		System.out.println(Arrays.toString(solve(arr)));
		System.out.println(Arrays.toString(solve(arr2)));
		System.out.println(Arrays.toString(solve(arr3)));
		System.out.println(Arrays.toString(solve(arr4)));
	}
	public static int [] solve(int [] digits) {
		//1. ds
		int index = digits.length-1; //맨끝 위치
		int carry = 1;
		
		//2. for,while
		while(index >= 0 && carry>0) {
			digits[index] = (digits[index]+1)%10; //10으로 나눈 나머지 확인 ==0 ->앞자리 carry를 더해줌
			
			if(digits[index]==0) { // 9 ->10
				carry=1;
			}
			else {
				carry=0;
			}
			--index;
		}
		//다 돌고도 carry 가 1인경우
		if(carry==1)
		{
			digits = new int[digits.length+1]; //초기화된값은 0이다
			digits[0]+=carry;
		}
		return digits;
	
	}
	
}
