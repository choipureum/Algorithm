package Traning;
import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++){

            int beginIndex = (commands[i][0])-1;
            int endIndex = commands[i][1];
            int k = (commands[i][2])-1;
            System.out.println("beginIndex : "+beginIndex);
            System.out.println("endIndex : "+endIndex);
            System.out.println("k의 값 : "+k);

            //시작index, 끝index 기준으로 자른 배열 복사하기
            int temp[] = Arrays.copyOfRange(array, beginIndex, endIndex);

            //복사된 배열 오름차순으로 정렬
            Arrays.sort(temp);

            //k번째 배열 answer 배열에 담기
            answer[i] = temp[k];
        }
        return answer;
    }
}

	
