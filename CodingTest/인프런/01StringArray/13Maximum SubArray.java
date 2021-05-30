import java.util.*;

class Main {
  //Maximum Subarray
  public static void main(String[] args) 
  {
    int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
  }
  public static int maxSubArray(int[] nums)
  {
    //1 ds
    int newSum = nums[0];
    int max=nums[0]; //-2

    //2
    for(int i=1;i<nums.length;i++)
    {
      newSum = Math.max(nums[i], newSum+nums[i]);
      max = Math.max(newSum,max);
    }
    return max;
  }
  
 
}


