package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); //정수입력 
        int [][] arr =new int [n][2];
        int [] ranking  =new int[n];
       
        for(int i=0;i<n;i++) {
        	StringTokenizer st= new StringTokenizer(br.readLine());
        	ranking[i]=1;
        	arr[i][0]=Integer.parseInt(st.nextToken());
        	arr[i][1]=Integer.parseInt(st.nextToken());
        }//다중배열에 정보 입력 + 랭킹 1로 통일화 
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
        			ranking[i]++;
        		}
        	}
        }
        for(int i=0;i<n;i++) {
        	bw.write(ranking[i]+" ");
        }
        bw.flush();
        bw.close();
	}
}