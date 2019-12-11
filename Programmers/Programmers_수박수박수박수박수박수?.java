package Traning;
import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        
        String su = "수";
        String bak = "박";
        
        //처음에 수를 더해야 하므로 조건을 i%2!=0으로 한다.
        for(int i=1; i<=n; i++) {
            answer += i%2!=0 ? su : bak ;
        }
        
        return answer;
    }
  }