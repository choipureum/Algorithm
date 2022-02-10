import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String s = "pweeklkogb";

        System.out.println(solution(s));
        //System.out.println(Arrays.toString(solution(matrix)));
        //System.out.println(Arrays.deepToString(solution(str)));
    }
    public static int solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l=0, r=0, couter=0,max=0;

        while(r<s.length()){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(l, map.get(c)+1);
            }
            map.put(c, r);
            r++;
            couter = r-l;
            max = Math.max(max, couter);
        }
        return max;
    }

}

