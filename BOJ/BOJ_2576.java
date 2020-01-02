package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] input =new int[7];
		List <Integer>arr = new ArrayList<>();
		
		for(int i=0;i<7;i++) {
			input[i]=Integer.parseInt(br.readLine());
			if(input[i]%2==1) {
				arr.add(input[i]);
				//홀수일 경우 리스트 arr에 삽입 
			}
		}
		Collections.sort(arr); //정렬 
		if(arr.size()==0) {
			bw.write(-1+"\n");
		}
		else {
			int sum=0;
			for(int i=0;i<arr.size();i++) {
				sum+=arr.get(i);
			}
			bw.write(sum+"\n");
			bw.write(arr.get(0)+"\n");
		}
	  bw.flush();
	  bw.close();
}
}	


