// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        if(Y<=X){return 0;}

        int res = ((Y-X)%D ==0)? ((Y-X)/D): ((Y-X)/D)+1;      
        return res;
    }
}
