import java.util.*;

public class PlusOne {
  //Kth Largest Element In An Array
    //1  배열 오름차순 (간단)
    //2  PriorityQueue로
	 public static void main(String[] args) 
	  {
	      PlusOne a = new PlusOne();
	      int[] nums = {3,2,1,5,6,4};
	      int k = 2;
	      //1번 배열로 풀기
	      System.out.println(a.solve_arr(nums,k));
	      //2번 Priority Queue로 풀기
	      System.out.println(a.solve_pq(nums,k));
	  }
	  public int solve_arr(int [] nums,int k)
	  {
	      int length = nums.length; //6
	      Arrays.sort(nums);
	      return nums[length-k];     
	  }
	  public int solve_pq(int[]nums, int k)
	  {
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comp);
	    for(int val:nums)
	    {
	      pq.offer(val);
	      if(pq.size() > k)
	      {
	        pq.poll();
	      }
	    }
	    return pq.peek();
	  }
	  Comparator<Integer>Comp = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
	};
	 
}
