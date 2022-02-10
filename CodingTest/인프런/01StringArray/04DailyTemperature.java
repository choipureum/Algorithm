import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(solution(nums)));
    }
    public static int[] solution(int[] nums){
        //ds
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        //for
        for(int i=0;i<nums.length;i++){
            //while
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
        
}

