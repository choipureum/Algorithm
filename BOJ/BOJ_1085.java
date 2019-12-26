package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); //토큰화 
        int x =Integer.parseInt(st.nextToken());
        int y =Integer.parseInt(st.nextToken());
        int w =Integer.parseInt(st.nextToken());
        int h =Integer.parseInt(st.nextToken());        
        
        int fir =(Math.min(x-0, w-x));
        int sec =(Math.min(y-0, h-y));
        bw.write(Math.min(fir, sec)+"\n");
        bw.flush();
        bw.close();
	}
}