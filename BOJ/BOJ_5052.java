import java.util.*;
import java.io.*;

//시간줄이기????????????

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //문자스트림
		int n = Integer.parseInt(br.readLine()); //testcase개수
		
		for(int i=0;i<n;i++) {
			int t = Integer.parseInt(br.readLine()); //개수 전화번호
			String  [] arr= new String[t];
			int sw=0; //yes,no 판별기준 스위치			
			for(int j=0;j<t;j++) {
				arr[j]=br.readLine();
			}//배열완성 
			//정렬과 스위치 구현
			Arrays.sort(arr, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);					
				}
			}); //사전순으로 정렬
			
			for(int j=1;j<t;j++) {
				if(arr[j].startsWith(arr[j-1])) {
					sw=1;
					break;
				}
			}
			System.out.println(sw==0?"YES":"NO");
		}
	}
}

