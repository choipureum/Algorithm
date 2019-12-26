package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        try {
        List <Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++) {
        	arr.add(Integer.parseInt(br.readLine())); //정수입력 
        }
       Collections.sort(arr);
       for(int i=0;i<n;i++) {
    	  bw.write(arr.get(i)+"\n");
       }
       bw.flush();
       bw.close();
        } catch(Exception e) {
        	//TODO: handle exception
        	e.printStackTrace();
        }
	}
}