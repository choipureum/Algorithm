package Traning;
import java.util.*;



public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int current=10; //조건이 0~9까지이므로 10이면 무조건 밑에 if문 만족!
        for(int i=0; i<arr.length; i++){
            if(arr[i] != current){
                list.add(arr[i]);
                current = arr[i];
            }            
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
	
