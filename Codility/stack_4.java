// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        Stack<Integer>stack = new Stack<>();
        int cnt =0;
        for(int i=0;i<H.length;i++) //같으면 넘김
        {
            while(stack.size()>0 && stack.peek()>H[i])
            {
                stack.pop();  
            }
            if(stack.size() ==0 || stack.peek()<H[i])
            {
                stack.push(H[i]);
                cnt++;
            }

        }
        return cnt;
    }
}
