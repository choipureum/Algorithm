import java.util.*;
import java.io.*;


public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine()); //testcase num
		String [][] arr = new String[n][4];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			arr[i][0]= st.nextToken();  //이름
			arr[i][1]= st.nextToken(); //국어
			arr[i][2]= st.nextToken();  //영어
			arr[i][3]= st.nextToken();  //수학			
		} //입력끝
		
		Arrays.sort(arr,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String []o2) {			
				int a=Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));	
				if(a>0) {return -1;}
				else if(a==0) {
					int b =Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
					if(b<0) {
						return -1;
					}
					else if(b==0) {
						int c =Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
						if(c>0) {
							return -1;						
						}
						else if(c==0) {
							return o1[0].compareTo(o2[0]);
						}
					}
				}
				return 1;
			}
		});
		
		for(int i=0;i<n;i++) {			
			System.out.println(arr[i][0]);			
		} //입력끝
	}

	
}



