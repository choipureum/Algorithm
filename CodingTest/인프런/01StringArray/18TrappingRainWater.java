import java.util.*;

class Main {
  //Trapping Rain Water
  public static void main(String[] args) 
  {
    int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(solve(nums));
  }
  public static int solve(int [] height)
  {
    //1 ds
    int result=0;
    if(height == null ||height.length<=2)
    {
      return result;
    }
    int [] left = new int[height.length];
    int [] right = new int[height.length];

    //왼쪽 벽 만들기
    int max = height[0];
    left[0] = height[0];
    for(int i=1;i<height.length;i++){
      if(max < height[i])
      {
        max= height[i];
      }
      left[i] = max;
    }

    //오른쪽 벽 만들기
    max = height[height.length-1];
    right[height.length-1] = max;

    for(int i=height.length-2;i>=0;i--)
    {
      if(max< height[i])
      {
        max = height[i];     
      }
      right[i] = max;
    }

    for(int i=0;i<height.length;i++)
    {
      result+= Math.min(left[i],right[i]) - height[i];
    }

    return result;
  }

}


