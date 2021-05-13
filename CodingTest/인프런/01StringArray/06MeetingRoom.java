import java.util.*;

public class MeetingRoom2 {
	
	//우선순위 큐(이진트리)
	public static void main(String[] args) {
		MeetingRoom2  m2 = new MeetingRoom2();
		ExInterval in1 = new ExInterval(0,30);
		ExInterval in2 = new ExInterval(4,9);
		ExInterval in3 = new ExInterval(10,16);
		ExInterval in4 = new ExInterval(5,15);
		
		ExInterval [] intervals = {in1,in2,in3,in4};
		System.out.println(m2.solve(intervals));
		
	}
	public int solve(ExInterval [] intervals) {
		if(intervals ==null || intervals.length ==0) return 0;
		//1 sorting(lambda)
		Arrays.sort(intervals, (a,b)-> a.start - b.start);
		
		//2 
		Queue<ExInterval> pq = new PriorityQueue<ExInterval>((ExInterval a, ExInterval b)->a.end-b.end);
		
		pq.offer(intervals[0]);
		
		//3
		for(int i=1;i<intervals.length;i++) {
			if(pq.peek().end <= intervals[i].start) { //회의실 필요 없음
				pq.poll();
			}
			
			pq.offer(intervals[i]); // 노드 넣기
		}
		
		
		return pq.size();	
	}
	
}

class ExInterval{
	int start;
	int end;
	
	ExInterval(){
		start=0;
		end=0;
	}
	ExInterval(int s,int e){
		start=s;
		end=e;
	}
}
