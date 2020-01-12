package Traning;

//StringTokenizer st = new StringTokenizer(br.readLine());

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n= Integer.parseInt(br.readLine());       
        int sum =0;
        for(int i = 0; i <= n; i++){
            for(int j = i; j <= n; j++){
                sum = sum + i + j;
            }
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
}
}