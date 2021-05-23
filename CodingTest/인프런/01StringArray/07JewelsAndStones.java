import java.util.*;

public class JewelsAndStones {
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(solve(jewels,stones));
	}
	public static int solve(String jew, String stones) {
		//1 data Structure 
		Set<Character> set = new HashSet<Character>();
		for(char jewel : jew.toCharArray()) {
			set.add(jewel); //a, A
		}
		//2
		int cnt =0;
		for(char stone:stones.toCharArray()) {
			if(set.contains(stone)) {
				cnt++;
			}
		}	
		return cnt;
	}
	
	
}
