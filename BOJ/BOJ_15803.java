package Traning;


import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		int [][]arr=new int[3][2];
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //토큰화 
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1] =Integer.parseInt(st.nextToken());	//배열 입력 	
		}
		double [] hx= new double[2]; // 기울기 측정 배열선언 
		String result ="";
		//y축이 같을경우 
		if(arr[0][1]==arr[1][1]||arr[0][1]==arr[2][1]||arr[1][1]==arr[2][1]) {
			if(arr[0][1]==arr[1][1] && arr[1][1]==arr[2][1]) {
				result="WHERE IS MY CHICKEN?";
			}
			else {
				result="WINNER WINNER CHICKEN DINNER!";
			}
		}
		//x축이 같을경우 
		else if(arr[0][0]==arr[1][0] ||arr[1][0]==arr[2][0]||arr[0][0]==arr[2][0]) {
			if(arr[0][0]==arr[1][0] && arr[1][0]==arr[2][0]) {
				result="WHERE IS MY CHICKEN?";
			}
			else {
				result="WINNER WINNER CHICKEN DINNER!";
			}
		}
		//모두 다를때 기울기를 배열에 저장 , 같으면 일직선이다 
		else {	
			for(int i=0;i<2;i++) {		
				hx[i]=((double)(arr[i+1][0]-arr[i][0])/(double)(arr[i+1][1]-arr[i][1]))*10/10;
		}
		
		if(hx[0]==hx[1]) {
			result="WHERE IS MY CHICKEN?";
		}
		else {
			result="WINNER WINNER CHICKEN DINNER!";
		}
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}
}
