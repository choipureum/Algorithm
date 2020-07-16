package algo;
import java.util.*;
import java.io.*;

public class Main {		
	 public static int solution(int m, int n, String[] board) {		
		 int point=0;
		 String [][] bo = new String[m][n];
		 boolean[][] chkBlock= new boolean[m][n];
		 
		 //2차원 배열에 새로담기
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 bo[i][j]=board[i].charAt(j)+"";
			 }
		 }	
//		 for(String[] e:bo) {
//			 System.out.println(Arrays.toString(e));
//		 }
		 System.out.println("--------------");
		 //2*2 배열 체크하고 제거과정반복(없을때까지)
		 while(true) {
			 chkBlock=new boolean[m][n];
			 int chkPt=PointBomb(m,n,bo,chkBlock);
			 if(chkPt==0) {
				 break;
			 }
			 point+=chkPt;	
			 //비워진 곳을 내려주는 작업
			 downBlock(m,n,bo);
			 
//			 for(String[] e:bo) {
//				 System.out.println(Arrays.toString(e));
//			 }
//			 System.out.println();
			 
		 }	 
		 return point;
	     
	    }
	 
	 //2*2 체크하고 제거
	public static int PointBomb(int m,int n,String[][]bo,boolean [][] chkBlock) {
		int res=0;
			
		//2*2 체크 중복
		for(int i=0;i<m-1;i++) {
			int idx=0;
			for(int j=idx;j<n-1;j++) {
				if((!bo[i][idx].equals("*")) && (bo[i][idx].equals(bo[i][idx+1]) && bo[i][idx].equals(bo[i][idx+1]) 
						&& bo[i][idx].equals(bo[i+1][idx]) && bo[i][idx].equals(bo[i+1][idx+1]))) {
					chkBlock[i][idx]=true;
					chkBlock[i][idx+1]=true;
					chkBlock[i+1][idx]=true;
					chkBlock[i+1][idx+1]=true;					 
				}			
				idx++;				
			}
		}		
		//제거
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(chkBlock[i][j]==true) {
					bo[i][j]="*";
					res+=1;
				}
			}
		}
//		 for(String[] e:bo) {
//			 System.out.println(Arrays.toString(e));
//		 }
//		 System.out.println("---------------");
//		 
		return res;
	}
	
	//블럭을 내려주는 함수
	public static void downBlock(int m,int n,String[][]bo) {
		int idx=0;
		
		for(int i=m-1;i>=1;i--) {
			for(int j=0;j<n;j++) {
				idx=i;
				int cnt=0;

				while(true) {
					if(idx<1 && cnt==0) {
						break;
					}
					else if(idx<1 && cnt!=0) {
						idx=i;
						cnt=0;
					}
					else if(bo[i][j].equals("*") && !bo[idx-1][j].equals("*")) {
						//바꾼다
						String tmp =bo[idx][j];
						bo[idx][j]=bo[idx-1][j];
						bo[idx-1][j]=tmp;
						cnt++;
					}
					else {
						idx--;	
					}
					
				}				
			}
		}	
	}
	//문제풀이용 예시
	public static void main(String[] args) {
		String [] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		int m=4;
		int n=5;
		int result=solution(m,n,board);
//		System.out.println(result);
		
	}
}
