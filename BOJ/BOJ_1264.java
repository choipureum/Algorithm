package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char [] vowels = {'a','e','i','o','u'};
		while(true) {
			String n=br.readLine().toLowerCase();
			if(n.equals("#")) {
				break;
			}
			int cnt=0;
			for(int i=0;i<n.length();i++) {
				for(int j=0;j<vowels.length;j++) {
					if(n.charAt(i)==vowels[j]) {
						cnt++;
					}
				}
			}
		System.out.println(cnt);
			cnt=0;
		}
		}
		
}
		


