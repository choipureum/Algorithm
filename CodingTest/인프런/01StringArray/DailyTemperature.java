import java.util.*;

/**
 * 
 * @author User
 * 
 */
public class DailyTemperature {

	public static void main(String[] args) {
		DailyTemperature a = new DailyTemperature();
		int [] nums = {73,74,75,71,69,72,76,73};
		int [] res = a.solve(nums);
		
		System.out.println("=== result ===");
		for(int i: res) {
			System.out.print(i+ " ");
		}
		
	}
	public int [] solve(int [] nums) {
		//1. ds
		Stack<Integer> stack = new Stack<Integer>();
		int [] result= new int[nums.length];
			
		//2.for, while algo
		for(int i=0;i<nums.length;i++) {
			System.out.println("nums "+i);
			while(!stack.isEmpty()&& nums[stack.peek()] < nums[i]) { 
				//73<74
				int index = stack.pop(); //peek() + remove()
				System.out.println("i"+i+" index"+index);
				result[index] = i-index;
			}			
			stack.push(i);
		}		
		return result;
	}
	
}
