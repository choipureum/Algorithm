package cse2019;

import java.util.*;
public class Q3 {	
	public static int getPayroll(String line){
		try {
		StringTokenizer t = new StringTokenizer(line, "|");
		String s = t.nextToken().trim();
		int hours = new Integer(t.nextToken().trim()).intValue();
		int payrate = new Integer(t.nextToken().trim()).intValue();		
		if(s==null) throw new NullPointerException("-1");		
		return hours * payrate;
		}
		catch (NullPointerException e) {
			  return -1;//형식이 null값일때			  
	}
		catch(NoSuchElementException e) {
			return -2;//형식이 맞지 않을때
		}
		catch(NumberFormatException e) {
			return 0;//형식은 맞으나 정수값이 아닌 값을 받았을경우
		}
	}
	public static void main(String[] args) {
		System.out.println(getPayroll("student|2|4")); // 8
		System.out.println(getPayroll(null)); // -1
		System.out.println(getPayroll("abcd")); // -2
		System.out.println(getPayroll("lee|a|b")); // 0
	}
}

/*
		*/