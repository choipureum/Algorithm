import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //System.out.println(solution(nums));
        //System.out.println(Arrays.toString(solution(nums)));
        System.out.println(Arrays.deepToString(solution(str)));
    }
    public static String[][] solution(String[] nums){
        Map<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            char [] ch = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(nums[i]);
        }
        return map.values().stream().map(x->x.toArray(new String[x.size()])).toArray(String[][]::new);
    }
        
}

