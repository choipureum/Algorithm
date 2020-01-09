package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n= Integer.parseInt(br.readLine());
        int cnt=n;
        while(cnt!=0) {
            StringTokenizer st = new StringTokenizer(br.readLine());        
            int H=Integer.parseInt(st.nextToken());
            int W=Integer.parseInt(st.nextToken());
            char [][] arr= new char[H][W];
            for(int i=0;i<H;i++) {
                String temp=br.readLine();
                for(int j=0;j<W;j++) {
                    arr[i][j]=temp.charAt(j);
            }
        }
            for(int i=0;i<H;i++) {
                for(int j=W-1;j>=0;j--) {
                    System.out.print(arr[i][j]);
                }
                System.out.print("\n");
            }
            cnt--;
            
        }
}
}