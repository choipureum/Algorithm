import java.util.*;
import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine()); //차량        
       int [] arr= new int[n];
       int sum=0;
       StringTokenizer st=new StringTokenizer(br.readLine());
       for(int i=0;i<n;i++) {  	  
    	   arr[i]=Integer.parseInt(st.nextToken()); 
    	   if(i==0) {
    		   sum+=arr[i];
    		   System.out.print(arr[i]+" ");
    	   }
    	   else {    	   
    		   int temp=(arr[i]*(i+1))-sum;
    		   sum+=temp;
    		   System.out.print(temp+" ");  	   
       }  
   }
}
}
