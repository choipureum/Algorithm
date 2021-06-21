// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int max = (A.length/2)+1;
        Map<Integer,Integer>map = new HashMap<>();
        if(A.length ==1 )return 0;
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i])) //키 중복
            {
                map.put(A[i],map.get(A[i])+1);
                if(map.get(A[i])>= max)
                {
                    return i;
                }              
            }
            else
            {
                map.put(A[i],1);
            }
        }
        return -1;
    }
}
