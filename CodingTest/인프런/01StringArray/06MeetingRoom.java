import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {2,8,11,14};
        int [][] integer = {{5,10},{16,20},{0,30}};
        int target = 16;

        System.out.println(solution(integer));
    }
    public static int solution(int[][] integer){
        Arrays.sort(integer, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        Queue <int[]> q = new PriorityQueue<int[]>((a,b)->a[1]-b[1]);
        q.offer(integer[0]);
        for(int i=1;i<integer.length;i++){
            if(q.peek()[1]<integer[i][0]){
                q.poll();     
            }
            q.offer(integer[i]);
        }

        return q.size();
    }
        
}

