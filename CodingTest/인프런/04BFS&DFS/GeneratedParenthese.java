import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    static int n,m;
    static int count = 0;
    static int [][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        int input = 3;
        System.out.println(solution(input));
    }
    public static List<String> solution(int n){
        List<String> res = new ArrayList<>();
        dfs(res,"",n,n,"");
        return res;
    }
    private static void dfs(List<String> res, String str, int left, int right, String str1){

        if(left <0 || left > right){
            return;
        }
        if(left == 0 && right == 0){
            res.add(str);
            return;
        }
        dfs(res, str+'(', left-1, right, str1+"+");
        dfs(res, str+')', left, right-1, str1+"-");
    }

}

