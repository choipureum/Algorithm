package com.company;
import java.util.*;
import java.io.*;

public class Solution {
    // 위상정렬(Topological Sort)
    // Dag(Directed Acyclic Graph), i.e. there is no cycle existed in the graph
    // 순환 없는 계층적 정렬 -> 중요(기업에서)
    // 대표적문제 = Course Schedule
    public static void main(String[] args) {
        int course = 4;
        int [][] nums ={
                {1,0},
                {2,1},
                {3,2}
        };
        int [][] nums2={
                {1,0},
                {0,1}
        };
        System.out.println(solve(course,nums)+"\n"+solve(course,nums2));
    }
    private static boolean solve(int courseNumber, int[][] nums)
    {
        //error check
        if(courseNumber <=0)return false;

        //ds : inDegree 배열
        Queue<Integer> queue = new LinkedList<>();
        int [] inDegree = new int[courseNumber];

        //1-1 inDegree 완성
        int numsLength = nums.length;
        for(int i=0;i<numsLength;i++)
        {
            inDegree[nums[i][1]]++;
        }
        
        // 바깥에서 하는게 메모리적으로 빠르다
        int inDegreeLength = inDegree.length;
        //1-2 inDegree에서 0인값을 큐에 push  == > 3
        for(int i=0;i<inDegreeLength;i++)
        {
            if(inDegree[i]==0)
            {
                queue.offer(i);
            }
        }
        //
        while(!queue.isEmpty())
        {
            int firstZeroVal = queue.poll(); //3
            
            for(int i=0;i<numsLength;i++)
            {
                if(firstZeroVal == nums[i][0]) //2,0
                {
                    inDegree[nums[i][1]]--;
                    if(inDegree[nums[i][1]]==0)
                    {
                        queue.offer(nums[i][1]); //2
                    }
                }
            }
        }
        //4
        for(int i=0;i<inDegreeLength;i++)
        {
            if(inDegree[i]!=0)
            {
                return false;
            }
        }
        return true;
    }

}
