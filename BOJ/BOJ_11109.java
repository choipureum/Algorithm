import java.util.*;
import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine()); //테스트 케이스 개수
       String result="";
       
       for(int i=0;i<n;i++) {
    	   StringTokenizer st = new StringTokenizer(br.readLine());
           int Time=Integer.parseInt(st.nextToken()); 
           int HowMany=Integer.parseInt(st.nextToken());
           
           int jikTime=Integer.parseInt(st.nextToken());
           int ByungTime=Integer.parseInt(st.nextToken());
           
           double a1 =  Time+(HowMany*ByungTime);//병렬
           double a2 =  HowMany*jikTime; //직렬
           if(a1>a2) {
        	   result="do not parallelize";
           }
           else if(a1<a2) {
        	   result="parallelize";
           }
           else {
        	   result="does not matter";
           }
           System.out.println(result);
       }      
      
 	  }
       
       
   }
