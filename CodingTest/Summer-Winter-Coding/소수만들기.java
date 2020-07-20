package algo;
import java.util.*;
import java.io.*;

public class Main {		
	public static int solution(int[] nums) {
        int answer = 0;
        //에라스토테네스의 체
        boolean [] era = new boolean[3001];
        //모든 소수 =false 소수가 아닌수 =true
        for(int i=2;i<Math.sqrt(3001);i++) {            
            if(!(era[i])) {
                for(int j=2;i*j<3001;j++) {
                    era[i*j]=true;
                }
            }
        }
        //합
        for(int x = 0 ; x < nums.length-2 ; x++){
            for(int y = x+1 ; y < nums.length-1 ; y++){
                for(int z = y+1 ; z < nums.length ; z++){
                    if(!era[nums[x] + nums[y] + nums[z]]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
	
	//문제풀이용 예시
	public static void main(String[] args) {
		int [] nums= {1,2,7,6,4};
		System.out.println(solution(nums));
	}
}



