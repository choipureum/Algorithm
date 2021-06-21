// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<S.length();i++)
        {
            char idx = S.charAt(i);

            if(idx =='(')stack.push(idx);
            else // ')'
            {
                if(stack.size() <1)return 0;
                else
                {
                    if(stack.peek() == '(')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        }
        if(stack.size() ==0)return 1;
        else return 0;
        
    }
}
