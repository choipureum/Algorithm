package Traning;


import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int n=Integer.parseInt(br.readLine()); //사람수 입력 
		int [][]arr=new int[n][3]; //다중배열 생성 
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}//배열에 값 입력받기 
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				int sw=0;  //스위치 
				for(int k=0;k<n;k++) {
					if(i!=k && arr[i][j]==arr[k][j]) {
						arr[k][j]=0;
						sw=1;
					}
				}
				if(sw==1) {arr[i][j]=0;}
			}
			bw.write((arr[i][0] + arr[i][1] + arr[i][2]) + "\n");			
		}

		bw.flush();
	}
}
