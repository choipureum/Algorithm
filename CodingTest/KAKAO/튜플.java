package algo;
import java.util.*;
import java.io.*;

public class Main {	
	
	public static int[] solution(String s) {
		
		s = s.substring(2, s.length()-2).replace("},{", "-");
		String [] arr = s.split("-");
		
		//정렬(
		Arrays.sort(arr,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}		
		});
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(String temp : arr) {
		    String [] val = temp.split(",");
		    
		    for(int i=0 ; i<val.length ; i++) {
		        int num = Integer.valueOf(val[i]);
		        
		        if(!list.contains(num)) {
		            list.add(num);
		        }
		    }
		}

		int [] answer = new int[list.size()];
		for(int i=0 ; i<list.size() ; i++) {
		    answer[i] = list.get(i);
		}

		return answer;
    }
	    //문제풀이용 예시
	public static void main(String[] args) {
		String temp= "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		int[] answer=solution(temp);
		for(int e:answer) {
			System.out.print(e+" ");
		}
	}
}








