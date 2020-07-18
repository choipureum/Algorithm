package algo;
import java.util.*;
import java.io.*;

public class Main {		
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size=board.length;
        //스택선언
        Stack<Integer> stack = new Stack<Integer>();
                
        //moves전체 회문
        for(int i=0;i<moves.length;i++){
        	int idx=0;
        	int picker=moves[i]-1;
        	//moves[i]하나씩 회문
        	while(true) {
        		if(board[idx][picker]!=0) {        			
        			stack.add(board[idx][picker]);
        			board[idx][picker]=0;
        			
        			if(stack.size()>1 && stack.get(stack.size()-1)==stack.get(stack.size()-2)) {
        				stack.pop();
        				stack.pop();
        				answer+=2; 
        				}
        			break;
        			}
        		else {
        			idx++;
        		}
        		if(idx==size) {
        			break;
        		}
        		}
        	
        	}
        return answer;
        }
	
	//문제풀이용 예시
	public static void main(String[] args) {
		int [][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int  [] moves= {1,5,3,5,1,2,1,4};
		System.out.println(solution(board,moves));		
	}
}








