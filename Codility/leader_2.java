// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) 
    {
        int max = 0;
        int leader = 0;
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i])) //키 중복
            {
                map.put(A[i],map.get(A[i])+1);
                if(map.get(A[i])>= max)
                {
                    max = map.get(A[i])+1;
                    leader = A[i];
                }              
            }
            else
            {
                map.put(A[i],1);
            }
        }
        if(max == 0) return 0;
        int [] counter = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == leader)
            {
                counter[i]=1;
            }
        }
        int res =0;
        int lfCnt =0;
        int rfCnt =A.length;
        int lfSum =0;
        int rfSum =map.get(leader);
        for(int i=0;i<A.length;i++)
        {
            lfSum+=counter[i];
            rfSum-=counter[i];
            lfCnt++;
            rfCnt--;
            if(lfSum >(lfCnt/2) && rfSum >(rfCnt/2))
            {
                res++;
            }
        }
        return res;
    }
}
