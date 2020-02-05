import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int [] K =new int[10];
		int [] H =new int[10];
		
		for(int i=0;i<20;i++) {
			int temp=Integer.parseInt(br.readLine());
			if(i<10) {
				K[i]=temp;
			}
			else {
				H[i-10]=temp;
			}
		}
		Arrays.sort(K);Arrays.sort(H);
		int sum1=K[9]+K[8]+K[7];
		int sum2=H[9]+H[8]+H[7];
		System.out.println(sum1+" "+sum2);
	}
}
