package algo;
import java.util.*;

class Main {  
   public static void main(String[] args) {
	    int [] numbers= {3, 30, 34, 5, 9};
	    int [] numbers2= {6, 10, 2}; 
	    int [] numbers3 = {0,0,0,0};
	    System.out.println(solution(numbers));
	    System.out.println(solution(numbers2));
	    System.out.println(solution(numbers3));
   }
   
   public static String solution(int[] numbers) {
       String answer = "";
       String [] arr = new String[numbers.length];
       for(int i=0;i<numbers.length;i++) {
    	   arr[i]=String.valueOf(numbers[i]);
       }
       Arrays.sort(arr,new Comparator<String>() {
    	   public int compare(String o1, String o2) {   		  
    		   return (o2+o1).compareTo(o1+o2);		   
    	   };
       });
       if(arr[0].equals("0")) {
    	   answer="0";
       }
       else {
    	   answer=String.join("", arr);
       }       
       return answer;
   }
}


