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
		int [][]arr=new int [n][2];	
		
		for(int i=0;i<n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken()); //x축 
			arr[i][1]=Integer.parseInt(st.nextToken()); //y축 
		}
		Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if(x[1]==y[1]){
                    return Integer.compare(x[0], y[0]);
                }
                return Integer.compare(x[1], y[1]);
            }
        });
	    for(int i=0;i<n;i++) {
	    	bw.write(arr[i][0]+" "+arr[i][1]+"\n");
	    }
	    bw.flush();
	    bw.close();
	}
}