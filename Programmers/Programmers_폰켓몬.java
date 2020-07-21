package algo;
import java.util.*;
import java.io.*;

public class Main {		
	public static int solution(int[] nums) {
        HashSet<Integer> poke = new HashSet<>();       
        for(int e:nums) {
        	poke.add(e);
        }       
        return poke.size()>=nums.length/2? nums.length/2 : poke.size();
    }
	
	//문제풀이용 예시
	public static void main(String[] args) {
		int [] nums = {3,1,2,3};
		int[] nums2={3,3,3,2,2,4};
	
		System.out.println(solution(nums));
		System.out.println(solution(nums2));
		
	}
}
