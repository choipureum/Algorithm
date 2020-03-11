import java.util.*;
import java.io.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); //testcase
		
		String [][] arr= new String[n][2];
		
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.next();//나이
			arr[i][1]=sc.next(); //이름
		}
		
		Arrays.sort(arr,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		for(String[] ar: arr) {
			System.out.println(ar[0]+" "+ar[1]);
		}
	}
	
}
