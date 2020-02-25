import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int r=Integer.parseInt(br.readLine()); //반지름
		
		System.out.printf("%.6f\n",Math.PI*Math.pow(r, 2));
		System.out.printf("%.6f\n",2.0*Math.pow(r, 2));
	
	}
}
