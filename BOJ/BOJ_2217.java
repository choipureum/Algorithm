import java.util.*;
import java.io.*;


public class Main {	
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        int cnt = Integer.parseInt(st.nextToken()); //배열 개수
	        int arr[] = new int[cnt];
	        for(int i=0; i < cnt; i++) {
	            st = new StringTokenizer(br.readLine());
	            arr[i] = Integer.parseInt(st.nextToken());
	        }
	        Arrays.sort(arr); //오름차순정렬
	        
	        long max = 0;
	        for(int i = cnt-1; i >= 0; i--) {
	            arr[i] = arr[i] * (cnt-i);
	            //제일큰수부터 시작해서 *개수
	            max=Math.max(max, arr[i]);
	        }
	        
	        System.out.println(max);
	  	}
	}


