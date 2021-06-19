// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        int res =0;
        int [] arr = new int[A.length+1];

        for(int i=0;i<A.length;i++)
        {
            arr[A[i]-1]++;
        }
        int idx=0;
        while(true)
        {         
            if(arr[idx] ==0)
            {
                res = idx+1;
                break;
            }
            idx++;
        }

        return res;
    }
}
