package algo;
import java.util.*;
import java.io.*;

public class Main {		
	public static String[] solution(String[] strings, int n) {       

		//정렬(
        Arrays.sort(strings,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)>o2.charAt(n)) {
                	return 1;
                }else if(o1.charAt(n)==o2.charAt(n)) {
                	return o1.compareTo(o2);
                }
                else {
                    return -1;
                }
                
            }        
        });

		
		return strings;
	}
	
	//문제풀이용 예시
	public static void main(String[] args) {
		String [] strings = {"abce", "abcd", "cdx"};
		int n=2;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
}

