import java.util.*;
import java.io.*;

//근처에 있는거 부터 찾는 알고리즘 : BFS - 다익스트라
//깊이 우선 탐색 : DFS : 알파고
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
    }
}

public class Solution {
    static int n,m;
    static int count = 0;
    static int [][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        int [] input = {1,2,3};
        System.out.println(solution(input));
    }
    public static List<List<Integer>> solution(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(arr,result,list,0);
        return result;
    }
    private static void dfs(int [] arr, List<List<Integer>> result, List<Integer> list, int start){
     
        result.add(new ArrayList<>(list));
               
        for(int i=start;i<arr.length;i++){
            if(list.contains(arr[i])) continue;
            list.add(arr[i]);
            dfs(arr,result,list,start+1);
            list.remove(list.size()-1);
        }
    }

}

