import java.util.*;
import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine()); //테스트 케이스 개수
       int [] arr = new int[n];
       StringTokenizer st = new StringTokenizer(br.readLine());
       int sum=0;
       //입력1
       for(int i=0;i<n;i++) { 	   
    	 arr[i]=Integer.parseInt(st.nextToken()); //입력받기  
 	  }
       //입력2
       int n2=Integer.parseInt(br.readLine());
       for(int i=0;i<n2;i++) {
    	   StringTokenizer st2 = new StringTokenizer(br.readLine());
    	   int a=Integer.parseInt(st2.nextToken());
    	   int b=Integer.parseInt(st2.nextToken());
    	   for(int j=a-1;j<b;j++) {
    		   sum+=arr[j];
    	   }
    	   System.out.println(sum);
    	   sum=0;
       }
       
       
       
   }
}
