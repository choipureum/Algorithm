package algo;
import java.util.*;
import java.io.*;

public class Main {		
	 public static String[] solution(String[] record) {		 
		 HashMap<String, String>map = new HashMap<String, String>();
		 int count=0;
		 
		 for(int i=0;i<record.length;i++) {
			 String [] arr = record[i].split(" "); 
			 
			 if(arr[0].equals("Enter")) {
				 map.put(arr[1], arr[2]);
				 count++;
			 }
			 else if(arr[0].equals("Leave")) {				
				 count++;
			 }
			 else if(arr[0].equals("Change")) {
				 map.put(arr[1] ,arr[2]);
			 }
		 }
		 int cnt=0;
		 String[] answer = new String[count];
		 
		 for(int i=0;i<record.length;i++) {
			 String [] arr =record[i].split(" "); 
			 
			 if(arr[0].equals("Enter")) {
				 answer[cnt++] = map.get(arr[1])+"님이 들어왔습니다.";
			 }
			 else if(arr[0].equals("Leave")) {
				 answer[cnt++] = map.get(arr[1])+"님이 나갔습니다.";
			 }
		 }
		 
	     return answer;
	    }

	//문제풀이용 예시
	public static void main(String[] args) {
		String [] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
				"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer=solution(record);
		System.out.println(Arrays.toString(answer));
	
	}
}
