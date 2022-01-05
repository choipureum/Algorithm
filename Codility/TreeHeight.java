// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(Tree T) {
        return recrusiveTree(T)-1;
    }
    private int recrusiveTree(Tree T){
        if (T == null) {
            return 0;
        }
        return 1 + Math.max(recrusiveTree(T.l), recrusiveTree(T.r)); 
    }
}
