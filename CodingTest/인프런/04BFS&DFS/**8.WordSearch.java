import java.util.*;
import java.lang.*;
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
        char[][] grid ={
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
        };
        String word = "DECC";
        System.out.println(solution(grid,word));
    }
    public static boolean solution(char[][] grid, String word){
        if(grid.length == 0 || grid == null) return false;
        n= grid.length;
        m= grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == word.charAt(0)){
                    if(dfs(grid,word,visited,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] grid, String word, boolean[][] visited, int x, int y, int idx){
        if(idx == word.length()) return true;
        if(x<0 || x>=n || y<0 || y>=m || visited[x][y] || grid[x][y] != word.charAt(idx)) return false;
        visited[x][y] = true;
        for(int i=0;i<4;i++){
            if(dfs(grid,word,visited,x+dirs[i][0],y+dirs[i][1],idx+1)) return true;
        }
        visited[x][y] = false;
        return false;
    }

}

