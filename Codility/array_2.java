// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set<Integer>set = new HashSet<Integer>();

        for(int i=0;i<A.length;i++)
        {
            if(set.contains(A[i]))
            {
                set.remove(A[i]);
            }
            else
            {
                set.add(A[i]);    
            }
        }
        return set.iterator().next();
    }
}
