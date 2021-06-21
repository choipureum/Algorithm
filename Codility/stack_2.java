// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
 // write your code in Java SE 8
        int result = 0;
        int max = 0;
        Stack<Integer> downFishStack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                //왼쪽으로 가는방향인데 오른쪽으로 가는 방향이 없을경우
                if (downFishStack.isEmpty()) {
                    result++;
                }
                //왼쪽으로 가는애인데 오른쪽으로 가는 방향이 있었을 경우
                else {
                    // 오른쪽방향의 max값보다 왼쪽방향의 값이 클경우 오른쪽 방향 값들은 모두 삭제
                    while (!downFishStack.empty() && downFishStack.peek() < A[i]) {
                        downFishStack.pop();
                    }
                    if (downFishStack.empty()) {
                        result++;
                    }
                }
            } else if (B[i] == 1) {
                downFishStack.push(A[i]);
            }
        }

        return result + downFishStack.size();
    }
}
