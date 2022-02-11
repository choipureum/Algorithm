import java.util.*;
import java.io.*;


public class Solution {
    static int n,m;
    static int count = 0;
    static int [][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        String input = "23";
        String[] digitletter = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.println(solution(input,digitletter));
    }
    public static List<String> solution(String input, String[] digitletter) {
        List<String> result = new ArrayList<>();
        if(input.length() == 0){
            return result;
        }
        result.add("");
        for(int i=0;i<input.length();i++){
            result = combine(result,digitletter[input.charAt(i)-'0']);
   
        }
        return result;
    }
    private static List<String> combine(List<String> result, String str){
        System.out.println(result.size());
        List<String> temp = new ArrayList<>();
        for(int i=0;i<result.size();i++){
            for(int j=0;j<str.length();j++){
                temp.add(result.get(i)+str.charAt(j));
            }
        }
        System.out.println(temp);
        return temp;
    }
}

