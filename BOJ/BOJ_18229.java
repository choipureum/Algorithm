package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()); //토큰화 
        int N=Integer.parseInt(st.nextToken()); //사람수 
        int M=Integer.parseInt(st.nextToken()); //시도횟수 
        int K=Integer.parseInt(st.nextToken()); //거리        
        int [][] arr =new int[N][M]; //다중배열 생성 
        int [] sum= new int[N]; //합계 저장 배열 
        //배열 담기 
        for(int i=0;i<N;i++) {
        	StringTokenizer token=new StringTokenizer(br.readLine());
        	for(int j=0;j<M;j++) {
        		arr[i][j]=Integer.parseInt(token.nextToken());
        	}
        }    
        out: for(int i=0;i<M;i++) {
        	for(int j=0;j<N;j++) {
        		sum[j]+=arr[j][i];
        		if(sum[j]>=K) {        			
        			 System.out.println((j+1)+" "+(i+1));
        			 break out;
        		}
        	}
        }
       
	}
}