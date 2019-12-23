package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Stack<Integer> input =new Stack<>();
		for(int i=0;i<n;i++) {
			int temp=Integer.parseInt(br.readLine());
			if(temp==0&&!input.isEmpty()) {
				input.pop();
			}
			else {
				input.push(temp);
			}			
		}//stack 
		int sum=0;
		while(!input.isEmpty()) {
			sum+=input.pop();
		}
		System.out.println(sum);
		
	}
}