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
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if(arr == null || arr.length == 0){
            return answer;
        }
        dfs(arr,answer,list);
        return answer;
    }
    private static void dfs(int [] arr, List<List<Integer>> answer, List<Integer> list){
        if(list.size() == arr.length){
            answer.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<arr.length;i++){
            //1) 중복 포함 전체 조합
            //if(list.size() == arr.length){
            //    continue;
            //}
            //2) 중복 미포함 전체 조합
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
            dfs(arr,answer,list);
            list.remove(list.size()-1);
        }
    }
}

